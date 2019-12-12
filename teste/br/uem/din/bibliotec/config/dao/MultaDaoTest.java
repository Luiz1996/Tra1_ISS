package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.model.Multa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultaTeste {
    public static int tamanho = 11;

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
    void cadastrarMultaVerdadeiro(){

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
        multa.setCpfUsuario("11111111111");

        multaDao.cadastrarMulta(multa);

        tamanho++;
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMultasCpf(multa);

        assertEquals(10,listaMulta.size());
    }

    @Test
    void cadastrarMultaFalso(){

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
        multa.setCpfUsuario("11111111111");


        multaDao.cadastrarMulta(multa);
        tamanho++;
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMultasCpf(multa);

        assertEquals(1,listaMulta.size());
    }

    @Test
    void consultaVerdadeira(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setCpfUsuario("11111111111");
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMultasCpf(multa);

        assertEquals(tamanho, listaMulta.size());

    }

    @Test
    void consultaFalsa(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setCpfUsuario("11111111111");
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMultasCpf(multa);

        assertEquals(1, listaMulta.size());
    }

    @Test
    void consultaMinhasMultasVerdadeira(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setCodUsuario(1);
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMinhasMultasCpf(multa);

        assertEquals(tamanho, listaMulta.size());
    }

    @Test
    void consultaMinhasMultasFalsa(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setCodUsuario(1);
        List<Multa> listaMulta = new ArrayList<>();

        listaMulta = multaDao.consultarMinhasMultasCpf(multa);

        assertEquals(1, listaMulta.size());
    }

    @Test
    void baixarMultasFalso(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setIdMultasSeparadosVirgula("*");

        multaDao.baixarMultas(multa);

        assertEquals("red", multa.getColorMsgRetorno());
    }

    @Test
    void baixarMultasVerdadeiro(){
        Multa multa = new Multa();
        MultaDao multaDao = new MultaDao();

        multa.setIdMultasSeparadosVirgula("12");
        multa.setAtivo(1);

        multaDao.baixarMultas(multa);

    }
}