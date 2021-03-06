package br.com.fiap.bean;

import java.util.Calendar;

public abstract class Conta {
	private int numero;
	private Calendar dataAbertura;
	protected double saldo;
	private int agencia;	
	
	
	public Conta() {
		super();
		
	}
	public Conta(int numero, Calendar dataAbertura, double saldo, int agencia) {
		super();
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
		this.agencia = agencia;
}
		
	public void depositar(double valor) {
		saldo += valor;
		
	}
	
	public abstract void retirar (double valor) throws Exception;
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
