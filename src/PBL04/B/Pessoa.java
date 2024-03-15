package PBL04.B;

public class Pessoa {
    private String _nomeTitular;
    public String getTitular(){
        return _nomeTitular;
    }
    public void setTitular(String nomeTitular){
        this._nomeTitular = nomeTitular;
    }
    public Pessoa(String nomeTitular) {
        this.setTitular(nomeTitular);
    }
}
