public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;
    
    // Construtor
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
    
    // Metodos
    public void roda(Conta c) {
        System.out.println("Saldo anterior: " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo atualizado: " + c.getSaldo());
    }
    
    public double getSaldoTotal() {
        return this.saldoTotal;
    }
    
}