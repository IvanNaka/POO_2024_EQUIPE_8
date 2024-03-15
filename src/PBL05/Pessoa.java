package PBL05;

import java.util.HashSet;
import java.util.List;

public class Pessoa implements IPessoa {
    private String _nome;
    private int _idade;
    private String _tipo;

    public String getNome(){
        return this._nome;
    }
    public void setNome(String nome){
        this._nome = nome;
    }
    public int getIdade(){
        return this._idade;
    }
    public void setIdade(int idade){
        this._idade = idade;
    }
    public String getTipo(){
        return this._tipo;
    }
    public void setTipo(String tipo){
        if (getListaTipos().contains(tipo)){
            this._tipo = tipo;
        }
        else {
            System.out.println("Tipo de usuário inválido!");
        }
    }
    public static HashSet<String> getListaTipos() {
        HashSet<String> listaTipos = new HashSet<>();
        listaTipos.add("Cliente");
        listaTipos.add("Funcionário");
        listaTipos.add("Gerente");
        return listaTipos;
    }
    public void alterarNome() {
        //Código meio inútil mas fiz pra utilizar interface

    }
    public void alterarIdade() {

    }
}
