package br.uem.din.bibliotec.config.multaTeste;

import br.uem.din.bibliotec.config.model.Multa;
import com.sun.org.apache.xpath.internal.operations.Mult;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultaTeste {

    @Test
    void valorTotalMultasVerdadeiro() {
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        double teste = multaDao.valorTotalMultas(1);
        assertEquals(10, teste);
    }
    @Test
    void valorTotalMultasFalso() {
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        double teste = multaDao.valorTotalMultas(1);
        assertEquals(9, teste);
    }

    @Test
    void cadastrarMulta(){

        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setCodLivro(1);
        multa.setCodUsuario(1);
        multa.setCodEmprestimo(1);
        multa.setCodCotacao(1);
        multa.setDataCad("2019-11-27");
        multa.setDiasAtraso(10);
        multa.setValor(20);
        multa.setAtivo(1);


        multaDao.cadastrarMulta(multa);

        multa.setCodMulta(1);
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMultasCpf(multa);

    }

}