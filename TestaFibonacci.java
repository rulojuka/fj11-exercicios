class TestaFibonacci{
	public static void main(String args[]){
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 45; i++) {
		    int resultado = fibonacci.calculaFibonacciArray(i);
		    System.out.println(resultado);
		}
	}
}

