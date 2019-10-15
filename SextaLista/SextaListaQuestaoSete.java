package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char caracter;
        String mensagem;
        System.out.println("Vamos verificar qual tipo de caracter você digitou.");
        System.out.println("Digite um caracter:");
        caracter = input.next().charAt(0);
        while (caracter != '#') {
            if (Character.isLetter(caracter)) {
                if (Character.isUpperCase(caracter)) {
                    if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                        mensagem = "Seu caractere é uma vogal maiúscula.";
                    }
                    else {
                        mensagem = "Seu caractere é uma consoante maiúscila.";
                    }
                }
                else {
                    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                        mensagem = "Seu caractere é uma vogal minúscula.";
                    }
                    else {
                        mensagem = "Seu caractere é uma consoante minúscula.";
                    }
                }
            }
            else if (Character.isDigit(caracter)) {
                mensagem = "Seu caracter é um número";
            }
            else {
                mensagem = "Seu caracter é um símbolo";
            }

            System.out.println(mensagem);
            System.out.println("Para encerrar, digite '#' ou outro caracter para continuar a identificação.");
            caracter = input.next().charAt(0);
        }

    }

}

