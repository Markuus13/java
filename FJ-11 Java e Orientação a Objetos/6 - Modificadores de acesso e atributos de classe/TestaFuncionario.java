class TestaFuncionario {

    public static void main(String[] args) {
        /*
        Funcionario f1 = new Funcionario("Marcus");
        Funcionario f2 = new Funcionario("Tester");
        
        f1.setSalario(500000.0);
        f1.mostra();
        f2.mostra();
        */
        
        for (int i=0; i<10; i++){
            Funcionario f = new Funcionario();
            f.mostra();
        }
    }
}