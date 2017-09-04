class Fibonacci{
	int calculaFibonacci(int x){	
		return (x<=2) ? 1 : this.calculaFibonacci(x-1) + this.calculaFibonacci(x-2);
	}
}