import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        System.out.println("Testegiit");
        String nome = scan.next();
        System.out.printf("Hello, World " + nome);
        scan.close();
    }
}