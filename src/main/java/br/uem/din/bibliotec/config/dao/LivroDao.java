package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.model.Livro;
import br.uem.din.bibliotec.config.services.Email;
import br.uem.din.bibliotec.config.services.FormataData;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LivroDao {
    private Email email = new Email();
    private FormataData dtFormat = new FormataData();


    //método de cadastramento de livro
    public int cadastrarLivro(Livro livro) throws SQLException {
        String query = "INSERT INTO `bibliotec`.`livro` (`codcatalogacao`," +
                " `numchamada`, `titulo`, `autor`, `editora`, `anolancamento`, " +
                "`cidade`, `volume`, `ativo`, `datacad`, `disponibilidade`) " +
                "VALUES ('" + livro.getCodcatalogacao() + "', '" + livro.getNumchamada() + "', '"
                + livro.getTitulo() + "', '" + livro.getAutor() + "', '" + livro.getEditora() + "', '"
                + livro.getAnolancamento() + "', '" + livro.getCidade() + "', "
                + livro.getVolume() + ", '1', current_date(), '1');";
        if (Dao.getInstance().runQueryC(query)) {
            return 1;
        } else {
            return 0;
        }
    }


    public List<Livro> consultarLivro(Livro livro, int soDisponiveis) throws SQLException {
        //setando os valores obtidos no front-end para realizar busca no banco de dados
        livro.setEditora(livro.getTitulo());
        livro.setAutor(livro.getTitulo());

        //busca todas as informações de acordo com os dados fornecidos
        String query = "select * from `bibliotec`.`livro` where (titulo like \"%" +
                livro.getTitulo() + "%\" or autor like \"%" +
                livro.getAutor() + "%\" or editora like \"%" +
                livro.getEditora() + "%\") and ativo = '1'";
        if (soDisponiveis == 0) {
            return Dao.getInstance().runQueryGetLivro(query +
                            " order by 2 ;",
                    false);
        } else {
            return Dao.getInstance().runQueryGetLivro(query +
                            " and disponibilidade = '1'  order by 1 ;",
                    false);
        }
    }

    public List<Livro> consultarLivroBibliotecario(Livro livro, int ativo) throws SQLException {

        if (ativo == 0) {
            String query = "select l.codlivro, l.codcatalogacao, l.numchamada, l.titulo, l.autor, l.editora," +
                    " l.anolancamento, l.cidade, l.volume, l.ativo, case when l.ativo = 1 then \" Ativo \" else " +
                    "\" Inativo \" end as status, datacad, dataalt, case when disponibilidade = 1 then \" Sim \" " +
                    "when disponibilidade = 0 then \" Não \" end as disponibilidade  from livro l where (l.titulo " +
                    "like \"%" + livro.getBusca().trim() + "%\" or l.autor like \"%" + livro.getBusca().trim() +
                    "%\" or l.editora like \"%" + livro.getBusca().trim() + "%\") order by 1 ;";
            return Dao.getInstance().runQueryGetLivro(query, true);
        } else {
            String query = "select l.codlivro, l.codcatalogacao, l.numchamada, l.titulo, l.autor," +
                    " l.editora, l.anolancamento, l.cidade, l.volume, l.ativo, case when l.ativo = 1 " +
                    "then \" Ativo \" else \" Inativo \" end as status, datacad, dataalt, case when " +
                    "disponibilidade = 1 then \" Sim \" when disponibilidade = 0 then \" Não \" end " +
                    "as disponibilidade  from livro l where ativo = '1' order by 4 ;";
            return Dao.getInstance().runQueryGetLivro(query, true);
        }
    }

    public int deletarLivro(Livro livro) {
        String query = "SELECT \n" +
                "    COALESCE(l.usuarios, 0) AS ha_reserva,\n" +
                "    COALESCE(MAX(e.ativo),0) AS ha_emp\n" +
                "FROM\n" +
                "    livro l\n" +
                "LEFT JOIN\n" +
                "    emprestimo e ON e.codlivro = l.codlivro\n" +
                "WHERE\n" +
                "    l.codlivro = '" + livro.getCodlivro() + "';";
        System.out.println(query);
        return Dao.getInstance().runQueryR(query, livro.getCodlivro());
    }

    public int editarLivro(Livro livro) {
//        Integer codlivro = 0;
//
//            String query = "SELECT \n" +
//                    "    COALESCE(l.codlivro, 0) AS codlivro\n" +
//                    "FROM\n" +
//                    "    livro l\n" +
//                    "WHERE\n" +
//                    "    l.codlivro = '" + livro.getCodlivro() + "';";
//
//

//            while (rs.next()) {
//                codlivro = rs.getInt("codlivro");
//            }
//
//            //valida se o código do livro não foi fornecido ou se foi fornecido um código inválido
//            if (codlivro == 0) {
//                return -1;
//            }

        String query = "UPDATE `bibliotec`.`livro` \n" +
                "SET \n" +
                "    `codcatalogacao` = '" + livro.getCodcatalogacao().trim() + "',\n" +
                "    `numchamada` = '" + livro.getNumchamada().trim() + "',\n" +
                "    `titulo` = '" + livro.getTitulo().trim() + "',\n" +
                "    `autor` = '" + livro.getAutor().trim() + "',\n" +
                "    `editora` = '" + livro.getEditora().trim() + "',\n" +
                "    `anolancamento` = '" + livro.getAnolancamento().trim() + "',\n" +
                "    `cidade` = '" + livro.getCidade().trim() + "',\n" +
                "    `volume` = '" + livro.getVolume() + "',\n" +
                "    `ativo` = '" + livro.getAtivo() + "',\n" +
                "    `dataalt` = current_date(),\n" +
                "    `disponibilidade` = '" + livro.getDisponibilidade().trim() + "'\n" +
                "WHERE\n" +
                "    (`codlivro` = '" + livro.getCodlivro() + "');";

        if (Dao.getInstance().runQueryU(query) == 1) {

            return 1;
        } else {
            return 0;
        }
    }




    public List<Livro> consultaLivrosDisponiveis(Livro livro) throws SQLException {
        List<Livro> livros = new ArrayList<Livro>();

        try {
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            con.conexao.setAutoCommit(true);
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //busca todas as informações de acordo com os dados fornecidos
            st.execute("SELECT * FROM `bibliotec`.`livro` l WHERE l.ativo = '1' and l.disponibilidade = '1';");
            ResultSet rs = st.getResultSet();

            //obtendo os valores carregados no result set e carregado no arrayList
            while (rs.next()) {
                Livro livros_temp = new Livro(
                        rs.getInt("codlivro"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("editora"),
                        rs.getString("anolancamento"),
                        rs.getString("codcatalogacao")
                );
                livros.add(livros_temp);
            }

            st.close();
            rs.close();
            con.conexao.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return livros;
    }

    public int carregarDadosLivro(Livro livro) {
        try {
            //realiza conexão com banco de dados
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            con.conexao.setAutoCommit(true);

            st.execute("SELECT L.* FROM `bibliotec`.`livro` L WHERE L.CODLIVRO = '" + livro.getCodlivro() + "';");
            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                livro.setTitulo(rs.getString("titulo").trim());
                livro.setAutor(rs.getString("autor").trim());
                livro.setEditora(rs.getString("editora").trim());
                livro.setAnolancamento(rs.getString("anolancamento").trim());
                livro.setCidade(rs.getString("cidade").trim());
                livro.setVolume(rs.getInt("volume"));
                livro.setCodcatalogacao(rs.getString("codcatalogacao").trim());
                livro.setNumchamada(rs.getString("numchamada").trim());
                livro.setAtivo(rs.getInt("ativo"));
                livro.setDisponibilidade(rs.getString("disponibilidade").trim());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }

}