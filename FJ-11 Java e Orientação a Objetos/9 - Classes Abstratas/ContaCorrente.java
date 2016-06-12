package banco;

public class ContaCorrente extends Conta {
    // Classe filha de Conta
	
	// Reescreve obrigatoriamente o método atualiza
	// ou não compila
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
	
	@Override
	void deposita(double valor) {
		super.deposita(valor);
		this.saldo -= 0.10;
	}
}
