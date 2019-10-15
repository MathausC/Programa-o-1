package com.CC;

public class Main {

    public static void main(String[] args) {
        double numero = 1, numeroSoma = 0, contador = 0;
        while (contador < 64) {
            numeroSoma = numeroSoma + numero;
            numero =  numero * 2;
            contador = contador + 1;
        }
        System.out.println(numeroSoma);
    }
}
