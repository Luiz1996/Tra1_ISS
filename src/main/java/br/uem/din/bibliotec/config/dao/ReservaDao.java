package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.model.Livro;
import br.uem.din.bibliotec.config.model.Reserva;
import br.uem.din.bibliotec.config.model.Usuario;
import br.uem.din.bibliotec.config.services.FormataData;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReservaDao {
    private Livro livroObserver = new Livro();
    private Usuario usuarioObserver = new Usuario(livroObserver);
    private FormataData dtFormat = new FormataData();
    private final String SUCESSO = "green";
    private final String FALHA = "red";

    public List<Reserva> consultarReserva(Reserva reserva) {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        String usuarioLogado = (String) session.getAttribute("usuario");
        List<Reserva> minhasReservas = new ArrayList<>();

        try{
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            con.conexao.setAutoCommit(true);
            ResultSet rs = null;

            st.execute( "select\n" +
                            "\tr.codreserva,\n" +
                            "    r.datacad,\n" +
                            "    r.datares,\n" +
                            "    l.titulo,\n" +
                            "    l.autor,\n" +
                            "    l.editora\n" +
                            "from\n" +
                            "\treserva  r\n" +
                            "inner join\n" +
                            "\tusuarios u on u.codusuario = r.codusuario\n" +
                            "inner join\n" +
                            "\tlivro    l on l.codlivro = r.codlivro\t\n" +
                            "where\n" +
                            "\tr.ativo = '1' and\n" +
                            "    u.usuario = '"+usuarioLogado+"'\n" +
                            "order by\n" +
                            "\tl.titulo;");

            rs = st.getResultSet();

            while(rs.next()){
                Reserva reservaTemp = new Reserva(rs.getInt("codreserva"),
                                                  dtFormat.formatadorDatasBrasil(rs.getString("datacad")),
                                                  dtFormat.formatadorDatasBrasil(rs.getString("datares")),
                                                  rs.getString("titulo"),
                                                  rs.getString("autor"),
                                                  rs.getString("editora"));

                minhasReservas.add(reservaTemp);
            }

            st.close();
            rs.close();
            con.conexao.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            reserva.setColorMsgRetorno(FALHA);
            reserva.setMsgRetorno("FALHA: Ocorreu uma falha ao consultar as reservas, contacte o administrador.");
        }
        return minhasReservas;
    }

}
