package Lista02.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        for(String n: nomes){
            System.out.println(n);
        }
    }
}
