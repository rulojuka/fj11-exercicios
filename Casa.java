class Casa{
	String cor;
	Porta porta1;
	Porta porta2;
	Porta porta3;

	void pinta(String s){
		this.cor = s;
	}
	int quantasPortasEstaoAbertas(){
		int valor = 0;
		if(porta1.estaAberta()){
			valor++;
		}
		if(porta2.estaAberta()){
			valor++;
		}
		if(porta3.estaAberta()){
			valor++;
		}
		return valor;
	}
}