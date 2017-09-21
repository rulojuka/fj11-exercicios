package br.com.caelum.contas.main;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		String outra = s.replaceAll("1", "2");
		System.out.println(outra); // Imprime "fj22"
		System.out.println(outra.contains("fj")); // Imprime true
		System.out.println("   xpto ".trim()); // Imprime "xpto"
		System.out.println("xpto".length()); // Imprime 4
		imprimeUmPorLinha("xpto");
		imprimeAoContrario("ao contrario");
		imprimeAoContrarioComStringBuilder("ao contrario");
		transformaEmNumero("1234");
	}
	
	static void imprimeUmPorLinha(String string) {
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
	}
	
	static void imprimeAoContrario(String string) {
		for (int i = string.length() - 1; i >=0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	static void imprimeAoContrarioComStringBuilder(String string) {
		StringBuilder contrario = new StringBuilder();
		for (int i = string.length() - 1; i >=0; i--) {
			contrario.append(string.charAt(i));
		}
		System.out.println(contrario);
	}
	
	static void transformaEmNumero(String string) {
		int numero = 0;
		int multiplicador = 1;
		for (int i = string.length() - 1; i >=0; i--) {
			numero += (string.charAt(i) - '0') * multiplicador;
			multiplicador *=10;
		}
		System.out.println(numero);
	}

}
