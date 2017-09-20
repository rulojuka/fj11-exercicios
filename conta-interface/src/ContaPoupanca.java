
public class ContaPoupanca implements Conta {

	private double saldo;
	private double taxaSelic;

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo+=valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo-=valor;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.taxaSelic = taxaSelic;

	}

}
