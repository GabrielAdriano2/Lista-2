
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ControleAcesso {

    public static void main(String[] args) {

        Set<String> rh = new HashSet<>(Arrays.asList(
                "ver_salario", "editar_perfil"));

        Set<String> ti = new HashSet<>(Arrays.asList(
                "acesso_servidor", "editar_perfil"));

        // união
        Set<String> permissoesTotais = new HashSet<>(rh);
        permissoesTotais.addAll(ti);

        System.out.println("Permissões totais do funcionários: ");
        System.out.println(permissoesTotais);
        System.out.println("");

        // subconjunto
        Set<String> permissoesNecessarias = new HashSet<>(Arrays.asList(
                "ver_salario", "acesso_servidor"));

        if (permissoesTotais.containsAll(permissoesNecessarias)) {
            System.out.println("Pode acessar o arquivo confidencial.");
        } else {
            System.out.println("Não pode acessar o arquivo confidencial.");
        }

    }
}