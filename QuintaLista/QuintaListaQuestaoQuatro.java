package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroNumero, segundoNumero, terceiroNumero, numeroMenor;
        String mensagem;
        System.out.println("Vamos verificar qual o menor número entre três.");
        System.out.println("Informe o primeiro número:");
        primeiroNumero = input.nextDouble();
        System.out.println("Informe o segundo número:");
        segundoNumero = input.nextDouble();
        System.out.println("Informe o terceiro número:");
        terceiroNumero = input.nextDouble();

        if(primeiroNumero != segundoNumero && primeiroNumero != terceiroNumero && segundoNumero != terceiroNumero) {
            if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
                numeroMenor = primeiroNumero;
            }
            else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
                numeroMenor = segundoNumero;
            }
            else {
                numeroMenor = terceiroNumero;
            }
            mensagem = "O menor numero entre " + primeiroNumero + ", " + segundoNumero + " e " + terceiroNumero + " é " + numeroMenor + ".";
        }
        else if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
            mensagem = "Todos os números tem o mesmo valor de " + primeiroNumero + ".";
        }
        else if(primeiroNumero == segundoNumero) {
            if (terceiroNumero < primeiroNumero) {
                numeroMenor = terceiroNumero;
            }
            else {
                numeroMenor = primeiroNumero;
            }
            mensagem = "O menor numero entre " + primeiroNumero + ", " + segundoNumero + " e " + terceiroNumero + " é " + numeroMenor + ".";
        }
        else if (segundoNumero == terceiroNumero) {
            if (primeiroNumero < segundoNumero) {
                numeroMenor = primeiroNumero;
            }
            else {
                numeroMenor = segundoNumero;
            }
            mensagem = "O menor numero entre " + primeiroNumero + ", " + segundoNumero + " e " + terceiroNumero + " é " + numeroMenor + ".";
        }
        else {
            if (segundoNumero < primeiroNumero) {
                numeroMenor = segundoNumero;
            }
            else  {
                numeroMenor = primeiroNumero;
            }
            mensagem = "O menor numero entre " + primeiroNumero + ", " + segundoNumero + " e " + terceiroNumero + " é " + numeroMenor + ".";
        }
        System.out.println(mensagem);
    }
}
