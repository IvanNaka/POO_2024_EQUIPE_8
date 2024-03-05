package Lista01;

import java.util.Scanner;
public class exe4 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int numero = imput.nextInt();
        if (numero >=18){
            System.out.println(numero + " é maior de idade");
        } else  {
            System.out.println(numero + " é menor de idade");
        }
    }
}