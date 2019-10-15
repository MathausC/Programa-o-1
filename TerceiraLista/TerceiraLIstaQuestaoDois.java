package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coefA, coefB, resultado;
        System.out.println("Calculadora da raiz de equações de primeiro grau.");
        System.out.println("Informe o coeficiente angular da equalção (com valor diferente de 0):");
        coefA = input.nextDouble();
        System.out.println("Informe o coeficiente linear da equalção:");
        coefB = input.nextDouble();
        if(coefA == 0){
            System.out.println("O coeficiente angular deve ser diferente de 0 (zero).");
            System.out.println("Reinicie o programa para recalcular.");
        }
        else{
            resultado = coefB/coefA;
            System.out.println("A raiz da equação de primeiro grau é " + resultado + ".");
        }
    }
}
