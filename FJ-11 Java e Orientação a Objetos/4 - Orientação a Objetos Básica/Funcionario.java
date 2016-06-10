class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataDeEntrada;
    String rg;
    
    // Métodos
    void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    double calculaGanhoAnual() {
        return this.salario * 12;
    }
}