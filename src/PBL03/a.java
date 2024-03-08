package PBL03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class a {
    //Informações da conta
    private String nomeTitular;
    private int numConta;
    private double saldo;

    //Construindo a classe
    public a (String nomeTitular, int numConta, double saldoInicial){
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }
    //método para sacar dinheiro
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) { //so roda se for verdade valor maior que 0 e se valor for menor ou = saldo da conta
            saldo -= valor; // é uma abreviação: saldo = saldo - valor
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    //método para depositar
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor; //abreviação de valor = valor + saldo
        } else {
            System.out.println("valor inválido para deposito!");
        }
    }
    public double getSaldo(){
        return saldo;
    }
}