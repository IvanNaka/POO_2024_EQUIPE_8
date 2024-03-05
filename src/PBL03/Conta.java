package PBL03;

public class Conta {
    private String _nomeTitular;
    private int _numero;
    private double _saldo;

    public String getTitular(){
        return _nomeTitular;
    }
    public void setTitular(String nomeTitular){
        this._nomeTitular = nomeTitular;
    }

    public int getNumero(){
        return _numero;
    }
    public void setNumero(int numero) {
        this._numero = numero;
    }

    public double getSaldo(){
        return _saldo;
    }
    public void setSaldo(double saldo) {
        this._saldo = saldo;
    }
    public Conta(String nomeTitular, int numero, double saldo){
        this.setTitular(nomeTitular);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }
    public void depositar(double valorDepositado){
        setSaldo((this.getSaldo()+valorDepositado));
    }
    public boolean sacar(double valorSacado){
        if (this._saldo >=valorSacado){
            this._saldo -= valorSacado;
            return true;
        }else{
            return false;
        }
    }
}
