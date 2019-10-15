package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, maior = 0, menor = 0;
        System.out.println("Vamos comparar dois números e ver qual deles é maior.");
        System.out.println("Digite o primeiro numero:");
        n1 = input.nextInt();
        System.out.println("Agora digite o segundo múmero:");
        n2 = input.nextInt();
        if (n1 > n2){
            maior = n1;
            menor = n2;
        }
        else if(n1 < n2){
            maior = n2;
            menor = n1;
        }
        else{
            System.out.println("Os números são iguais.");
        }
        System.out.println("O número " + maior + " é maior que o número " + menor + ".");
    }
}
