package PBL03.B;

import java.util.Scanner;
import java.util.InputMismatchException;
public class PBL03 {
    public  static void main (String[] args){
        Scanner inputUsuario = new Scanner(System.in);
        System.out.print("Digite o Número de sua Conta: ");
        int numeroTitular = inputUsuario.nextInt();
        System.out.print("Digite o Nome para o Titular da Conta: ");
        String nomeTitular = inputUsuario.next();
        System.out.print("Digite o Saldo de sua Conta: ");
        double saldoTitular = inputUsuario.nextDouble();

        // Instanciação da classe Conta, utilizando seu construtor(3 parâmetros), para criar o objeto contaObj
        // Esses argumentos são usados pra iniciar os atributos da nova instância e recebem os valores fornecidos
        Conta contaObj = new Conta(nomeTitular, numeroTitular, saldoTitular);
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo " + contaObj.getNome() + " (Conta Nº" + contaObj.getNumero() + ")" + ", seu Saldo é de: R$" + String.format("%.2f", contaObj.getSaldo()).replace('.', ',') + ".");

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
                        System.out.println("Depósito realizado com Sucesso. \nSeu Novo saldo é de: R$" + contaObj.getSaldo());
                        break;
                    case 2:
                        System.out.println("Digite o valor do saque:");
                        double valorSaque = inputUsuario.nextDouble();
                        if (contaObj.retirar(valorSaque)) {
                            System.out.println("--------------------------------------------------");
                            System.out.println("Saque realizado com Sucesso. \nSeu Novo saldo é de: R$" + contaObj.getSaldo());
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