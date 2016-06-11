class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int indice;
    
    // Metodos
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }
    
    
    public void adiciona(Funcionario f) {
        
        if (indice < empregados.length) {
            this.empregados[indice] = f;
            indice++;
        }
       
        else {
            // Aloca uma nova rray com mais 10 espaços
            Funcionario[] aux = new Funcionario[indice + 10];
            
            // Copia os valores da antiga nas mesmas posições da nova
            for (int i=0; i<indice; i++)
                aux[i] = empregados[i];
            
            // O atributo empregados deste objeto passa apontar para a nova array
            this.empregados = aux;
            
            // Faz uma chamada recursiva para adicionar o primeiro funcionario da nova array
            this.adiciona(f);
        
        }
        
    }
    
     public void mostraEmpregados() {
        // Enhanced for
        for (Funcionario emp : empregados)
            emp.mostra();
        
    }
    
    public boolean contem(Funcionario f) {
        
        for (Funcionario emp: empregados){
            if (emp == f)
                return true;
        }
        return false;
    }
}