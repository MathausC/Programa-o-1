package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double primeiroSeguimento, segundoSeguimento, terceiroSeguimento;
        String mensagem;
        System.out.println("Vamos verificar se os seguimentos de retas informados formam um triangulo e, se sim, de qual tipo.");
        System.out.println("Informe o primeiro seguimento:");
        primeiroSeguimento = input.nextDouble();
        System.out.println("Informe o segundo seguimento:");
        segundoSeguimento = input.nextDouble();
        System.out.println("Informe o terceiro seguimento:");
        terceiroSeguimento = input.nextDouble();

        if (primeiroSeguimento > (segundoSeguimento + terceiroSeguimento) && segundoSeguimento > (primeiroSeguimento + terceiroSeguimento) && terceiroSeguimento > (segundoSeguimento + terceiroSeguimento)) {
            if (primeiroSeguimento == segundoSeguimento && segundoSeguimento == terceiroSeguimento) {
                mensagem = "O triangulo é equilátero.";
            }
            else if (primeiroSeguimento == segundoSeguimento || primeiroSeguimento == terceiroSeguimento || segundoSeguimento == terceiroSeguimento) {
                mensagem = "O triangulo é isorceles.";
            }
            else {
                mensagem = "O triangulo é escaleno.";
            }
        }
        else {
            mensagem = "Não é possível formar um triangulo com esses seguimentos de retas.";
        }
        System.out.println(mensagem);
    }
}
