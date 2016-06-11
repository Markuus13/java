class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataDeEntrada = new Data();
    private String rg;
    private static int identificador;
    private int id;
    
    /* Construtores */
    Funcionario() {
        this.id = ++Funcionario.identificador;
    }
    
    Funcionario(String nome) {
        this();
        this.nome = nome;
    }
    
    /* Métodos */
    public int getIdentificador() {
        return this.identificador;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void recebeAumento(double aumento) {
        this.salario += aumento;
    }
    
    public Data getData() {
        return this.dataDeEntrada;
    }
    
    public void setData(int dia, int mes, int ano) {
        this.dataDeEntrada.dia = dia;
        this.dataDeEntrada.mes = mes;
        this.dataDeEntrada.ano = ano;
    }
    
    public String getRG() {
        return this.rg;
    }
    
    public void setRG(String rg) {
        this.rg = rg;
    }
    
    public double getGanhoAnual() {
        return this.salario * 12;
    }
    
    public void mostra() {
        System.out.println("Identificador: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de entrada: " + this.dataDeEntrada.formatada());
        System.out.println("RG: " + this.rg);
    }
}