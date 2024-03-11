package PBL04;

import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int _nivel;
    private List<Jogador> _listaJogadores;
    private List<Double> _listaPontos;
    public int getNivel(){
        return this._nivel;
    }
    public void setNivel(int nivel){
        this._nivel = nivel;
    }
    public List<Jogador> getListaJogadores(){
        return this._listaJogadores;
    }
    public void setListaJogadores(List<Jogador> listaJogadores){
        this._listaJogadores = listaJogadores;
    }
}
