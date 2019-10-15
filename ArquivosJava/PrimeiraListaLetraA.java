package com.CC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double tempoViagem, velocidadeMedia, consumoCombustivel;
            System.out.println("Quanto tempo levou a sua viagem? (resposta em horas)");
            tempoViagem = input.nextInt();
            System.out.println("Qual a velocidade média da viagem? (resposta em km/h)");
            velocidadeMedia = input.nextDouble();
            System.out.println("Qual o consumo médio de combustível por quilômetro do seu veículo?");
            consumoCombustivel = input.nextDouble();
            double distancia = tempoViagem * velocidadeMedia;
            double combustívelConsumido = distancia / consumoCombustivel;
            System.out.println("Seu consumo de combustível durante a viagem foi de " + combustívelConsumido + ".");
    }
}
