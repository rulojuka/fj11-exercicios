package br.com.caelum.contas.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	private String nome;
	private int numero;
	private List<Conta> contas;
	private Map<String,Conta> mapaDeContas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
		this.mapaDeContas = new HashMap<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public void adiciona(Conta c) {
		this.contas.add(c);
		this.mapaDeContas.put(c.getTitular(), c);
	}
	
	public Conta pega(int x) {
		return this.contas.get(x);
	}

	public void mostraContas() {
		for (Conta conta : contas) {
			System.out.println(conta);
			
		}
	}

	public boolean contem(Conta conta) {
		return this.contas.contains(conta);
	}
	
	public int pegaQuantidadeDeContas() {
		return this.contas.size();
	}
	
	public Conta buscaPorTitular(String nome) {
		return this.mapaDeContas.get(nome);
	}
}
