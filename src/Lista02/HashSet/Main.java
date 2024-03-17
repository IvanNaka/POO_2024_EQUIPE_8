package Lista02.HashSet;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] arrgs) {
        Set<String> nomes = new HashSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Renata");
        nomes.add("João"); // Não aceita duplicatas, então esse não vai ser adicionado.

        // Método CONTAINS - Busca Valor
        boolean achou = nomes.contains("João"); // retorna true;
        if (achou) {
            System.out.println("Achou!");
        }

        // Método REMOVE - Remove Valor
        boolean apagou = nomes.remove("João");

        // Recuperando Valores
        for (String n: nomes) {
            System.out.println(n);
        }
    }
}
