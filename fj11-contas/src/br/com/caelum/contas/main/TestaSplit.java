package br.com.caelum.contas.main;

public class TestaSplit {
public static void main(String[] args) {
	String texto = "Socorram-me, subi no ônibus em Marrocos";
	String[] dividido = texto.split(" ");
	for (int i = dividido.length -1; i >= 0; i--) {
		System.out.print(dividido[i] + " ");
	}
}
}
