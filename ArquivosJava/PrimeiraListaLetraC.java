package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorMulta, valorJuros, valorFatura, valorTotalMulta, valorTotalJuros, valorFinal;
        int diasAtraso;
        System.out.println("Qual o valor da fatura?");
        valorFatura = input.nextDouble();
        System.out.println("Qual o valor da multa diária?");
        valorMulta = input.nextDouble();
        System.out.println("Qual o valor dos juros diário?");
        valorJuros = input.nextDouble();
        System.out.println("Quantos dias você atrasou?");
        diasAtraso = input.nextInt();
        valorTotalMulta = valorMulta * diasAtraso;
        valorTotalJuros = valorFatura * (valorJuros / 100) * diasAtraso;
        valorFinal = valorFatura + valorTotalMulta + valorTotalJuros;
        System.out.println("O valor a ser pago após " + diasAtraso + " dias é de R$" + valorFinal + ".");
    }
}
