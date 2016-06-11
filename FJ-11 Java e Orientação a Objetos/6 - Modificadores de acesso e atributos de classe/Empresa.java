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
    
    void mostraEmpregados() {
        // Enhanced for
        for (Funcionario emp : empregados)
            emp.mostra();
        
    }
    
    boolean contem(Funcionario f) {
        
        for (Funcionario emp: empregados){
            if (emp == f)
                return true;
        }
        return false;
    }
}