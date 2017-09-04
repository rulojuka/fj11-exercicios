class TestaConta{
	public static void main(String args[]){
		Data hoje = new Data();
		hoje.dia = 29;
		hoje.mes = 02;
		hoje.ano = 2020;

		Conta c1 = new Conta();

		c1.titular = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		c1.dataDeAbertura = hoje;

		c1.deposita(100.0);
		System.out.println("saldo atual:" + c1.saldo);
		System.out.println("rendimento mensal:" + c1.calculaRendimento());

		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2 = new Conta();
		c2.titular = "Danilo";
		c2.saldo = 100.0;

		Conta c3 = new Conta();
		c3.titular = "Danilo";
		c3.saldo = 100.0;

		if(c2 == c3){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}

		Conta c4 = c2;

		if(c2 == c4){
			System.out.println("iguais");
		}
		else{
			System.out.println("diferentes");
		}
	}
}
