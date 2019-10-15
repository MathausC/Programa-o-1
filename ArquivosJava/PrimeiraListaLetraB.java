package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoProduto, desconto, precoFinal, percentualDesconto;
        System.out.println("Qual o preço original do produto? (informar em reais R$)");
        precoProduto = input.nextDouble();
        System.out.println("Qual o desconto do produto? (informar em percentual %)");
        percentualDesconto = input.nextDouble();
        desconto = precoProduto * (percentualDesconto / 100);
        precoFinal = precoProduto - desconto;
        System.out.println("O preço real do produto é R$" + precoProduto + ".");
        System.out.println("O preço final do produto é R$" + precoFinal + ".");
        System.out.println("O desconto dado é R$" + desconto + ".");

    }
}
