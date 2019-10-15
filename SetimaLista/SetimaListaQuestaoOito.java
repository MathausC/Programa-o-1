package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroInicio, fatorial = 0, contador = 1;
        String mensagem;
        System.out.println("Informe o numero e saiba o fatorial dele:");
        numeroInicio = scanner.nextInt();
        fatorial = fatorial + numeroInicio;
        if (numeroInicio < 0) {
            mensagem = "Não existe fatorial.";
        }
        else if (numeroInicio <= 1) {
            mensagem = "O fatorial de "  + numeroInicio + " é 1";
        }
        else {
            while (contador < numeroInicio) {
                fatorial = fatorial * (numeroInicio - contador);
                contador = contador + 1;
            }
            mensagem = "O fatorial de " + numeroInicio + " é " + fatorial + ".";
        }
        System.out.println(mensagem);
    }
}
