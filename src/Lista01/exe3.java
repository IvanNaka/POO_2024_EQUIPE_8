package Lista01;

import java.util.Scanner;
public class exe3 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = imput.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = imput.nextInt();
        System.out.println("Digite um numero: ");
        int num3 = imput.nextInt();
        int media = (num1+num2+num3)/3;
        System.out.println("Sua média é " + media);
    }
}