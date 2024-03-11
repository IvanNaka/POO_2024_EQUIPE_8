package PBL04;

public class Pontuacao {
    private double _pontuacao;
    private int _nivel;

    public  double getPontuacao(){
        return this._pontuacao;
    }
    public void setPontuacao(double pontuacao){
        this._pontuacao = pontuacao;
    }
    public int getNivel(){
        return this._nivel;
    }
    public void setNivel(int nivel){
        this._nivel = nivel;
    }
    public Pontuacao(int nivel, double pontuacao){
        this.setPontuacao(pontuacao);
        this.setNivel(nivel);
    }
}
