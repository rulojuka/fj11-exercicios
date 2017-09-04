class TestaFixandoConhecimento{
	public static void main(String args[]){
		Pessoa p = new Pessoa();
		p.nome = "Alessandro";
		p.idade = 25;
		System.out.println("A idade do " + p.nome + " é: " + p.idade);
		p.fazAniversario();
		System.out.println("A idade do " + p.nome + " é: " + p.idade);
		p.fazAniversario();
		System.out.println("A idade do " + p.nome + " é: " + p.idade);

		System.out.println("\n\n");

		Porta porta = new Porta();
		System.out.print(porta.retornaDados());
		porta.dimensaoX = 180;
		System.out.print(porta.retornaDados());
		porta.dimensaoY = 65;
		System.out.print(porta.retornaDados());
		porta.dimensaoZ = 5;
		System.out.print(porta.retornaDados());
		porta.abre();
		System.out.print(porta.retornaDados());
		porta.fecha();
		System.out.print(porta.retornaDados());
		porta.pinta("Azul");
		System.out.print(porta.retornaDados());
		porta.pinta("Verde");
		System.out.print(porta.retornaDados());

		System.out.println("");

		Casa c = new Casa();
		c.pinta("Azul");
		c.porta1 = new Porta();
		c.porta1.fecha();
		c.porta2 = new Porta();
		c.porta2.abre();
		c.porta3 = new Porta();
		c.porta3.abre();
		System.out.println("A casa está com " + c.quantasPortasEstaoAbertas() + " portas abertas.");
	}
}