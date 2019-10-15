package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        while (numero > 0 && numero < 500) {
            if (numero % 9 == 4) {
                System.out.println(numero);
            }
            numero = numero + 1;
        }
    }
}
