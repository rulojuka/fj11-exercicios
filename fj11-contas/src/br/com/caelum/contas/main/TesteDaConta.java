package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100.0);
		conta.saca(20.0);
		System.out.println(conta.getSaldo());
	}
}
