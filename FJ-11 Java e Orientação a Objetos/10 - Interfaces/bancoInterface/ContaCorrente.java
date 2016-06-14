package bancoInterface;

public class ContaCorrente implements ContaTributavel {

	private double saldo;

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= saldo;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo *= this.saldo * taxaSelic * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}