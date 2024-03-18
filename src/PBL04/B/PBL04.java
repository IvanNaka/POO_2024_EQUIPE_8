package PBL04.B;

import PBL03.C.Conta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PBL04 {
    public static void main (String[] args) {
        ArrayList<Conta> listaContas = new ArrayList<>();
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        while (continuar){
            try{
                System.out.println("Digite a operação desejada:\n 1-Criar conta\n 2-Consultar saldo\n 3-Sacar\n 3-Depositar \n Outro-Encerrar");
                String operacao = input.next();
                switch (operacao){
                    case "1":
                        System.out.println("Insira os seguintes dados para a conta");
                        System.out.println("Nome do titular: ");
                        String nomeTitular = input.next();
                        System.out.println("Saldo inicial: ");
                        double saldo = input.nextDouble();
                        int numeroConta = listaContas.size() + 1;
                        Conta contaObj = new Conta(nomeTitular, numeroConta, saldo);
                        listaContas.add(contaObj);
                        System.out.println("Conta número " + contaObj.getNumero() + " criada com sucesso.");
                        break;
                    case "2":
                        System.out.println("Qual conta será consultada?");
                        int numeroSaldo = input.nextInt();
                        Conta contaSaldo = listaContas.get(numeroSaldo-1);
                        System.out.println("O saldo da conta " + numeroSaldo + " é " + "R$" + contaSaldo.getSaldo());
                        break;
                    case "3":
                        System.out.println("Qual conta será utilizada?");
                        int numeroSaque = input.nextInt();
                        System.out.println("Qual o valor a ser sacado?");
                        double valorSaque = input.nextDouble();
                        Conta contaSaque = listaContas.get(numeroSaque-1);
                        boolean valorSacado =  contaSaque.sacar(valorSaque);
                        if (valorSacado){
                            System.out.println("Valor sacado com sucesso!");
                        }else{
                            System.out.println("Saldo insuficiente!");
                        }
                        break;
                    case "4":
                        System.out.println("Qual conta será utilizada?");
                        int numeroDeposito = input.nextInt();
                        System.out.println("Qual o valor a ser depositado?");
                        double valorDeposito = input.nextDouble();
                        Conta contaDeposito = listaContas.get(numeroDeposito-1);
                        contaDeposito.depositar(valorDeposito);
                        break;
                    default:
                        continuar = false;
                }
            }catch(IndexOutOfBoundsException | InputMismatchException e){
                System.out.println("Número inválido!");
            }catch (Exception e){
                System.out.println("Erro ao realizar operação!");
            }
        }
    }
}
