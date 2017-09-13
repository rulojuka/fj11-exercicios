class PessoaFisica{
	String cpf;
	public PessoaFisica(String cpf){
		if(valida(cpf)){
			this.cpf = cpf;
			System.out.println("Criou pessoa com cpf válido.");
		}
		else{
			System.out.println("O quê fazer aqui?");
		}
	}
	private boolean valida(String cpf){
		return false;
	}
}