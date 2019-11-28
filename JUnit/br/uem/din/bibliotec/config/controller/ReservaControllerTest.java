package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.model.Reserva;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    void consultarReserva() throws SQLException {
        ReservaController test = new ReservaController();
        List<Reserva> todasReservasConsultadas = new ArrayList<>();

        todasReservasConsultadas = test.consultarReserva();

        //Assert.assertEquals(todasReservasConsultadas.size(), 1);
    }

    @Test
    void deletarReserva() {



    }
}
