// 3.14 - Desafios: Fibonacci
// Faça o exercício da série de Fibonacci usando apenas duas variáveis.

class DesafioFibonacci {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;
        
        while (num1 < 150){
            System.out.println(num1);
            System.out.println(num2);
            num1 += num2;
            num2 += num1;
        }
    }
}