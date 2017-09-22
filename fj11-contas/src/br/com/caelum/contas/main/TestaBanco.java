package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaBanco {
public static void main(String[] args) {
	Banco banco = new Banco("CaelumBank", 999);
	Conta c1 = new ContaCorrente();
	c1.setTitular("Batima");
	c1.setNumero(1);
	c1.setAgencia("1000");
	c1.deposita(1000.0);
	banco.adiciona(c1);
	
	Conta c2 = new ContaCorrente();
	c2.setTitular("Curinga");
	c2.setNumero(2);
	c2.setAgencia("2000");
	c2.deposita(2000.0);
	banco.adiciona(c2);
	
	for (int i = 0; i < 5; i++) {
		Conta conta = new ContaCorrente();
		conta.setTitular("Titular" + i);
		conta.setNumero(i + 3);
		conta.setAgencia("2000");
		conta.deposita(1000.0 * i);
		banco.adiciona(conta);
	}
	
	banco.mostraContas();
	System.out.println(banco.contem(new ContaCorrente()));
	System.out.println(banco.contem(c1));
	
	
}
}
