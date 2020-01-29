package java;

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.dao.LivroDao;
import br.uem.din.bibliotec.config.dao.UsuarioDao;
import br.uem.din.bibliotec.config.model.Livro;
import br.uem.din.bibliotec.config.model.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestUsuarioController {

    private UsuarioDao usuarioDao = new UsuarioDao();

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        try {
            //abre conexão com banco de dados
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            con.conexao.setAutoCommit(true);

            //validando se o livro possui alguma reserva ou empréstimos em vigor
            st.execute("delete from usuario where titulo = 'Nome de Teste'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCadastroLivro() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        int retorno = 0;

        try {
            retorno = usuarioDao.cadastrarUsuario(usuario);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(1, retorno);
    }


    @Test
    void testConsultaLivro() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Nome de Teste", resultado.get(0).getNome());
        assertEquals("email@teste.com", resultado.get(0).getEmail());
    }

    @Test
    void testDeleteLivro() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Nome de Teste", resultado.get(0).getNome());
        assertEquals("email@teste.com", resultado.get(0).getEmail());
    }

    @Test
    void testUpdateLivro() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Nome de Teste", resultado.get(0).getNome());
        assertEquals("email@teste.com", resultado.get(0).getEmail());
    }

    @Test
    void testControle() {
        assertEquals(2, 2);
    }
}