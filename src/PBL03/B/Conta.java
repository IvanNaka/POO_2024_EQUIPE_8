package PBL03.B;
// Setters e Getters = Encapsulamento
public class Conta {
    // Atributos -------------------------------------------------------------------
    private String _nome;
    private int _numero;
    private double _saldo;
    // Métodos ---------------------------------------------------------------------
    // Método Construtor
    // Este é o método construtor da classe Conta, chamado automaticamente qnd um novo obj Conta é criado
    // Ele inicializa os atributos da instância com os valores fornecidos como parâmetros.
    public Conta(String nomeTitular, int numero, double saldo){
        this.setNome(nomeTitular);
        this.setNumero(numero);
        this.setSaldo(saldo);
    }
    // ----------------------------------------------------------------------------
    // Método Setter e Getter - Número da Conta
    // Setter - atribui um valor ao atributo _numero
    public void setNumero(int numeroTitular) {
        this._numero = numeroTitular;
    }
    // Getter - retorna o valor do atributo _numero
    public int getNumero(){
        return _numero;
    }
    // ----------------------------------------------------------------------------
    // Método Setter e Getter  - Nome Titular da Conta
    // Setter - atribui um valor ao atributo _nome
    public void setNome(String nomeTitular) {
        this._nome = nomeTitular;
    }
    // Getter - retorna o valor do atributo _nome
    public String getNome(){
        return _nome;
    }
    // ----------------------------------------------------------------------------
    // Método Setter e Getter - Saldo da Conta
    // Setter - atribui um valor ao atributo _saldo
    public void setSaldo(double saldoTitular) {
        this._saldo = saldoTitular;
    }
    // Getter - retorna o valor do atributo _saldo
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
    // Diminui o saldo da conta pelo valor fornecido
    // Se o saldo for suficiente e o valor for positivo, retorna true
    // Caso contrário, retorna false
    public boolean retirar(double valor) {
        if (this._saldo >= valor && valor > 0) {
            this._saldo -= valor;
            return true;
        } else
            return false;
    }
}
