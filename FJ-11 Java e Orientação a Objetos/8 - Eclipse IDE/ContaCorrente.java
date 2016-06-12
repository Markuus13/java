package banco;

public class ContaCorrente extends Conta {
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa);
		this.saldo *= 2;
	}
	
	@Override
	void deposita(double valor) {
		super.deposita(valor);
		this.saldo -= 0.10;
	}
}
