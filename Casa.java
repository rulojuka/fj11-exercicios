class Casa{
	private String cor;
	int totalDePortas;
	Porta[] portas = new Porta[10];

	public void pinta(String s){
		this.cor = s;
	}
	public int quantasPortasEstaoAbertas(){
		int valor = 0;
		for (int i = 0; i < totalDePortas; i++) {
			if(portas[i].estaAberta()) {
				valor++;
			}
		}
		return valor;
	}
	public void adicionaPorta(Porta p) {
		portas[totalDePortas++] = p;
	}
	public int totalDePortas() {
		return this.totalDePortas;
	}
}