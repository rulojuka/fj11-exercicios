class Conta{
	int numero;
	String titular;
	double saldo;
	String agencia;
	Data dataDeAbertura;

	void saca(double valor){
		saldo -= valor;
	}

	void deposita(double valor){
		saldo += valor;
	}

	double calculaRendimento(){
		return saldo * 0.1;
	}

	String recuperaDadosParaImpressao(){
		String dados = "";
		dados += "Titular: " + this.titular + "\n";
		dados += "Número: " + this.numero + "\n";
		dados += "Agência: " + this.agencia + "\n";
		dados += "Data de Abertura: " + this.dataDeAbertura.formatada() + "\n";
		dados += "Saldo: " + this.saldo + "\n";
		dados += "Rendimento mensal: " + this.calculaRendimento() + "\n";
		return dados;
	}
}