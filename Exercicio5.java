class Exercicio5{
	public static void main(String args[]){
		long fatorial = 1;
		// usando int, o fatorial de 13 já dá errado
		// usando long, o fatorial de 21 já dá errado
		for(int i = 1;i<=100; i++){
			fatorial *= i;
			System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
	}
}