package com.CC;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao verificador de  permissão de voto.");
        System.out.println("Informe a idade para a verificação:");
        int idade = input.nextInt();
        String permissao;
        if(idade < 16){
            permissao = "não pode";
        }
        else{
            permissao = "pode";
        }
        System.out.println("Esta pessoa tem " + idade + " anos e " + permissao + " votar.");
    }
}
