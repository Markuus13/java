class TestaEmpresa {
    public static void main(String[] args) {
        
        Empresa emp = new Empresa();
        emp.empregados = new Funcionario[10];
        
        for (int i=0; i<40; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            emp.adiciona(f);
        }
        
        emp.mostraEmpregados();
        
       /* 
        Funcionario f = new Funcionario();
        Funcionario f2 = new Funcionario();
        emp.adiciona(f);
        System.out.println("Contem funcionario f: " + emp.contem(f));
        System.out.println("Contem funcionario f2: " + emp.contem(f2));
        */
    }
}