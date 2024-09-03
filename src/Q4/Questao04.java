package Q4;

public class Questao04 {

    public static void main(String[] args) {
        Float sp = 67836.43f;
        Float rj = 36678.66f;
        Float mg = 29229.88f;
        Float es = 27165.48f;
        Float outros = 19849.53f;

        Float valorTotal = sp + rj + mg + es + outros;

        System.out.printf("SP representa %.2f%%\n", ((sp / valorTotal) * 100));
        System.out.printf("RJ representa %.2f%%\n", ((rj / valorTotal) * 100));
        System.out.printf("MG representa %.2f%%\n", ((mg / valorTotal) * 100));
        System.out.printf("ES representa %.2f%%\n", ((es / valorTotal) * 100));
        System.out.printf("Outros estados representam %.2f%%", ((outros / valorTotal) * 100));
    }
}
