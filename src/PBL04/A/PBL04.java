package PBL04.A;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class PBL04 {
    public  static void main (String[] args){
        int limiteJogadores = Jogadores.getLimiteJogadores();
        int limiteFases = Fases.getLimiteFases();

        String[] jogadoresLista;
        jogadoresLista = new String[limiteJogadores];

        Scanner inputUsuario = new Scanner(System.in);

        for (int i=0; i<limiteJogadores; i++){
            System.out.print("Digite o nome do Jogador " + (i+1) + ": ");
            String nomeJogador = inputUsuario.next();
            Jogadores jogadorObj = new Jogadores(nomeJogador);
            jogadoresLista[i] = jogadorObj.getNome();
        }

        int[][] pontosFase;
        int[] acumuladorPontos;

        pontosFase = new int[Fases.getLimiteFases()][Jogadores.getLimiteJogadores()];
        acumuladorPontos = new int[Jogadores.getLimiteJogadores()];

        for (int i=0; i<limiteFases; i++){
            int numeroFase = i+1;
            Fases faseObj = new Fases(numeroFase);
            System.out.println("-----------");
            System.out.println("# FASE " + (faseObj.getNumero()));
            for (int j=0; j<limiteJogadores; j++){
                System.out.print("Digite a pontuação do jogador " + (j+1) + ": ");
                int pontuacao = inputUsuario.nextInt();
                pontosFase[i][j] = pontuacao;
                acumuladorPontos[j] += pontuacao;
            }
        }

        boolean desejaContinuar = true;
        while (desejaContinuar) {
            try {
                System.out.println("-----------");
                System.out.println("Como você deseja que o resultado seja mostrado? (Digite o número da sua escolha).");
                System.out.println("1 - Por Jogadores.");
                System.out.println("2 - Por Fase.");
                System.out.println("3 - Por Maior Pontuação.");
                System.out.println("4 - Rank Total dos Jogadores");

                String escolhaUsuario = inputUsuario.next();

                switch (escolhaUsuario) {
                    case "1":
                        System.out.println("-----------");
                        for (String jogador : jogadoresLista) {
                            System.out.println("# " + jogador + ".");
                        }
                        System.out.println("Digite o nome do jogador que deseja saber sua pontuação: ");
                        String nomeJogadorPont = inputUsuario.next();
                        for (int i = 0; i < limiteJogadores; i++) {
                            if (jogadoresLista[i].equalsIgnoreCase(nomeJogadorPont)) {
                                System.out.println("A pontuação total do jogador " + nomeJogadorPont + " é igual a " + acumuladorPontos[i] + ".");
                            }
                        }
                        break;
                    case "2":
                        System.out.println("-----------");
                        int[] pontoFinalFase;
                        pontoFinalFase = new int[limiteJogadores];
                        System.out.println("Digite o número da Fase que você deseja consultar o Rank de Pontuação: ");
                        for (int i=0; i<limiteFases; i++){
                            System.out.println("# FASE " + (i+1) + ".");
                        }
                        int faseConsulta = inputUsuario.nextInt();
                        for (int i = 0; i < limiteJogadores; i++) {
                            for (int j = 0; j < faseConsulta; j++) {
                                pontoFinalFase[i] += pontosFase[j][i];
                            }
                        }
                        System.out.println("-----------");
                        System.out.println("O Rank de Pontuação da fase " + faseConsulta + " é:");
                        for (int i = 0; i < limiteJogadores; i++) {
                            System.out.println("# " + jogadoresLista[i] + ": " + pontoFinalFase[i] + " pontos.");
                        }
                        break;
                    case "3":
                        int topJogador = 0;
                        int pontoMaisAlto = 0;
                        for (int i = 0; i < limiteJogadores; i++) {
                            if (acumuladorPontos[i] > pontoMaisAlto) {
                                topJogador = i;
                                pontoMaisAlto = acumuladorPontos[i];
                            }
                        }
                        System.out.println("-----------");
                        System.out.println("A pontuação mais alta é de: " + pontoMaisAlto + " pontos - Jogador: " + jogadoresLista[topJogador] + ".");
                        break;
                    case "4":
                        System.out.println("-----------");
                        System.out.println("Rank de Todos os Jogadores:");
                        for (int i = 0; i < limiteJogadores; i++) {
                            System.out.println("# " + jogadoresLista[i] + ": " + acumuladorPontos[i] + " pontos.");
                        }
                        break;
                    default:
                        throw new InvalidParameterException();
                }
                System.out.println("-----------");
                System.out.println("Deseja consultar as pontuações novamente? (S/N).");
                String continuarString = inputUsuario.next();
                if (continuarString.equalsIgnoreCase("N")) {
                    desejaContinuar = false;
                    System.out.println("Até a próxima!");
                }
            }catch (InvalidParameterException e){
                System.out.println("Insira um input válido");
            }
        }
    }
}