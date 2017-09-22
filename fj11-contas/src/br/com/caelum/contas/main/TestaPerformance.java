package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando..");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long meio = System.currentTimeMillis();

		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}

		long fim = System.currentTimeMillis();
		long tempoInsercao = meio - inicio;
		long tempoBusca = fim - meio;
		System.out.println("Tempo insercao: " + tempoInsercao);
		System.out.println("Tempo busca: "+ tempoBusca);
	}
}
