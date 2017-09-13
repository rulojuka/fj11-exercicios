class Conta{
	private int numero;
	private String titular;
	private double saldo;
	private String agencia;
	private Data dataDeAbertura;
	private int identificador;
	private static int numeroDeContas = 1;

	public Conta(){
		this.identificador = Conta.numeroDeContas++; 
	}

	public Conta(String nome){
		this();
		this.titular = nome;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public int getNumero(){
		return this.numero;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getTitular(){
		return this.titular;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	public String getAgencia(){
		return this.agencia;
	}

	public void setDataDeAbertura(Data dataDeAbertura){
		this.dataDeAbertura = dataDeAbertura;
	}

	public Data getDataDeAbertura(){
		return this.dataDeAbertura;
	}

	public int getIdentificador(){
		return this.identificador;
	}

	public void saca(double valor){
		saldo -= valor;
	}

	public void deposita(double valor){
		saldo += valor;
	}

	public double calculaRendimento(){
		return saldo * 0.1;
	}

	public String recuperaDadosParaImpressao(){
		String dados = "";
		dados += "Identificador: " + this.identificador + "\n";
		dados += "Titular: " + this.titular + "\n";
		dados += "Número: " + this.numero + "\n";
		dados += "Agência: " + this.agencia + "\n";
		dados += "Data de Abertura: " + this.dataDeAbertura.formatada() + "\n";
		dados += "Saldo: " + this.saldo + "\n";
		dados += "Rendimento mensal: " + this.calculaRendimento() + "\n";
		return dados;
	}
}