class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Marcus";
        f1.salario = 500000;
        f1.recebeAumento(10);
        
        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());
    }
}