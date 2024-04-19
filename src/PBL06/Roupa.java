package PBL06;

public abstract class Roupa implements Produto {
    private String cor;
    private String tamanho;
    public Roupa(String cor, String tamanho){
        this.cor = cor;
        this.tamanho = tamanho;
    }
    public String getCor() {
        return cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public abstract void calcularPrecoFinal(float acrescimo);


}
