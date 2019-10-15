package com.CC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double valorTabela, imposto;
	    int anoCarro;
	    System.out.println("Verifique o imposto sobre transferência de veículo.");
	    System.out.println("Informe o ano de fabricação do veículo: (aaaa)");
	    anoCarro = input.nextInt();
	    System.out.println("Agora, informe o valor de tabela do veículo:");
	    valorTabela = input.nextDouble();
	    if (anoCarro < 2000) {
	        imposto = valorTabela * 0.01;
        }
	    else {
	        imposto = valorTabela * 0.015;
        }
	    System.out.println("O valor do imposto a ser pago na transferência é de R$"  + imposto + ".");
    }
}
