package br.com.caelum.contas.modelo;

public abstract class Conta {
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public abstract String getTipo();
	
	@Override
	public String toString() {
		return "Conta do " + this.getTitular().toUpperCase();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Conta) {
			Conta outraConta = (Conta) obj;
			return this.numero == outraConta.getNumero() && this.agencia.equals(outraConta.getAgencia());
		}
		return false;
	}
}
