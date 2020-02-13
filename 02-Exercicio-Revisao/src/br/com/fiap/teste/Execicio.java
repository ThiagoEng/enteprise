package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Execicio {

	public static void main(String[] args) {
		// Instaciar uma cc e uma cp
		
		ContaCorrente cc = new ContaCorrente(1, Calendar.getInstance(), 100, 2, TipoConta.COMUM);
		
		ContaPoupanca cp = new ContaPoupanca(1, new GregorianCalendar(2019, Calendar.JANUARY, 25), 200, 12, 1);
		
	//Criar um lista
	
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(cc);
		contas.add(cp);
		
	}

}
