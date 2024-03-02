import java.security.InvalidParameterException;
import java.util.Scanner;

public class PBL02 {
    public  static void main (String[] args){
        boolean desejaContinuar = true;
        int qtdJogadores = 5;
        int qtdFases = 3;
        String[] jogadoresLista;
        jogadoresLista = new String[qtdJogadores];
        Scanner input = new Scanner(System.in);
        // Input Nome Jogadores
        for (int i=0; i<qtdJogadores; i++){
            System.out.print("Digite o nome do Jogador " + (i+1) + ": ");
            String nomeJogador = input.next();
            jogadoresLista[i] = nomeJogador;
        }
        int[][] pontosFase;
        int[] pontoFinal;
        pontosFase = new int[qtdFases][qtdJogadores];
        pontoFinal = new int[qtdJogadores];
        // Input Pontuação Jogadores, por fase
        for (int i=0; i<qtdFases; i++){
            System.out.println("-----------");
            System.out.println("# FASE " + (i+1));
            for (int j=0; j<qtdJogadores; j++){
                System.out.print("Digite a pontuação do jogador " + (j+1) + ": ");
                int pontuacao = input.nextInt();
                pontosFase[i][j] = pontuacao;
                pontoFinal[j] += pontuacao;
            }
        }
        while (desejaContinuar) {
            try {
                // Pergunta ao usuário a próxima ação
                System.out.println("-----------");
                System.out.println("Como você deseja que o resultado seja mostrado? (Digite o número da sua escolha).");
                System.out.println("1 - Por Jogadores.");
                System.out.println("2 - Por Fase.");
                System.out.println("3 - Por Maior Pontuação.");

                String escolhaUsuario = input.next();

                switch (escolhaUsuario) {
                    case "1":
                        // Pergunta Qual Jogador quer ver
                        System.out.println("-----------");
                        // Percorrendo a lista de jogadores pra mostrar cada um deles
                        for (String jogador : jogadoresLista) {
                            System.out.println("# " + jogador + ".");
                        }
                        System.out.println("Digite o nome do jogador que deseja saber sua pontuação: ");
                        String nomeJogadorPont = input.next();
                        for (int i = 0; i < qtdJogadores; i++) {
                            if (jogadoresLista[i].equalsIgnoreCase(nomeJogadorPont)) {
                                System.out.println("A pontuação total do jogador " + nomeJogadorPont + " é igual a " + pontoFinal[i] + ".");
                            }
                        }
                        break;
                    case "2":
                        // Check-point Fase
                        System.out.println("-----------");
                        int[] pontoFinalFase;
                        pontoFinalFase = new int[qtdJogadores];
                        System.out.println("Digite o número da Fase que você deseja consultar o Rank de Pontuação: ");
                        System.out.println("# FASE 1.");
                        System.out.println("# FASE 2.");
                        System.out.println("# FASE 3.");
                        int faseConsulta = input.nextInt();
                        for (int i = 0; i < qtdJogadores; i++) {
                            for (int j = 0; j < faseConsulta; j++) {
                                pontoFinalFase[i] += pontosFase[j][i];
                            }
                        }
                        System.out.println("-----------");
                        System.out.println("O Rank de Pontuação da fase " + faseConsulta + " é:");
                        for (int i = 0; i < qtdJogadores; i++) {
                            System.out.println("# " + jogadoresLista[i] + ": " + pontoFinalFase[i] + " pontos.");
                        }
                        break;
                    case "3":
                        // Rank Jogadores
                        int topJogador = 0;
                        int pontoMaisAlto = 0;
                        for (int i = 0; i < qtdJogadores; i++) {
                            if (pontoFinal[i] > pontoMaisAlto) {
                                topJogador = i;
                                pontoMaisAlto = pontoFinal[i];
                            }
                        }
                        System.out.println("-----------");
                        System.out.println("A pontuação mais alta é de: " + pontoMaisAlto + " pontos - Jogador: " + jogadoresLista[topJogador] + ".");
                        break;
                    default:
                        // Caso o input nao tenha sido mapeado estoura uma excecao
                        throw new InvalidParameterException();
                }
                // Verificando se o usuário deseja fazer alguma outra consulta
                System.out.println("-----------");
                System.out.println("Deseja consultar as pontuações novamente? (S/N).");
                String continuarString = input.next();
                if (continuarString.equalsIgnoreCase("N")) {
                    desejaContinuar = false;
                    System.out.println("Até a próxima!");
                }
            }catch (InvalidParameterException e){
                // Tratamento de excecao caso o input seja invalido
                System.out.println("Insira um input válido");
            }
        }
    }
}