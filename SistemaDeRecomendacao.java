import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class SistemaDeRecomendacao {

    public static void main(String[] args) {

        Set<String> usuarioA = new HashSet<>(Arrays.asList(

                "Python", "Jogos", "Música", "IA"));

        Set<String> usuarioB = new HashSet<>(Arrays.asList(

                "Java", "IA", "Música", "Caminhada"));

        //interseção
        Set<String> interessesEmComum = new HashSet<>(usuarioA);
        interessesEmComum.retainAll(usuarioB);

        //Diferença
        Set<String> recomendacoesParaA = new HashSet<>(usuarioB);
        recomendacoesParaA.removeAll(usuarioA);

        System.out.println("Interesses em comum: ");
        System.out.println(interessesEmComum);

        System.out.println("Sugestões para o Usuário A: ");
        System.out.println(recomendacoesParaA);
    }
}