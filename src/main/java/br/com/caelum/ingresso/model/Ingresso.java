package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
<<<<<<< HEAD
<<<<<<< HEAD
import java.math.RoundingMode;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {
	private Sessao sessao;
	private BigDecimal preco;
	
	
	/**
	 * @deprecated hibernate only
	 */
	
	public Ingresso() {
		
	}
	
	public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
		
	}
	
	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}
	
	public void setPreco() {
		this.preco = preco;
	}
=======
=======
>>>>>>> work

import br.com.caelum.ingresso.desconto.Desconto;

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
<<<<<<< HEAD
>>>>>>> Desconto e json
=======
>>>>>>> work
}
