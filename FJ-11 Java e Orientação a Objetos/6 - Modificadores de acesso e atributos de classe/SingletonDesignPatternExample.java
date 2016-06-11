/*
*  "O Singleton significa que só vai existir um objeto (e realmente, no código só foi dado new uma única vez, 
*   quando a primeira chamada entrou no if), mas não diz nada sobre quantas referências esse objeto pode ter."
*/


// Singleton ThreadSafe
public class Singleton {
	private static Singleton instance = new Singleton(); // <-- Unica Instancia do Singleton
	private Singleton(){} // <--- Construtor privado impede que se instacie outro objeto
	public static Singleton getInstance(){ // <-- O metodo da Classe (static) retorna a unica instancia existente
		return instance;
	}	
}

// Outro exemplo de Singleton
public class Singleton {  
    private static Singleton instance = null;  
    private Singleton(){}  
    public static synchronized Singleton getInstance(){  
        if (instance == null){  
            instance = new Singleton();  
        }  
        return instance;  
    }            
}

// Créditos do algoritmo: ViniGodoy
// Link: http://www.guj.com.br/t/design-pattern-singleton/38171/9