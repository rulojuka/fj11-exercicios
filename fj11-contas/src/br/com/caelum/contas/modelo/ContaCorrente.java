package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public void saca(double valor) {
		super.saca(valor+0.10);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
