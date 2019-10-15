package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diametroCaixa, alturaCaixa, volumeCaixa;
        System.out.println("Qual o diâmetro da caixa d'água?");
        diametroCaixa = input.nextDouble();
        System.out.println("Quala altura da caixa d'água?");
        alturaCaixa = input.nextDouble();
        volumeCaixa = ((Math.PI * Math.pow((diametroCaixa/2), 2)) * alturaCaixa) * 1000000;
        System.out.println("O volume da cixa d'água é de " + volumeCaixa + " ml.");
    }
}
