class Exercicio8{
	public static void main(String args[]){
		int linha = 1;
		int MAX = 8;
		for(int i =1; i<=MAX; i++){
			for(int j= 1; j<=i; j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}
}