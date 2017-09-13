class TestaConta{
	public static void main(String args[]){
		Data hoje = new Data();
		hoje.dia = 29;
		hoje.mes = 02;
		hoje.ano = 2020;

		Conta c1 = new Conta();

		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.deposita(50.0);
		c1.setDataDeAbertura(hoje);

		c1.deposita(100.0);
		System.out.println("saldo atual:" + c1.getSaldo());
		System.out.println("rendimento mensal:" + c1.calculaRendimento());

		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2 = new Conta("Danilo");
		c2.deposita(100.0);

		Conta c3 = new Conta("Danilo");
		c2.deposita(100.0);

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

		System.out.println(c2.getIdentificador());
		System.out.println(c3.getIdentificador());
	}
}
