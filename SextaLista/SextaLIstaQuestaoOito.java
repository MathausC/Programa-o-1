package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorMeses = 0, mesesDeInvestimento = 0;
        double valorInvestimento, valorFinal, lucro;
        char deveContinuar;
        String mensagemPoup, mensagemFundo, mensagemCDB;
        System.out.println("Vamos verificar qual o seu lucro de acordo com os investimentos dsponíveis e o tempo de investimento.");
        System.out.println("Você deseja investir na poupança? 'S' para sim e 'N' para não");
        deveContinuar = input.next().charAt(0);
        while (deveContinuar != 'S' && deveContinuar != 'N') {
            System.out.println("Vocês a resposta de forma errada.");
            System.out.println("Você deseja investir na poupança? 'S' para sim e 'N' para não");
            deveContinuar = input.next().charAt(0);
        }
        if (deveContinuar == 'S') {
            System.out.println("O quanto você deseja investir na polpança? minimo de R$100,00");
            valorInvestimento = input.nextDouble();
            valorFinal = valorInvestimento;
            while (valorInvestimento < 100) {
                System.out.println("Vocês deve investir no mínimo R$100,00.");
                System.out.println("O quanto você deseja investir na polpança?");
                valorInvestimento = input.nextDouble();
                valorFinal = valorInvestimento;
            }
            System.out.println("Quantos meses vocês deseja investir?");
            mesesDeInvestimento = input.nextInt();
            while (mesesDeInvestimento < 1) {
                System.out.println("O valor dos meses deve ser maior ou igual a 1 mês.");
                mesesDeInvestimento = input.nextInt();
            }
            while (contadorMeses <= mesesDeInvestimento) {
                valorFinal = valorFinal * 1.005;
                contadorMeses = contadorMeses + 1;
            }
            lucro = valorFinal - valorInvestimento;
            mensagemPoup = "O seu lucro investindo R$" + valorInvestimento + " por " + mesesDeInvestimento + " meses na poupança lhe renderá R$" + lucro + " de lucro.";
        }
        else {
            mensagemPoup = "Você descidiu não investir na poupança.";
        }

        System.out.println("Você deseja investir no fundo de renda fixa? 'S' para sim e 'N' para não");
        deveContinuar = input.next().charAt(0);
        while (deveContinuar!= 'S' && deveContinuar != 'N') {
            System.out.println("Vocês a resposta de forma errada.");
            System.out.println("Você deseja investir no fundo de renda fixa? 'S' para sim e 'N' para não");
            deveContinuar = input.next().charAt(0);
        }
        if (deveContinuar == 'S') {
            System.out.println("O quanto você deseja investir no fundo de renda fixa? minimo de R$1000,00");
            valorInvestimento = input.nextDouble();
            valorFinal = valorInvestimento;
            while (valorInvestimento < 1000) {
                System.out.println("Vocês deve investir no mínimo R$1000,00.");
                System.out.println("O quanto você deseja investir no fundo de renda fixa?");
                valorInvestimento = input.nextDouble();
                valorFinal = valorInvestimento;
            }
            System.out.println("Quantos meses vocês deseja investir?");
            mesesDeInvestimento = input.nextInt();
            while (mesesDeInvestimento < 1) {
                System.out.println("O valor dos meses deve ser maior ou igual a 1 mês.");
                mesesDeInvestimento = input.nextInt();
            }
            while (contadorMeses <= mesesDeInvestimento) {
                valorFinal = valorFinal * 1.01;
                contadorMeses = contadorMeses + 1;
            }
            lucro = valorFinal - valorInvestimento;
            mensagemFundo = "O seu lucro investindo R$" + valorInvestimento + " por " + mesesDeInvestimento + " meses no fundo de renda fixa lhe renderá R$" + lucro + " de lucro.";
        }
        else {
            mensagemFundo = "Você descidiu não investir no fundo de renda fixa.";
        }

        System.out.println("Você deseja investir em CDB's? 'S' para sim e 'N' para não");
        deveContinuar = input.next().charAt(0);
        while (deveContinuar!= 'S' && deveContinuar != 'N') {
            System.out.println("Vocês a resposta de forma errada.");
            System.out.println("Você deseja investir em CDB's? 'S' para sim e 'N' para não");
            deveContinuar = input.next().charAt(0);
        }
        if (deveContinuar == 'S') {
            System.out.println("O quanto você deseja investir em CDB's? minimo de R$2500,00");
            valorInvestimento = input.nextDouble();
            valorFinal = valorInvestimento;
            while (valorInvestimento < 2500) {
                System.out.println("Vocês deve investir no mínimo R$2500,00.");
                System.out.println("O quanto você deseja investir no fundo de renda fixa?");
                valorInvestimento = input.nextDouble();
                valorFinal = valorInvestimento;
            }
            System.out.println("Quantos meses vocês deseja investir?");
            mesesDeInvestimento = input.nextInt();
            while (mesesDeInvestimento < 1) {
                System.out.println("O valor dos meses deve ser maior ou igual a 1 mês.");
                mesesDeInvestimento = input.nextInt();
            }
            while (contadorMeses <= mesesDeInvestimento) {
                valorFinal = valorFinal * 1.015;
                contadorMeses = contadorMeses + 1;
            }
            lucro = valorFinal - valorInvestimento;
            mensagemCDB = "O seu lucro investindo R$" + valorInvestimento + " por " + mesesDeInvestimento + " meses em CDB's lhe renderá R$" + lucro + " de lucro.";
        }
        else {
            mensagemCDB = "Você descidiu não investir no fundo de renda fixa.";
        }
        System.out.println(mensagemPoup);
        System.out.println(mensagemFundo);
        System.out.println(mensagemCDB);
    }

}
