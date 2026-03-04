import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FiltroDePalavras {

    public static void main(String[] args) {

        Set<String> reservadas = new HashSet<>(Arrays.asList(
                "if", "else", "while", "for", "return", "int", "System",
                "out", "print", "public", "class"));

        Set<String> palavrasDoCodigo = new HashSet<>(Arrays.asList(
                "public", "class", "StarRectangle",
                "void", "printRectangle", "int", "n", "for", "i",
                "System", "out", "print", "if", "else"

        ));

        //interseção
        Set<String> intersecao = new HashSet<>(palavrasDoCodigo);
        intersecao.retainAll(reservadas);

        //diferença
        Set<String> diferenca = new HashSet<>(palavrasDoCodigo);
        diferenca.removeAll(reservadas);

        System.out.println("Palavras reservadas encontradas:" );
        System.out.println(intersecao);

        System.out.println("Possíveis identificadores: ");
        System.out.println(diferenca);
    }
}