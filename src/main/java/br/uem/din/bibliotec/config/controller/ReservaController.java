package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.dao.EmprestimoDao;
import br.uem.din.bibliotec.config.dao.MultaDao;
import br.uem.din.bibliotec.config.dao.ReservaDao;
import br.uem.din.bibliotec.config.dao.UsuarioDao;
import br.uem.din.bibliotec.config.model.Reserva;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;

@Named
@SessionScoped
public class ReservaController implements Serializable {
    private Reserva reserva = new Reserva();
    private ReservaDao reservaDao = new ReservaDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private EmprestimoDao emprestimoDao = new EmprestimoDao();
    private MultaDao multaDao = new MultaDao();
    private final String SUCESSO = "green";
    private final String FALHA = "red";

    public ReservaController(){}

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ReservaDao getReservaDao() {
        return reservaDao;
    }

    public void setReservaDao(ReservaDao reservaDao) {
        this.reservaDao = reservaDao;
    }

    public UsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public EmprestimoDao getEmprestimoDao() {
        return emprestimoDao;
    }

    public void setEmprestimoDao(EmprestimoDao emprestimoDao) {
        this.emprestimoDao = emprestimoDao;
    }

    public MultaDao getMultaDao() {
        return multaDao;
    }

    public void setMultaDao(MultaDao multaDao) {
        this.multaDao = multaDao;
    }

    public String cadastrarReserva(int codUsuario) throws SQLException {
        reserva.setCodUsuario(codUsuario);

        if(multaDao.valorTotalMultas(codUsuario) > 0.0){
            reserva.setMsgRetorno("FALHA: Usuários com multas não podem efetuar reservas de livros.");
            reserva.setColorMsgRetorno(FALHA);
        }else{
            if(reservaDao.livroJaReservadoUsuarioLogado(reserva) > 0){
                reserva.setMsgRetorno("FALHA: Este livro já está reservado para você.");
                reserva.setColorMsgRetorno(FALHA);
            }else{
                if(emprestimoDao.consultarEmpAtrasados(reserva.getCodUsuario()) > 0){
                    reserva.setMsgRetorno("FALHA: Você possui empréstimo(s) em atraso(s), reserva cancelada.");
                    reserva.setColorMsgRetorno(FALHA);
                }else {
                        reservaDao.cadastrarReserva(reserva);
                        reserva.setMsgRetorno("SUCESSO: A reserva foi efetuada com sucesso, você receberá um e-mail quando o livro estiver disponível.");
                        reserva.setColorMsgRetorno(SUCESSO);
                }
            }
        }
        return usuarioDao.homePage();
    }

    public int consultarReserva(){
        return reservaDao.consultarReserva(reserva);
    }

    public String deletarReserva(){
        reservaDao.cancelarReserva(reserva);
        if(reserva.getCodLivro() != 0){
            reserva.setMsgRetorno("SUCESSO: A reserva escolhida foi cancelada com sucesso.");
            reserva.setColorMsgRetorno(SUCESSO);
        }else{
            reserva.setColorMsgRetorno(FALHA);
            reserva.setMsgRetorno("FALHA: Ocorreu uma falha ao deletar a reserva, contacte o administrador.");
        }
        return usuarioDao.homePage();
    }
}
