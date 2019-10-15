package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int quantidadeTanques, quantidadeLatas;
	    double diametroTanque, alturaTanque, areaAPintar, quantidadeTinta, custoFinal;
	    System.out.println("Quantos tanques de combustível devem ser pintado?");
	    quantidadeTanques = input.nextInt();
	    System.out.println("Qual o diâmetro dos tanques a serem pintados? (responder em metros)");
	    diametroTanque = input.nextDouble();
	    System.out.println("Qual a altura dos tanques a serem pintados? (resposta em metros)");
	    alturaTanque = input.nextDouble();
	    areaAPintar = quantidadeTanques * ((2*(Math.PI * Math.pow((diametroTanque/2),2))) + (2 * Math.PI * (diametroTanque/2)* alturaTanque));
	    quantidadeTinta = areaAPintar/3;
	    quantidadeLatas = (int) Math.round(quantidadeTinta/5);
	    custoFinal = quantidadeLatas * 45;
	    System.out.println("A quantidade de latas a serem compradas é " + quantidadeLatas + " e o valor a ser pago é de R$ " + custoFinal + ".");
    }
}
