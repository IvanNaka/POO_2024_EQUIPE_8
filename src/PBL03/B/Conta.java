package PBL03.B;
// Setters e Getters = Encapsulamento
public class Conta {
    // Atributos -------------------------------------------------------------------
    private String _nome;
    private int _numero;
    private double _saldo;
    // Métodos ---------------------------------------------------------------------
    // Método Construtor
    public Conta(String nomeTitular, int numero, double saldo){
        this.setNome(nomeTitular);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }
    // Método Setter e Getter - Número da Conta
    public int getNumero(){
        return _numero;
    }
    public void setNumero(int numeroTitular) {
        this._numero = numeroTitular;
    }
    // ----------------------------------------------------------------------------
    // Método Setter e Getter  - Nome Titular da Conta
    public String getNome(){
        return _nome;
    }
    public void setNome(String nomeTitular) {
        this._nome = nomeTitular;
    }
    // ----------------------------------------------------------------------------
    // Método Setter - Saldo da Conta
    public void setSaldo(double saldoTitular) {
        this._saldo = saldoTitular;
    }
    // Método Getter - Saldo da Conta
    public double getSaldo() {
        return _saldo;
    }
    // ----------------------------------------------------------------------------
    // Método Setter - Incremento na Conta
    public void depositar(double valor) {
        this._saldo += valor;
    }
    // ----------------------------------------------------------------------------
    // Método Setter - Decremento na conta
    // void retirar(double valor) { this.saldoTitular = this.saldoTitular -valor; }
    public boolean retirar(double valor) {
        if (this._saldo >= valor && valor > 0) {
            this._saldo -= valor;
            return true;
        } else
            return false;
    }
}
