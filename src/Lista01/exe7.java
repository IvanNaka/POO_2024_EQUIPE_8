package Lista01;// Criar um programa que simula o jogo pedra, papel e tesoura.
import java.util.Random;
import java.util.Scanner;
public class exe7 {
    private static String opcao(int IA) {
        return switch (IA) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            default -> "Opção inválida";

            //switch (IA) {
            //case 1:
            //return "Pedra";
            //case 2:
            //return "Papel";
            //case 3:
            //return "Tesoura";
            //default:
            //return "Opção inválida";

        };
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Bem vindo ao simulador de Jokenpô (Pedra, Papel e Tesoura). Para jogar, faça a sua escolha digitando um dos seguintes números: ");
            System.out.println("Pedra: 1 - Papel: 2 - Tesoura: 3. Caso queira Sair: 0.");
            //System.out.println("Papel : 2.");
            //System.out.println("Papel : 3.");
            //System.out.println("Caso deseje sair : 0.");
            int jokenpo = input.nextInt();

            if (jokenpo == 0) {
                System.out.println("Jogo encerrado.");
                break;
            }

            if (jokenpo < 0|| jokenpo > 3) {
                System.out.println("Ops, parece que você escolheu um número que não é válido...");
                continue;
            }

            int jokenpoIA = random.nextInt(3) + 1;
            System.out.println("Jo...");
            System.out.println("Ken...");
            System.out.println("Pô!!!");
            System.out.println(opcao(jokenpo) + "(Você)" +  " vs. " + opcao(jokenpoIA) + "(PC)!");
            if (jokenpo == jokenpoIA) {
                System.out.println("Ihhh, empatou... Vamos de novo! \n");
                System.out.println("----------//----------//----------//---------- \n");
            } else if ((jokenpo == 1 && jokenpoIA == 3) || (jokenpo == 2 && jokenpoIA == 1) || (jokenpo == 3 && jokenpoIA == 2)) {
                System.out.println("Boa!! você ganhou! \n");
                System.out.println("----------//----------//----------//---------- \n");
            } else {
                System.out.println("Que pena... você perdeuu! \n");
                System.out.println("----------//----------//----------//---------- \n");
            }
        }
        input.close();
    }
}