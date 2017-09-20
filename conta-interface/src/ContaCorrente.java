
public class ContaCorrente implements ContaTributavel {

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
		this.saldo-=valor+0.10;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.taxaSelic = taxaSelic;

	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
