package PBL03.B;

import PBL03.B.Conta;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public  static void main (String[] args){
        // método contrutor - instaciação da classe Conta para criar o objeto contaObj
        Conta contaObj = new Conta();
        Scanner inputUsuario = new Scanner(System.in);

        System.out.print("Digite o Número de sua Conta: ");
        int numeroTitular = inputUsuario.nextInt();
        contaObj.setNumeroTitular(numeroTitular);

        System.out.print("Digite o Nome para o Titular da Conta: ");
        String nomeTitular = inputUsuario.next();
        contaObj.setNomeTitular(nomeTitular);

        System.out.print("Digite o Saldo de sua Conta: ");
        double saldoTitular = inputUsuario.nextDouble();
        contaObj.setSaldoTitular(saldoTitular);

        // Transformando o Double em String para que o ponto seja substítuido por uma vírgula - .2f coloca com duas casas decimais
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo " + contaObj.nomeTitular + ", seu Saldo é de: R$" + String.format("%.2f", contaObj.saldoTitular).replace('.', ',') + ".");
        // System.out.println("Bem vindo, " + contaObj.nomeTitular + ", seu Saldo é de: R$" + saldoTitular + ".");

        boolean continuar = true;

        while (continuar) {
            System.out.println("--------------------------------------------------");
            System.out.println("SELECIONE A OPÇÃO DESEJADA");
            System.out.println("1 - Depositar.");
            System.out.println("2 - Sacar.");
            System.out.println("Outro Número - Encerrar Conexão (SAIR).");
            try {
                int escolhaUsuario = inputUsuario.nextInt();

                switch (escolhaUsuario) {
                    case 1:
                        System.out.print("Digite o Valor para Depósito:");
                        double valorDeposito = inputUsuario.nextDouble();
                        contaObj.depositar(valorDeposito);
                        System.out.println("--------------------------------------------------");
                        System.out.println("Depósito realizado com Sucesso. \nSeu Novo saldo é de: R$" + contaObj.getSaldoTitular());
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque:");
                        double valorSaque = inputUsuario.nextDouble();
                        if (contaObj.retirar(valorSaque)) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Saque realizado com Sucesso. \nSeu Novo saldo é de: R$" + contaObj.getSaldoTitular());
                        } else {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Seu Saldo é Insuficiente. \nOperação Não Realizada.");
                        }
                        break;
                    default:
                        continuar = false;
                        System.out.println("Conexão Encerrada.");
                        System.out.println(".");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("--------------------------------------------------");
                System.out.println("Entrada inválida. Certifique-se de inserir um número.");
                inputUsuario.next();
            }
        }
    }
}