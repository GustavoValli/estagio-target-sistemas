package Q2;

public class Questao02 {

    static boolean isFibonacci(int x) {
        int n1 = 0, n2 = 1;
        while (n2 < x) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return x == n2;
    }

    public static void main(String[] args) {
        if (isFibonacci(32)) {
            System.out.println("O número está presente na sequência de Fibonacci.");
        } else {
            System.out.println("O número NÃO está presente na sequência de Fibonacci.");
        }
    }
}
