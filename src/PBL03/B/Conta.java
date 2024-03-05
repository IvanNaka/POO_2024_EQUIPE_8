package PBL03.B;
public class Conta {
    int numeroTitular;
    String nomeTitular;
    double saldoTitular;

    // Setters e Getters = Encapsulamento
    // Método Setter - Número da Conta
    void setNumeroTitular(int numeroTitular) {
        this.numeroTitular = numeroTitular;
    }
    // --------------------------------------
    // Método Setter - Titular da Conta
    void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    // --------------------------------------
    // Método Setter - Saldo da Conta
    void setSaldoTitular(double saldoTitular) {
        this.saldoTitular = saldoTitular;
    }
    // Método Getter - Saldo da Conta
    public double getSaldoTitular() {
        return saldoTitular;
    }
    // --------------------------------------
    // Método Setter - Incremento na Conta
    void depositar(double valor) {
        this.saldoTitular = this.saldoTitular +valor;
    }
    // --------------------------------------
    // Método Setter - Decremento na conta
    // void retirar(double valor) { this.saldoTitular = this.saldoTitular -valor; }
    boolean retirar(double valor) {
        if (this.saldoTitular >= valor && valor > 0) {
            this.saldoTitular -= valor;
            return true;
        } else
            return false;
    }
}
