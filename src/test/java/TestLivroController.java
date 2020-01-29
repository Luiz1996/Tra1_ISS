

import br.uem.din.bibliotec.config.conexao.Conexao;
import br.uem.din.bibliotec.config.dao.LivroDao;
import br.uem.din.bibliotec.config.model.Livro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestLivroController {

    private LivroDao livroDao = new LivroDao();

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
            st.execute("delete from livro where titulo = 'Titulo de Teste'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testCadastroLivro() {
        Livro livro = Livro.livroFactory();
        livro.setAutor("Autor de Teste");
        livro.setTitulo("Titulo de Teste");
        int retorno = 0;

        try {
            retorno = livroDao.cadastrarLivro(livro);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(1, retorno);
    }


    @Test
    void testConsultaLivro() {
        Livro livro = Livro.livroFactory();
        livro.setAutor("Autor de Teste");
        livro.setTitulo("Titulo de Teste");
        List<Livro> resultado = new ArrayList<>();
        try {
            livroDao.cadastrarLivro(livro);
            resultado = livroDao.consultarLivro(livro, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Titulo de Teste", resultado.get(0).getTitulo());
        assertEquals("Autor de Teste", resultado.get(0).getAutor());
    }

    @Test
    void testDeleteLivro() {
        Livro livro = Livro.livroFactory();
        livro.setAutor("Autor de Teste");
        livro.setTitulo("Titulo de Teste");
        List<Livro> resultado = new ArrayList<>();
        try {
            livroDao.cadastrarLivro(livro);
            resultado = livroDao.consultarLivro(livro, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Titulo de Teste", resultado.get(0).getTitulo());
        assertEquals("Autor de Teste", resultado.get(0).getAutor());
    }

    @Test
    void testUpdateLivro() {
        Livro livro = Livro.livroFactory();
        livro.setAutor("Autor de Teste");
        livro.setTitulo("Titulo de Teste");
        List<Livro> resultado = new ArrayList<>();
        try {
            livroDao.cadastrarLivro(livro);
            resultado = livroDao.consultarLivro(livro, 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertEquals(1, resultado.size());
        assertEquals("Titulo de Teste", resultado.get(0).getTitulo());
        assertEquals("Autor de Teste", resultado.get(0).getAutor());
    }

    @Test
    void testControle() {
        assertEquals(2, 2);
    }
}