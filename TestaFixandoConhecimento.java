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
		porta = new Porta();
		porta.fecha();
		c.adicionaPorta(porta);
		porta = new Porta();
		porta.abre();
		c.adicionaPorta(porta);
		porta = new Porta();
		porta.abre();
		c.adicionaPorta(porta);
		System.out.println("A casa tem "+c.totalDePortas() + " portas e está com " + c.quantasPortasEstaoAbertas() + " portas abertas.");
	
	}
}