class Exercicio7 {
    public static void main(String[] args) {
        int x = 13;
        
        while (x != 1){
            if (x%2 == 0) // Se for par
                x = x/2;
            else
                x = 3*x+1;
                
            System.out.print(x);
            // Arrumando apresentação no console
            if (x!= 1)
                System.out.print(" -> ");
        }
    }
}