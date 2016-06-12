package banco;

// Classe Abstrata
public abstract class Conta {

	protected double saldo;
	
	void deposita(double valor) {
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
