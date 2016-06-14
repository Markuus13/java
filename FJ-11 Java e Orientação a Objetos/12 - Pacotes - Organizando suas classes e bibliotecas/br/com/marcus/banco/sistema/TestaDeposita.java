package banco;

public class TestaDeposita {
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		
		cp.deposita(500);
		System.out.println(cp.getSaldo());
		
		try {
			cp.deposita(-200.0);
		} catch (ValorInvalidoException e) {
			System.out.println("ERRO\n" + e.getMessage());
		}
	}
}
