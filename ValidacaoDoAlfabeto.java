import java.util.HashSet;
import java.util.Set;

public class ValidacaoDoAlfabeto {

    public static boolean validar(String alfabeto, String frase) {

        Set<Character> conjuntoAlfabeto = new HashSet<>();

        for (char c : alfabeto.toCharArray()) {
            conjuntoAlfabeto.add(c);
        }

        for (char c : frase.toCharArray()) {
            if (!conjuntoAlfabeto.contains(c)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String frase = "java";

        boolean resultado = validar(alfabeto, frase);

        if (resultado) {
            System.out.println("Frase válida!");
        } else {
            System.out.println("Frase inválida!");
        }
    }
}