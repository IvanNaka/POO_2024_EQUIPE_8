// Criar um programa que calcula o fatorial de um número.
import java.util.Scanner;
public class exe8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de números fatoriais. Digite o número que você deseja saber seu fatorial: ");

        int num = input.nextInt();
        long resultado = calcularFatorial(num);

        System.out.println("O fatorial de " + num + " é: " + resultado);
        input.close();
    }
    private static long calcularFatorial(int n) {
        if (n < 0) {
            System.out.println("Por favor, digite um número positivo.");
            return -1;
        }
        if (n == 0 || n ==1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
