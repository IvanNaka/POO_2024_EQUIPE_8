import java.util.Scanner;


public class PBL02 {
    public  static void main (String[] args){
        int qtdJogadores = 5;
        int qtdFases = 3;
        String jogadoresLista[];
        jogadoresLista = new String[qtdJogadores];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<qtdJogadores; i++){
            System.out.println("Digite o nome do jogador " + (i+1));
            String nomeJogador = input.next();
            jogadoresLista[i] = nomeJogador;
        }
        int pontosFase[][];
        int pontoFinal[];
        pontosFase = new int[qtdFases][qtdJogadores];
        pontoFinal = new int[qtdJogadores];
        for (int i=0; i<qtdFases; i++){
            System.out.println("Fase" + (i+1));
            for (int j=0; j<qtdJogadores; j++){
                System.out.println("Digite a pontuação do jogador " + (j+1));
                int pontuacao = input.nextInt();
                pontosFase[i][j] = pontuacao;
                pontoFinal[j] += pontuacao;
            }
        }
        System.out.println("Digite o nome do jogador ");
        String nomeJogadorPont = input.next();
        for (int i=0; i<qtdJogadores; i++){
            if (jogadoresLista[i].equals(nomeJogadorPont)){
                System.out.println("A pontuação total do jogador " + nomeJogadorPont  + " é igual a " + pontoFinal[i]);
            }
        }
        int pontoFinalFase[];
        pontoFinalFase = new int[qtdJogadores];
        System.out.println("Digite a fase que você deseja consultar: ");
        int faseConsulta = input.nextInt();
        for (int i=0; i<qtdJogadores; i++){
            for (int j=0; j<faseConsulta; j++){
                pontoFinalFase[i] += pontosFase[j][i];
            }
        }
        System.out.println("A pontuação dos jogadores até fase " + faseConsulta + " é:");
        for (int i=0; i<qtdJogadores; i++){
            System.out.println(jogadoresLista[i] + ": " + pontoFinalFase[i] + " pontos");
        }
        int topJogador = 0;
        int pontoMaisAlto = 0;
        for (int i=0; i<qtdJogadores; i++){
            if (pontoFinal[i] > pontoMaisAlto){
                topJogador = i;
                pontoMaisAlto = pontoFinal[i];
            }
        }
        System.out.println("A pontuação mais alta é de: " + pontoMaisAlto + " pontos - Jogador: " + jogadoresLista[topJogador]);
    }
}
