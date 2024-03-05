package Lista01;

import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = imput.nextInt();
        if (numero >0){
            System.out.println(numero + " é positivo");
        } else if (numero <0) {
            System.out.println(numero +" é negativo");
        } else {
            System.out.println(numero + " é 0");
        }
    }
}
