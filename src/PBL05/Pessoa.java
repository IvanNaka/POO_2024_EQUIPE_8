package PBL05;

import java.util.HashSet;
import java.util.List;

public class Pessoa implements IPessoa {
    private String _nome;
    private String _tipo;

    public String getNome(){
        return this._nome;
    }

    public void setNome(String nome){
        this._nome = nome;
    }

    public String getTipo(){
        return this._tipo;
    }
    public void setTipo(String tipo){
        this._tipo = tipo;
    }
    public static HashSet<String> getTiposDisponiveis() {
        HashSet<String> listaTipos = new HashSet<>();
        listaTipos.add("Cliente");
        listaTipos.add("Funcionário");
        listaTipos.add("Gerente");
        return listaTipos;
    }

    public static HashSet<String> getListaTipos() {
        HashSet<String> listaTipos = new HashSet<>();
        listaTipos.add("Cliente");
        listaTipos.add("Funcionário");
        listaTipos.add("Gerente");
        return listaTipos;
    }
    public void alterarNome() {

    }
}
