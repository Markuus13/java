class Exercicio6 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 1;
        int valor;
        
        System.out.println(num1);
        System.out.println(num2);
        do {
            valor = num1 + num2;
            num1 = num2;
            num2 = valor;
            System.out.println(valor);
        } while (valor < 100);
    }
}