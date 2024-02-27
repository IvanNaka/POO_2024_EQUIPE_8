import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PBL01 {
    public  static void main (String[] args){
        boolean continuar = true;
        while (continuar){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Digite o primeiro número: ");
                double numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                double numero2 = input.nextInt();
                System.out.println("Escolha uma das seguintes operações: ");
                System.out.println("+");
                System.out.println("-");
                System.out.println("/");
                System.out.println("*");
                String operacao = input.next();
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
                        throw new InvalidParameterException();
                }
                System.out.println("O resultado é: " + numero1);
                System.out.println("Você deseja continuar?(S/N)");
                String continuarString = input.next();
                if (continuarString.equalsIgnoreCase("N")){
                    continuar = false;
                }
            }catch (InputMismatchException e){
                System.out.println("Insira um número válido");
            }catch (InvalidParameterException e){
                System.out.println("Insira uma operação válida");
            }catch (Exception e) {
                System.out.println("Erro ao realizar conta");
            }
        }
    }
}
