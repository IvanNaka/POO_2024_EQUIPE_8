package PBL03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class b {
    private String nomeTitular;
    private int numConta;
    private double saldo;

    public b (String nomeTitular, int numConta, double saldoInicia){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldoInicia;
    }
    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    public void depositar(double valor){
        if (valor > 0);{
            saldo += valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    //Método para exigibir informação da conta
    public void exiberInfo(){
        System.out.println("Titular da conta: " + nomeTitular);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }
    //aqui você ira pedir as informações da conta
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informações da conta");
        System.out.println("Digite o nome do Titular: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o numero da Conta: ");
        int num = scanner.nextInt();
        System.out.println("Digite o saldo:");
        double saldoInicial = scanner.nextDouble();

        //Criando conta com as informações anteriores
        b minhaConta = new b(nome, num, saldoInicial);

        int opcao;
        do {
            System.out.println("\nOpções:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("Outro número - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("informe o valor a ser depositado: ");
                    double valorDesposito = scanner.nextDouble();
                    minhaConta.depositar(valorDesposito);
                    System.out.println("\nSaldo atualizado: " + minhaConta.getSaldo());
                    break;
                case 2:
                    System.out.println("Informe o valor a ser sacado: ");
                    double valorSacar = scanner.nextDouble();
                    boolean saqueEfetuado = minhaConta.sacar(valorSacar);
                    if (saqueEfetuado){
                        System.out.println("Saque efetuado com secesso!");
                        System.out.println("\nSaldo atualizado: " + minhaConta.getSaldo());
                    } else {
                        System.out.println("Saque não efetuado. \nSaldo insuficiente ou valor inválido!");
                    }
                    break;
                default:
                    System.out.println("Encerrando o programa");
            }
        }while (opcao == 1 || opcao == 2);

        scanner.close();
    }
}