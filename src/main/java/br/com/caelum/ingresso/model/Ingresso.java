package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import java.math.RoundingMode;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {
	private Sessao sessao;
    private BigDecimal preco;

    /**
    * @deprecated hibernate only
    */
    public Ingresso(){

    }

    public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
        this.sessao = sessao;
        this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
    }

    public Sessao getSessao() {
        return sessao;
    }

    public BigDecimal getPreco() {
        return preco;
    }
    
    public void setPreco(BigDecimal preco) {
    	this.preco = preco;
    }

}
