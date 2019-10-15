package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroSeguimento, segundoSeguimento, terceiroSeguimento;
        String mensagem;
        System.out.println("Vamos verificar se os seguimentos de retas formam um triangulo.");
        System.out.println("Informe o tamanho do primeiro seguimento:");
        primeiroSeguimento = input.nextDouble();
        System.out.println("Informe o tamanho do segundo seguimento:");
        segundoSeguimento = input.nextDouble();
        System.out.println("Informe o tamanho do terceiro seguimento:");
        terceiroSeguimento = input.nextDouble();

        if (primeiroSeguimento < (segundoSeguimento + terceiroSeguimento) && segundoSeguimento < (primeiroSeguimento + terceiroSeguimento) && terceiroSeguimento < (primeiroSeguimento + segundoSeguimento)) {
            mensagem = "É possível formar um triangulo com seguimentos de tamanho " + primeiroSeguimento + ", " + segundoSeguimento + " e " + terceiroSeguimento + ".";
        }
        else {
            mensagem = "Não é possível formar um triangulo com seguimentos de tamanho " + primeiroSeguimento + ", " + segundoSeguimento + " e " + terceiroSeguimento + ".";
        }
        System.out.println(mensagem);
    }
}
