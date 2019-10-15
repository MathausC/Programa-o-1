package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, somaAlturaHomens = 0, somaAlturaMulheres = 0, alturaMaiorHomens = 0, alturaMaiorMulheres = 0, alturaMenorHomens = 0, alturaMenorMulheres = 0, mediaAlturaHomens, mediaAlturaMulheres;
        char sexo;
        int contadorHomens = 0, contadorMulheres = 0;
        System.out.println("Vamos vericar a altura de 50 pessoas e separar os maiores e menores de cada sexo,");
        while ((contadorHomens + contadorMulheres) < 50) {
            System.out.println("Informe o sexo da pessoa: ('M' ou  'm' para masculino e 'F' ou 'f' para feminino");
            sexo = scanner.next().charAt(0);
            while (sexo != 'M' && sexo != 'm' && sexo != 'S' && sexo != 's') {
                System.out.println("Você informou o sexo incorretamente.");
                System.out.println("Informe o sexo da pessoa: ('M' ou  'm' para masculino e 'F' ou 'f' para feminino");
                sexo = scanner.next().charAt(0);
            }
            System.out.println("Informe a altura da pessoa: (A altura deve ser entre 0,5 e 2,0)");
            altura = scanner.nextDouble();
            while (altura < 0.5 || altura > 2.0) {
                System.out.println("Você informou a altura fora da faixa.");
                System.out.println("Informe a altura da pessoa: (A altura deve ser entre 0,5 e 2,0)");
                altura = scanner.nextDouble();
            }
            if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens = somaAlturaHomens + altura;
                if (alturaMaiorHomens < altura) {
                    alturaMaiorHomens = altura;
                }
                if (alturaMenorHomens > altura) {
                    alturaMenorHomens = altura;
                }
                contadorHomens = contadorHomens + 1;
            }
            if (sexo == 'F' || sexo == 'f') {
                somaAlturaMulheres = somaAlturaMulheres + altura;
                if (alturaMaiorMulheres < altura) {
                    alturaMaiorMulheres = altura;
                }
                if (alturaMenorMulheres > altura) {
                    alturaMenorMulheres = altura;
                }
                contadorMulheres = contadorMulheres + 1;
            }
        }

        mediaAlturaHomens = somaAlturaHomens / contadorHomens;
        mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
        System.out.println("A média da altura dos homens é de " + mediaAlturaHomens + " metros, a maior altura é de " + alturaMaiorHomens + " metros e a menor altura é de " + alturaMenorHomens + " metros.");
        System.out.println("A média da altura dos homens é de " + mediaAlturaMulheres + " metros, a maior altura é de " + alturaMaiorMulheres + " metros e a menor altura é de " + alturaMenorMulheres + " metros.");
    }
}
