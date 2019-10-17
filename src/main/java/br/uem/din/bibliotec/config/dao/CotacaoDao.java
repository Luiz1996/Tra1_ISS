package br.uem.din.bibliotec.config.dao;

import br.uem.din.bibliotec.config.model.Cotacao;

public class CotacaoDao {
    public void cadastrarCotacao(Cotacao cotacao) {
        System.out.println("fazer insert aqui");
    }

    public Double consultarCotacaoEmVigor(Cotacao cotacao) {
        System.out.println("fazer consulta e retornar dado formatado");
        return 0.0;
    }
}
