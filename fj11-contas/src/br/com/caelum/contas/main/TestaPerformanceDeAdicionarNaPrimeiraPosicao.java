package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando..");
		List<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();

		int total = 30000;

		for (int i = 0; i < total; i++) {
			teste.add(0,i);
		}

		long fim = System.currentTimeMillis();
		long tempoInsercao = fim - inicio;
		System.out.println("Tempo insercao: " + tempoInsercao);
	}
}
