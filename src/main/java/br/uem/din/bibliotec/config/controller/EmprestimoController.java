package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.dao.EmprestimoDao;
import br.uem.din.bibliotec.config.dao.MultaDao;
import br.uem.din.bibliotec.config.dao.ReservaDao;
import br.uem.din.bibliotec.config.dao.UsuarioDao;
import br.uem.din.bibliotec.config.model.Emprestimo;
import br.uem.din.bibliotec.config.model.Reserva;
import br.uem.din.bibliotec.config.services.FormataData;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

@Named
@SessionScoped
public class EmprestimoController implements Serializable {
    private Emprestimo emprestimo = new Emprestimo();
    private Reserva reserva = new Reserva();
    private FormataData dtFormat = new FormataData();
    private EmprestimoDao emprestimoDao = new EmprestimoDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private ReservaDao reservaDao = new ReservaDao();
    private MultaDao multaDao = new MultaDao();
    private final String FALHA = "red";
    private final String SUCESSO = "green";

    public EmprestimoController() {
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public EmprestimoDao getEmprestimoDao() {
        return emprestimoDao;
    }

    public void setEmprestimoDao(EmprestimoDao emprestimoDao) {
        this.emprestimoDao = emprestimoDao;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public String getFALHA() {
        return FALHA;
    }

    public String getSUCESSO() {
        return SUCESSO;
    }

    public int consultaQtdeEmpAtrasados() {
        return emprestimoDao.consultarMeusEmpAtrasados(emprestimo);
    }

    public List<Emprestimo> consultarMeusEmprestimos() throws SQLException {
        return emprestimoDao.meusEmprestimos(emprestimo);
    }

    public List<Emprestimo> consultaEmprestimos() {
        return emprestimoDao.consultarEmprestimos(emprestimo);
    }

    public List<Emprestimo> consultaEmprestimosEmVigor() {
        return emprestimoDao.consultarEmprestimosAtivos(emprestimo);
    }

    public String cadastrarEmprestimo() throws SQLException {
        reserva.setCodLivro(emprestimo.getCodLivro());

        if(multaDao.valorTotalMultas(emprestimo.getCodUsuario()) > 0.0){
            emprestimo.setMsgRetorno("FALHA: Este usuário possui multas a serem quitadas.");
            emprestimo.setColorMsgRetorno(FALHA);
        }else{
            if (emprestimoDao.consultarEmpAtrasados(emprestimo.getCodUsuario()) > 0) {
                emprestimo.setMsgRetorno("FALHA: Este usuário possui empréstimos em atraso.");
                emprestimo.setColorMsgRetorno(FALHA);
            } else {
                if (reservaDao.livroJaReservadoQualquerUsuario(reserva) > 0) {
                    if (emprestimo.getCodUsuario() == reservaDao.obterDadosReserva(reserva)) {
                        reservaDao.cancelarReserva(reserva);
                        emprestimoDao.cadastrarEmprestimo(emprestimo);
                        emprestimo.setMsgRetorno("SUCESSO: O empréstimo foi efetuado com sucesso.");
                        emprestimo.setColorMsgRetorno(SUCESSO);
                    } else {
                        emprestimo.setMsgRetorno("FALHA: O livro encontra-se reservado para outro usuário.");
                        emprestimo.setColorMsgRetorno(FALHA);
                    }
                } else {
                    emprestimoDao.cadastrarEmprestimo(emprestimo);
                    emprestimo.setMsgRetorno("SUCESSO: O empréstimo foi efetuado com sucesso.");
                    emprestimo.setColorMsgRetorno(SUCESSO);
                }
            }
        }
        return usuarioDao.homePage();
    }

    public String renovarEmprestimo() throws ParseException {
        reserva.setCodLivro(emprestimo.getCodLivro());

        if(reservaDao.livroJaReservadoQualquerUsuario(reserva) > 0){
            emprestimo.setMsgRetorno("FALHA: O livro encontra-se reservado para outro usuário, não é possível renovar o empréstimo.");
            emprestimo.setColorMsgRetorno(FALHA);
        }else{
            if(dtFormat.validaDatas(dtFormat.formatadorDatasMySQL(emprestimo.getDataDev())) < 0){
                emprestimo.setMsgRetorno("FALHA: A data de devolução informada é inválida.");
                emprestimo.setColorMsgRetorno(FALHA);
            }else{
                emprestimoDao.renovarEmprestimo(emprestimo);
                emprestimo.setMsgRetorno("SUCESSO: O empréstimo foi renovado com sucesso, a nova data de entrega pode sem vista clicando em 'Meus Empréstimos'.");
                emprestimo.setColorMsgRetorno(SUCESSO);
            }
        }
        return usuarioDao.homePage();
    }

    public String devolverLivro(){



        return usuarioDao.homePage();
    }
}