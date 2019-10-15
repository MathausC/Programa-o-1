package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 15, quadrado;
        while (numero >= 15 && numero <= 25) {
            quadrado = numero * numero;
            System.out.println(quadrado);
            numero = numero + 1;
        }
    }
}
