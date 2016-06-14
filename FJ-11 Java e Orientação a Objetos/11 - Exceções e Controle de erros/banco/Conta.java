package banco;

public abstract class Conta {
	
	protected double saldo;
	
	public void deposita(double valor) {
		if (valor < 0)
			throw new ValorInvalidoException(valor);
		else
			this.saldo += valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Método Abstrato
	public abstract void atualiza(double taxaSelic);
	
}
