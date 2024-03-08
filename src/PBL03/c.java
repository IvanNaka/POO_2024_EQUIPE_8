package PBL03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class c {
    private String nomeTitular;
    private int numConta;
    private double saldo;

    public c (String nomeTitular, int numConta, double saldoInicial){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public double getSaldo(){
        return saldo;
    }
    public void exibirInfo(){
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Numero da Conta: " + numConta);
        System.out.println("Saldo da conta: " + saldo);
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        List<c> contas = new ArrayList<>();
        int numeroConta = 1;

        int opcao;
        do {
            System.out.println("\nOpções:");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Ver saldo de uma conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("Outro número - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do tirular: ");
                    String nomeTitular = scanner.next();
                    System.out.print("Informe o saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    c novaConta = new c(nomeTitular, numeroConta++, saldoInicial);
                    contas.add(novaConta);
                    System.out.println("\nConta criada com sucesso. \nNúmero da conta: " + novaConta.numConta);
                    break;
                case 2:
                    System.out.print("Informe o número da conta: ");
                    int numContaSaldo = scanner.nextInt();
                    for (c conta : contas) {
                        if (conta.numConta == numContaSaldo) {
                            System.out.println("\nSaldo da conta " + numContaSaldo + ": " + conta.getSaldo());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o número da conta: ");
                    int numContaSaque = scanner.nextInt();
                    for (c conta : contas) {
                        if (conta.numConta == numContaSaque) {
                            System.out.print("Informe o valor a ser sacado: ");
                            double valorSaque = scanner.nextDouble();
                            boolean saqueEfetuado = conta.sacar(valorSaque);
                            if (saqueEfetuado) {
                                System.out.println("Saque efetuado com sucesso.");
                            } else {
                                System.out.println("Saque não efetuado. Saldo insuficiente ou valor inválido.");
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Informe o número da conta: ");
                    int numContaDeposito = scanner.nextInt();
                    for (c conta : contas) {
                        if (conta.numConta == numContaDeposito) {
                            System.out.print("Informe o valor a ser depositado: ");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                            System.out.println("Depósito efetuado com sucesso.");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Encerrando o programa.");
            }
        } while (opcao >= 1 && opcao <= 4);

        // Fechando o scanner
        scanner.close();
    }
}