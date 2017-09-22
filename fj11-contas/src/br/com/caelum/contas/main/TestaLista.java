package br.com.caelum.contas.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaLista {
	public static void main(String[] args) {
		List<Conta> lista = new LinkedList<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Conta c = new ContaCorrente("Conta "+ i);
			c.deposita(random.nextInt(100));
			lista.add(c);
		}
		for (Conta conta : lista) {
			System.out.println(conta);
			System.out.println("Saldo: " +conta.getSaldo());
			
		}
		System.out.println("A referencia eh "+lista);
	}
	
	

}
