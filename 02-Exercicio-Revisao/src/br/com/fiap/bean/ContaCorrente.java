package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {
	
	private TipoConta tipo;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(int numero, Calendar dataAbertura, double saldo, int agencia, TipoConta tipo) {
		super(numero, dataAbertura, saldo, agencia);
		this.tipo = tipo;
	}

	
	@Override
	public void retirar(double valor) throws Exception {
		if(tipo == TipoConta.COMUM && saldo < valor) {
			throw new Exception ("saldo insuficiente");
		}
		saldo -=valor;
	}
	
	

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	

}
