package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int anoAtual;
	    String mensagem;
	    System.out.println("Verifique se o ano é bissexto.");
	    System.out.println("Informe o ano a ser verificado:");
	    anoAtual = input.nextInt();

	    if (anoAtual % 400 == 0) {
            mensagem = anoAtual + " é um ano bissexto.";
        }
	    else if (anoAtual % 4 == 0 && anoAtual % 100 != 0) {
            mensagem = anoAtual + " é um ano bissexto.";
        }
	    else {
	        mensagem = anoAtual + " não é um ano bissexto.";
        }
	    System.out.println(mensagem);
    }
}
