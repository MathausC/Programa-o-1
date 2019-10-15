package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String mensagem;
        System.out.println("Vamos verificar se o número está na faixa de 1 a 9");
        System.out.println("informe o número:");
        numero = input.nextInt();

        if (numero < 1 || numero > 9) {
            mensagem = "O valor não está dentro da faixa permitida";
        }
        else {
            mensagem = "O valor está dentro da faixa permitida";
        }
        System.out.println(mensagem);
    }
}
