class Desafio{
	public static void main(String args[]){
		int atual = 0;
		int proximo = 1;
		System.out.println(atual);
		while(atual < 100){

			proximo = proximo + atual;
			atual = proximo - atual;
			System.out.println(atual);
		}
	}
}