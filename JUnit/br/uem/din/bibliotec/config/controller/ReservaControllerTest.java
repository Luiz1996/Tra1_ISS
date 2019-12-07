package br.uem.din.bibliotec.config.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class ReservaControllerTest {

    @Test
    void cadastrarReserva_CasoDeSucesso() throws SQLException {
        ReservaController test = new ReservaController();

        test.getReserva().setCodUsuario(1); //Bibliotecátio
        test.getReserva().setCodLivro(1);   //Dom Casmurro - Machado de Assis

        test.cadastrarReserva(1);

        Assert.assertEquals("SUCESSO: A reserva foi efetuada com sucesso, você receberá um e-mail quando o livro estiver disponível.", test.getReserva().getMsgRetorno());
    }

    @Test
    void cadastrarReserva_UsuarioComMulta() throws SQLException {
        ReservaController test = new ReservaController();

        test.cadastrarReserva(2); //sei que o usuário '2' possui multas, por isso deve falhar...

        Assert.assertEquals("FALHA: Usuários com multas não podem efetuar reservas de livros.", test.getReserva().getMsgRetorno());
    }

    @Test
    void cadastrarReserva_UsuarioComEmprestimoAtrasado() throws SQLException {
        ReservaController test = new ReservaController();

        test.cadastrarReserva(3); //sei que o usuário '3' possui empréstimos em atraso, por isso deve falhar...

        Assert.assertEquals("FALHA: Você possui empréstimo(s) em atraso(s), reserva cancelada.", test.getReserva().getMsgRetorno());
    }

    @Test
    void consultarReserva_CasoDeSucesso() throws SQLException {
        ReservaController test = new ReservaController();

        test.getReserva().setCodReserva(1);

        Assert.assertEquals(1, test.consultarReserva());
    }

    @Test
    void consultarReserva_ReservaQueNaoExiste() throws SQLException {
        ReservaController test = new ReservaController();

        test.getReserva().setCodReserva(-1);
        Assert.assertEquals(0, test.consultarReserva());
    }

    @Test
    void deletarReserva_Sucesso() {
        ReservaController test = new ReservaController();

        test.getReserva().setCodReserva(2);

        test.deletarReserva();

        Assert.assertEquals("SUCESSO: A reserva escolhida foi cancelada com sucesso.", test.getReserva().getMsgRetorno());
    }

    @Test
    void deletarReserva_Falha() {
        ReservaController test = new ReservaController();

        test.getReserva().setCodReserva(-1);

        test.deletarReserva();

        Assert.assertEquals("FALHA: Ocorreu uma falha ao deletar a reserva, contacte o administrador.", test.getReserva().getMsgRetorno());
    }
}
