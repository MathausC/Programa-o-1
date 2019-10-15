package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, peso, pesoIdeal;
        char sexo;
        String mensagem;
        System.out.println("Vamos verificar se seu peso está dentro da idealidade");
        System.out.println("Informe o seu sexo utilizando 'M' para masculino e 'F' para feminino:");
        sexo = input.next().charAt(0);
        System.out.println("Agora, informe sua altura:");
        altura = input.nextDouble();
        System.out.println("Por fim, informe seu peso:");
        peso = input.nextDouble();
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;

            if (peso > pesoIdeal) {
                mensagem = "Seu peso está " + (peso - pesoIdeal) + " Kg a cima do ideal.";
            }
            else if (pesoIdeal == peso) {
                mensagem = "Você está no peso ideal.";
            }
            else {
                mensagem = "Seu peso está " + (pesoIdeal - peso) + " Kg abaixo do peso ideal.";
            }
        }
        else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;

            if (peso > pesoIdeal) {
                mensagem = "Seu peso está " + (peso - pesoIdeal) + " Kg a cima do ideal.";
            }
            else if (pesoIdeal == peso) {
                mensagem = "Você está no peso ideal.";
            }
            else {
                mensagem = "Seu peso está " + (pesoIdeal - peso) + " Kg abaixo do peso ideal.";
            }
        }
        else {
            mensagem = "Ao sexo informado não condiz com as regras estabelecidas. Reinicie o programa.";
        }
        System.out.println(mensagem);
    }
}
