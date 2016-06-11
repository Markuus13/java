public class ContaPoupanca extends Conta {
    
    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa);
        this.saldo *= 3;
    }
}