package PBL04.B;

public class Conta {
    private Pessoa Titular;
    private int _numero;
    private double _saldo;

    // Métodos
   // public String getTitular(){
    //    return Pessoa;
   // }
    //public void setTitular(String nomeTitular){
    //    this.Pessoa = nomeTitular;
    // }

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
    public Conta(Pessoa nomeTitular, int numero, double saldo){
        this.Titular = nomeTitular;
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
