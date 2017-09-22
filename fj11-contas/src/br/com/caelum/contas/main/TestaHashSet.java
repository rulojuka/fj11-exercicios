package br.com.caelum.contas.main;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaHashSet {
	public static void main(String[] args) {
		Set<Conta> hashSet = new HashSet<>();
		Conta cc = new ContaCorrente("Alessandro");
		cc.setAgencia("Agencia 1");
		cc.setNumero(1);
		
		Conta cp = new ContaPoupanca("Alessandro");
		cp.setAgencia("Agencia 1");
		cp.setNumero(1);
		
		hashSet.add(cc);
		hashSet.add(cp);
		
		for (Conta conta : hashSet) {
			System.out.println(conta);
		}
	}
}
