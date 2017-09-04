class Porta{
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(){
		this.aberta = true;
	}

	void fecha(){
		this.aberta = false;
	}

	void pinta(String s){
		this.cor = s;
	}

	boolean estaAberta(){
		return this.aberta;
	}

	String retornaDados(){
		String dados = "";
		dados += "A porta é da cor " + this.cor + "\n";
		dados += "A porta tem as seguintes dimensoes: " + this.dimensaoX + " x " + this.dimensaoY + " x " + this.dimensaoZ + "\n";
		dados += "A porta está ";
		dados += this.estaAberta() ? "aberta\n" : "fechada\n";
		dados += "\n\n";
		return dados;
	}
}