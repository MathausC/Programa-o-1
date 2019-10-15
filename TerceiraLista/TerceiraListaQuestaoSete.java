package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        String mensagem;
	    System.out.println("Vamos calcular a raiz de uma equação se segundo grau.");
	    System.out.println("Informe o coeficiente de segundo grau da equação:");
	    a = input.nextDouble();
	    System.out.println("Agora, informe o coeficiente de primeiro grau da equação:");
	    b = input.nextDouble();
        System.out.println("Finalmente, informe o coeficiente de zero grau da equação:");
        c = input.nextDouble();
        delta = Math.pow( b, 2) - (4 * a * c);
        if(delta > 0){
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);
            mensagem = "As raizes da sua esquação  de segundo são:  x1 = " + x1 + ", x2 = " + x2 + ".";
        }
        else if(delta == 0){
            x1 = x2 = -b / (2 * a);
            mensagem = "A sua equação só possui uma raiz de valor " + x1 + ".";
        }
        else {
            mensagem = "Sua equação não possui raiz real.";
        }
        System.out.println(mensagem);
    }
}
