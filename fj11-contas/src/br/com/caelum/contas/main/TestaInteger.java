package br.com.caelum.contas.main;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		if(x1 == x2) {
			System.out.println("igual com ==");
		}
		else {
			System.out.println("diferente com ==");
		}
		
		if(x1.equals(x2)) {
			System.out.println("igual com equals");
		}
		else {
			System.out.println("diferente com equals");
		}
	}

}
