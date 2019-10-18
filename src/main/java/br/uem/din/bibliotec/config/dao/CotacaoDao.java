package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.model.Cotacao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CotacaoDao {
    public void cadastrarCotacao(Cotacao cotacao) {
        System.out.println("fazer insert aqui");
    }

    public double consultarCotacaoEmVigor(Cotacao cotacao) {
        try{
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs;

            st.execute( "SELECT \n" +
                    "    MAX(codcotacao) \t as cotVigor, \n" +
                    "    COALESCE(valor, 0.0) as valor\n" +
                    "FROM\n" +
                    "    cotacao\n" +
                    "WHERE\n" +
                    "    ativo = '1';");

            rs = st.getResultSet();

            while(rs.next()){
                cotacao.setCodcotacao(rs.getInt("cotVigor"));
                cotacao.setValor(rs.getDouble("valor"));
            }

            st.close();
            rs.close();
            con.conexao.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            cotacao.setMsgRetorno("FALHA: Ocorreu uma falha ao consultar cotação em vigor, contacte o administrador.");
            cotacao.setColorMsgRetorno("red");
        }
        return cotacao.getValor();
    }
}
