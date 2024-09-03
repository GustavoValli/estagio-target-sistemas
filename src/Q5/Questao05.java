package Q5;

public class Questao05 {

    public static void main(String[] args) {
        String palavra = "Palavra";
        char[] letras = new char[palavra.length()];
        int i = 0;
        for (int j = palavra.length() - 1; j >= 0 ; j--) {
            letras[i] = palavra.charAt(j);
            i++;
        }

        String palavraInvertida = "";
        for (char c : letras) {
            palavraInvertida += c;
        }

        System.out.println(palavraInvertida);

    }
}
