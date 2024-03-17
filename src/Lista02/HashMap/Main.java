package Lista02.HashMap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> capitais = new HashMap<>();

        capitais.put(1, "Curitiba");
        capitais.put(2, "RJ");
        capitais.put(3, "SP");
        System.out.println(capitais);

        // Método Search
        System.out.println("Procurando a capital de número 1: " + capitais.get(1));

        // Removendo
        capitais.remove(1); // Removendo a capital de numero 1
        System.out.println(capitais);

        // Limpando a Lista
        capitais.clear();
        System.out.println(capitais);
    }
}
