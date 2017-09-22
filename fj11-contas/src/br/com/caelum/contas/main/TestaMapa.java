package br.com.caelum.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		c1.deposita(10000);

		Conta c2 = new ContaCorrente();
		c2.deposita(3000);

		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();

		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		Conta contaDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDiretor.getSaldo());

	}
}
