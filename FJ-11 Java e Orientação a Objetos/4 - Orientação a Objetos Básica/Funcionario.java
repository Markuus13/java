class Funcionario {
    String nome;
    String departamento;
    double salario;
    Data dataDeEntrada;
    String rg;
    
    // Métodos
    void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    double calculaGanhoAnual() {
        return this.salario * 12;
    }
    
    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de entrada: " + this.dataDeEntrada.dia + "/" + this.dataDeEntrada.mes + "/" + this.dataDeEntrada.ano);
        System.out.println("RG: " + this.rg);
    }
}