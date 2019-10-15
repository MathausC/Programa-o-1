package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero  = 1, numeroMaior = 0, numeroMenor = 0;
        System.out.println("Vamos verificar qual do maior número dos conjuntos digitados.");
        while (numero != 0) {
            System.out.println("Digite um número do seu conjunto: (Zero para encerrar)");
            numero = scanner.nextInt();
            while (numero < 0) {
                System.out.println("O número não pode ser negativo.");
                System.out.println("Digite um número do seu conjunto:");
                numero = scanner.nextInt();
            }
            if(numero > numeroMaior) {
                numeroMaior = numero;
            }
            if(numero < numeroMenor) {
                numeroMenor = numero;
            }
        }
        System.out.println("O maior número do conjunto digitado é " + numeroMaior + " e o menor é " + numeroMenor + ".");
        System.out.println("Programa encerrado.");
    }
}
