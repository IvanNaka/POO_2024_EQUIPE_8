import java.util.Scanner;
public class exe5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura (Celsius):");
        double celsius = Double.parseDouble(input.next());
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Essa temperatura em Fahrenheit:" + fahrenheit);
        input.close();
    }
}
