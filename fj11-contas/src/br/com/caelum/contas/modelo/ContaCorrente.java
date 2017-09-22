package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(String nome) {
		super(nome);
	}

	public ContaCorrente() {
		super();
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else if (valor > this.getSaldo()) {
			throw new SaldoInsuficienteException(valor);
		} else {
			super.saca(valor + 0.10);
		}
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
