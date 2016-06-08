class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000, gastosFeverereiro = 23000, gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFeverereiro + gastosMarco;
        double mediaMensal = gastosTrimestre/3;
        
        System.out.println("Gastos do Trimestre: " + gastosTrimestre);
        System.out.println("Valor da Média Mensal: " + mediaMensal);
        
    }
}