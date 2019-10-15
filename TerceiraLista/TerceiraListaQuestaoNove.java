package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    double hExtras, hFaltas, total, bonificacao;
	    System.out.println("Vamos verificar qual a bonificação merecida do funcionário.");
	    System.out.println("Informe a quantidade de horas extras trabalhadas pelo funcionário:");
	    hExtras = input.nextDouble();
	    System.out.println("Agora, informe a quantidade de horas que o funcionário faltou ao trabalho:");
	    hFaltas = input.nextDouble();
	    total = hExtras - hFaltas;
	    if (total > 40) {
	        bonificacao = 200;
        }
	    else if (total > 30) {
	        bonificacao = 175;
        }
	    else if (total > 20) {
	        bonificacao = 150;
        }
	    else if (total > 10) {
	        bonificacao = 125;
        }
	    else {
	        bonificacao = 100;
        }
	    System.out.println("O funcionário receberá R$ " + bonificacao + " de gratificação de Natal.");
    }
}
