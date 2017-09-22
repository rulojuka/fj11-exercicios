package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			ContaCorrente contaCorrente = new ContaCorrente();
			contaCorrente.deposita(i * 100.0);
			contas[i] = contaCorrente;
		}
		double total=0;
		for (int i = 0; i < contas.length; i++) {
			total += contas[i].getSaldo();
		}
		System.out.println("A média é: " + total/10);
	}
}
