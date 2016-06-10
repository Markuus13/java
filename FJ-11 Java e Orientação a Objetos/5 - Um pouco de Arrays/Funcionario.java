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
        System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
        System.out.println("RG: " + this.rg);
    }
}

class Empresa {
    String nome;
    String cnpj;
    Funcionario[] empregados;
    int indice;
    
    // Metodos
    void adiciona(Funcionario f) {
        
        if (indice < empregados.length) {
            this.empregados[indice] = f;
            indice++;
        }
       
        else
            System.out.println("Erro! Limite de funcionários alcançado.");
    }
    
    void mostraEmpregados() {
        // Enhanced for
        for (Funcionario emp : empregados)
            System.out.println("Salario: " + emp.salario);
        
    }
    
}