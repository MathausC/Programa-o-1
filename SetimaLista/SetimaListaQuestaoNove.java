package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contador = 1;
        System.out.println("Informe o número:");
        numero = scanner.nextInt();
        while (numero >= 0) {
            while (contador <= numero) {
                if (contador < numero) {
                    System.out.print(contador + " ");
                }
                else {
                    System.out.println(contador);
                }
                contador = contador + 1;
            }
            numero = numero - 1;
            contador = 1;
        }
    }
}
