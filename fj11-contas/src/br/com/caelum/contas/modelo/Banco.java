package br.com.caelum.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	private int numeroDeContas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
		this.numeroDeContas = 0;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		if (numeroDeContas < contas.length) {
			contas[numeroDeContas++] = c;
		} else {
			Conta[] aux = new Conta[numeroDeContas * 2];
			for (int i = 0; i < this.contas.length; i++) {
				aux[i] = this.contas[i];
			}
			this.contas = aux;
			adiciona(c);
		}
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			System.out.println("Conta na posição " + i);
			System.out.println(this.contas[i]);

		}
	}

	public boolean contem(Conta conta) {
		if (conta != null) {
			for (int i = 0; i < contas.length; i++) {
				if (conta.equals(this.contas[i])) {
					return true;
				}
			}
		}
		return false;
	}
}
