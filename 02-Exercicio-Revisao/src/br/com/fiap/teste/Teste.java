package br.com.fiap.teste;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.TipoConta;

public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		
		cc.depositar(100);
		cc.setTipo(TipoConta.COMUM);
		
		try {
			cc.retirar(50);
			System.out.println("Saque efetuado!");
		}catch(Exception e) {
			System.err.println("Conta comum n�o pode retirar ");
		}
		
	}

}
