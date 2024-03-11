package PBL04;


import java.util.List;

public class Jogador {
    private String _nome;
    private List<Pontuacao> _listaPontos;

    public void setNome(String nome){
        this._nome = nome;
    }
    public String getNome(){
        return this._nome;
    }
    public List<Pontuacao> getListaPontos(){
        return this._listaPontos;
    }
    public void set_listaPontos(){

    }
}
