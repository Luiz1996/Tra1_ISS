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
            st.execute("delete from usuarios where nome = 'Nome de Teste'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCadastroUsuario() {
        Usuario usuario = Usuario.factory();
        usuario.setDatanasc("10/01/1992");
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        usuario.setCpf("081.012.039-90");
        usuario.setRg("12.391.690-5");
        int retorno = 0;

        try {
            retorno = usuarioDao.cadastrarUsuario(usuario);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(1, retorno);
    }


    @Test
    void testConsultaUsuario() {
        Usuario usuario = Usuario.factory();
        usuario.setDatanasc("10/01/1992");
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        usuario.setCpf("081.012.039-90");
        usuario.setRg("12.391.690-5");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(4, resultado.size());
        assertEquals("Nome de Teste", resultado.get(3).getNome());
        assertEquals("email@teste.com", resultado.get(3).getEmail());
    }

    @Test
    void testDeleteUsuario() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        usuario.setDatanasc("10/01/1992");
        usuario.setCpf("081.012.039-90");
        usuario.setRg("12.391.690-5");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(4, resultado.size());
        assertEquals("Nome de Teste", resultado.get(3).getNome());
        assertEquals("email@teste.com", resultado.get(3).getEmail());
    }

    @Test
    void testUpdateUsuario() {
        Usuario usuario = Usuario.factory();
        usuario.setNome("Nome de Teste");
        usuario.setEmail("email@teste.com");
        usuario.setDatanasc("10/01/1992");
        usuario.setCpf("081.012.039-90");
        usuario.setRg("12.391.690-5");
        List<Usuario> resultado = new ArrayList<>();
        try {
            usuarioDao.cadastrarUsuario(usuario);
            resultado = usuarioDao.consultarUsuarioBalconista(usuario, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        assertEquals(4, resultado.size());
        assertEquals("Nome de Teste", resultado.get(3).getNome());
        assertEquals("email@teste.com", resultado.get(3).getEmail());
    }

    @Test
    void testControle() {
        assertEquals(2, 2);
    }
}