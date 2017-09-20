package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta {
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor+0.10);
	}
}
