package br.uem.din.bibliotec.config.controller;

import br.uem.din.bibliotec.config.dao.CotacaoDao;
import br.uem.din.bibliotec.config.model.Cotacao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class CotacaoController implements Serializable {
    private Cotacao cotacao = new Cotacao();
    private CotacaoDao cotacaoDao = new CotacaoDao();

    public CotacaoController(){}

    public Cotacao getCotacao() {
        return cotacao;
    }

    public void setCotacao(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    public CotacaoDao getCotacaoDao() {
        return cotacaoDao;
    }

    public void setCotacaoDao(CotacaoDao cotacaoDao) {
        this.cotacaoDao = cotacaoDao;
    }

    public String cadastrarCotacao(){

        if(cotacao.getValor() <= 0.0){
            cotacao.setMsgRetorno("FALHA: Valor de cotação inválido(inserir valores maiores que R$0,00).");
            cotacao.setColorMsgRetorno("red");
        }else{
            cotacaoDao.cadastrarCotacao(cotacao);
            cotacao.setMsgRetorno("SUCESSO: A cotação de R$"+cotacao.getValor()+" foi cadastrada com sucesso.");
            cotacao.setColorMsgRetorno("green");
        }

        return "/acessoBalconista?faces-redirect=true";
    }
}
