package PBL01;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PBL01 {
    public  static void main (String[] args){
        // Laco de repeticao ate o usuario digitar N no final da funcao
        boolean continuar = true;
        while (continuar){
            try{
                Scanner input = new Scanner(System.in);
                // Recebe os numeros inputados pelo usuario
                System.out.println("Digite o primeiro número: ");
                double numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                double numero2 = input.nextInt();
                System.out.println("Escolha uma das seguintes operações: ");
                System.out.println("+");
                System.out.println("-");
                System.out.println("/");
                System.out.println("*");
                //Recebe a operacao desejada pelo usuario
                String operacao = input.next();
                //Realiza a operacao baseada no input
                switch (operacao){
                    case "+":
                        numero1 += numero2;
                        break;
                    case "-":
                        numero1 -= numero2;
                        break;
                    case "/":
                        numero1 /= numero2;
                        break;
                    case "*":
                        numero1 *= numero2;
                        break;
                    default:
                        // Caso o input nao tenha sido mapeado estoura uma excecao
                        throw new InvalidParameterException();
                }
                // Mostra o resultado da operacao
                System.out.println("O resultado é: " + numero1);
                //Verifica se o usuario deseja ou nao continuar
                System.out.println("Você deseja continuar?(S/N)");
                String continuarString = input.next();
                if (continuarString.equalsIgnoreCase("N")){
                    continuar = false;
                }
            }catch (InputMismatchException e){
                //Tratamento de excecao caso o input de numero seja invalido
                System.out.println("Insira um número válido");
            }catch (InvalidParameterException e){
                //Tratamento de excecao caso o input de operacao seja invalido
                System.out.println("Insira uma operação válida");
            }catch (Exception e) {
                //Tratamento de excecao caso aconteca algum erro nao mapeado
                System.out.println("Erro ao realizar conta");
            }
        }
    }
}
