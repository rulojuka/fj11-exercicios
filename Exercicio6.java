class Exercicio6{
	public static void main(String args[]){
		int atual = 0;
		int proximo = 1;
		System.out.println(atual);
		while(atual < 100){
			int aux = atual + proximo;
			atual = proximo;
			proximo = aux;
			System.out.println(atual);
		}
	}
}