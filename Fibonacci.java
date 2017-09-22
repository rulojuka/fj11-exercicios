class Fibonacci {
	private int[] respostas;
	private int jaResolviAte;

	public Fibonacci() {
		this.respostas = new int[100];
		this.respostas[0] = 0;
		this.respostas[1] = 1;
		this.jaResolviAte = 1;
	}

	int calculaFibonacci(int x) {
		return (x <= 2) ? 1 : this.calculaFibonacci(x - 1) + this.calculaFibonacci(x - 2);
	}

	int calculaFibonacciArray(int x) {
		if (x > jaResolviAte) {
			respostas[x] = this.calculaFibonacciArray(x - 1) + this.calculaFibonacciArray(x - 2);
			jaResolviAte = x;
		}
		return respostas[x];
	}
}