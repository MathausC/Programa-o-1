package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeroNumeoro, segundoNumero, terceiroNumero, numeroMaior, numeroMenor, numeroMedio;
        String mensagem;
        System.out.println("verificaremos três números diferentes para comparação.");
        System.out.println("informe o primeiro número:");
        primeroNumeoro = input.nextDouble();
        System.out.println("informe o segundo número:");
        segundoNumero = input.nextDouble();
        System.out.println("Informe o terceiro e último número:");
        terceiroNumero = input.nextDouble();

        if (primeroNumeoro != segundoNumero && primeroNumeoro != terceiroNumero && segundoNumero != terceiroNumero) {
            if (primeroNumeoro > segundoNumero && primeroNumeoro > terceiroNumero) {
                numeroMaior = primeroNumeoro;
                if(segundoNumero > terceiroNumero) {
                    numeroMedio = segundoNumero;
                    numeroMenor = terceiroNumero;
                }
                else {
                    numeroMedio = terceiroNumero;
                    numeroMenor = segundoNumero;
                }
            }
            else if (segundoNumero > primeroNumeoro && segundoNumero > terceiroNumero) {
                numeroMaior = segundoNumero;
                if (primeroNumeoro > terceiroNumero) {
                    numeroMedio = primeroNumeoro;
                    numeroMenor = segundoNumero;
                }
                else {
                    numeroMedio = terceiroNumero;
                    numeroMenor = primeroNumeoro;
                }
            }
            else {
                numeroMaior = terceiroNumero;
                if (primeroNumeoro > segundoNumero) {
                    numeroMedio = primeroNumeoro;
                    numeroMenor = segundoNumero;
                }
                else {
                    numeroMedio = segundoNumero;
                    numeroMenor = primeroNumeoro;
                }
            }
            mensagem = "O maior numero é " + numeroMaior + ", o menor numero é " + numeroMenor + " e o numero entre eles é " + numeroMedio + ".";
        }
        else if (primeroNumeoro == segundoNumero && primeroNumeoro == terceiroNumero && segundoNumero == terceiroNumero){
            mensagem = "Os números tem o mesmo valor: " + primeroNumeoro + ".";
        }
        else if(primeroNumeoro == segundoNumero) {
            if (terceiroNumero > primeroNumeoro) {
                numeroMaior = terceiroNumero;
                numeroMenor = numeroMedio = primeroNumeoro;
            }
            else {
                numeroMaior = numeroMedio = primeroNumeoro;
                numeroMenor = terceiroNumero;
            }
            mensagem = "O numero " + numeroMaior + " é maior que " + numeroMenor;
        }
        else if(primeroNumeoro == terceiroNumero) {
            if (segundoNumero > primeroNumeoro) {
                numeroMaior = segundoNumero;
                numeroMenor = numeroMedio = primeroNumeoro;
            }
            else {
                numeroMaior = numeroMedio = primeroNumeoro;
                numeroMenor = segundoNumero;
            }
            mensagem = "O numero " + numeroMaior + " é maior que " + numeroMenor;
        }
        else {
            if (primeroNumeoro > segundoNumero) {
                numeroMaior = primeroNumeoro;
                numeroMenor = numeroMedio = segundoNumero;
            }
            else {
                numeroMaior = numeroMedio = segundoNumero;
                numeroMenor = primeroNumeoro;
            }
            mensagem = "O numero " + numeroMaior + " é maior que " + numeroMenor;
        }
        System.out.println(mensagem);
    }
}
