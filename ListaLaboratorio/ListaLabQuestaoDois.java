package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso, altura, iMC;
        char continuacao = 'S';
        String situacao;
        System.out.println("Vamos calcular os IMC's dos alumos da academia.");
        while (continuacao == 'S') {
            System.out.println("Informe o seu peso:");
            peso = scanner.nextDouble();
            while (peso < 30 || peso > 300) {
                System.out.println("O peso informado é inválido. Digite um peso entre 30 Kg");
                System.out.println("Informe o seu peso:");
                peso = scanner.nextDouble();
            }
            System.out.println("informe a sua altura:");
            altura = scanner.nextDouble();
            while (altura < 1 || altura > 2.5) {
                System.out.println("A altura informada é inválida. Digite uma altura entre 1 metro e 2,5 metros.");
                System.out.println("Informe sua altura:");
                altura = scanner.nextDouble();
            }
            iMC = peso / (Math.pow(altura, 2));
            if (iMC < 18.5) {
                situacao = "você está abaixo do peso.";
            }
            else if (iMC <= 25) {
                situacao = "parabéns, vocês está em seu peso ideal!";
            }
            else {
                situacao = "você está acima do peso (sobrepeso).";
            }
            System.out.println("Seu IMC é " + iMC + " e " + situacao);
            System.out.println("Você deseja calcular mais IMC's?");
            continuacao = scanner.next().charAt(0);
            while (continuacao != 'S' && continuacao != 'N') {
                System.out.println("Responda utilizando 'S' para sim e 'N' para não ");
                System.out.println("Você deseja calcular mais IMC's?");
                continuacao = scanner.next().charAt(0);
            }
        }
        System.out.println("O programa foi encerrado.");
    }
}
