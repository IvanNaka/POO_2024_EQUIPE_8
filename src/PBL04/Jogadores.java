package PBL04;

public class Jogadores {
    // Atributos
    private static final int _limiteJogadores = 5;
    private String _nomeJogador;

    // Métodos
    public Jogadores(String nomeJogador) {
        this.setNome(nomeJogador);
    }
    public String getNome() {
        return _nomeJogador;
    }
    public void setNome(String nomeJogador) {
        this._nomeJogador = nomeJogador;
    }
    public static int getLimiteJogadores() {
        return _limiteJogadores;
    }


}
