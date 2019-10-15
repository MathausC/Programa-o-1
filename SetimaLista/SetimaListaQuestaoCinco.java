package com.CC;

public class Main {

    public static void main(String[] args) {
        int numero = 1, numeroAnterior = 0, numeroSoma, contador = 0;
        while (contador < 30) {
            System.out.println(numero);
            numero = numero + numeroAnterior;
            numeroAnterior = numero - numeroAnterior;
            contador = contador + 1;
        }
    }
}
