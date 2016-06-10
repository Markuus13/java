class TestaEmpresa {
    public static void main(String[] args) {
        
        Empresa emp = new Empresa();
        emp.empregados = new Funcionario[10];
        
        for (int i=0; i<16; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            emp.adiciona(f);
        }
        
    }
}