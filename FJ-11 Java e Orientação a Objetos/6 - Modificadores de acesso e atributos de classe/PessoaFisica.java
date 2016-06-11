class PessoaFisica {
    
    String cpf;
    
    // Construtor
    PessoaFisica(String cpf) {
        valida(cpf);
        this.cpf = cpf;
    }
    
    // Metodos
    public void valida(String cpf) {
        System.out.println("Cpf validado");
    }
    
}