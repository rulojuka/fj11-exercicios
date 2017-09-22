package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String nome) {
		super(nome);
	}
	
	public ContaPoupanca() {
		super();
	}

	public String getTipo(){
		return "Conta Poupança";
	}

}
