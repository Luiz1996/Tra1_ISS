package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.dao.EmprestimoDao;
import br.uem.din.bibliotec.config.dao.ReservaDao;
import br.uem.din.bibliotec.config.dao.UsuarioDao;
import br.uem.din.bibliotec.config.model.Reserva;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

@Named
@SessionScoped
public class ReservaController implements Serializable {
    private Reserva reserva = new Reserva();
    private ReservaDao reservaDao = new ReservaDao();
    private UsuarioDao usuarioDao = new UsuarioDao();
    private EmprestimoDao emprestimoDao = new EmprestimoDao();
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

    public List<Reserva> consultarReserva(){
        return reservaDao.consultarReserva(reserva);
    }

}
