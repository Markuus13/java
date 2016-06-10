class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Data data = new Data();
        
        data.dia = 13;
        data.mes = 07;
        data.ano = 2016;
        
        f1.nome = "Marcus";
        f1.salario = 500000;
        f1.recebeAumento(10);
        
        // Ligação
        f1.dataDeEntrada = data;
        
        f1.mostra();
    }
}