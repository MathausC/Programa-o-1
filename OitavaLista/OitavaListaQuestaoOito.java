package com.CC;
import java.util.Scanner;

public class OitavaListaQuestaoOito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double altura, peso;
		int idade, quantPessoas, cont, acimaCinquentaMenosSessenta = 0, pessoasMenos150 = 0, somaIdadeMenos150 = 0, mediaIdadeMenos150, pessoasRuivasNaoAzul = 0, pessoasOlhosAzuis = 0, percentualPessoasOlhosAzuis;
		char cabelo, olhos;
		
		System.out.println("Vamos fazer a caracterização de um grupo de pessoas.");
		do {
			System.out.print("Informe a quantidade de pessoas a serem caracterizadas: ");
			quantPessoas = scanner.nextInt();
			if(quantPessoas < 1) {
				System.out.println("A quantidade de pessoas deve ser no mínimo 1.");
			}
		}
		while(quantPessoas < 1);
		
		System.out.println("Agora, vamos começar a cadastrar.");
		
		for(cont = 1; cont <= quantPessoas; cont++) {
			System.out.println(cont + "º cadastro de " + quantPessoas + ".");
			do {
				System.out.print("Informe a idade  da pessoa: ");
				idade = scanner.nextInt();
				if(idade < 1 || idade > 120) {
					System.out.println("A idade deve ser informado com valor entre 1 e 120 anos.");
				}
			}
			while(idade < 1 || idade > 120);
			
			do {
				System.out.print("Informe o peso da pessoa: ");
				peso = scanner.nextDouble();
				if(peso < 3 || peso > 300) {
					System.out.println("O peso deve ser informado com valor entre entre 3 e 300 Kg.");
				}
			}
			while(peso < 3 || peso > 300);
			
			do {
				System.out.print("Informe a altura da pessoa: ");
				altura = scanner.nextDouble();
				if(altura < 0.5 || altura > 2.5) {
					System.out.println("A altura deve ser informada com valores entre 0,5 e 2,5 metros");
				}
			}
			while(altura < 0.5 || altura > 2.5);
			
			do {
				System.out.println("Use: A - Azul, P - Preto, C - Castanho, V - Verde.");
				System.out.print("Informe a cor dos olhos da pessoa: ");
				olhos = scanner.next().charAt(0);
				if(olhos != 'A' && olhos != 'a' && olhos != 'P' && olhos != 'p' && olhos != 'C' && olhos != 'c' && olhos != 'V' && olhos != 'v') {
					System.out.println("Cor dos olhos informada incorretamente.");
				}
				
			}
			while(olhos != 'A' && olhos != 'a' && olhos != 'P' && olhos != 'p' && olhos != 'C' && olhos != 'c' && olhos != 'V' && olhos != 'v');
			
			do {
				System.out.println("Use: P - Preto, C - Castanho, L - Loiro, R - Ruivo.");
				System.out.print("Informe a cor de cabelo da pessoa: ");
				cabelo = scanner.next().charAt(0);
				if(cabelo != 'P' && cabelo != 'p' && cabelo != 'C' && cabelo != 'c' && cabelo != 'L' && cabelo != 'l' && cabelo != 'R' && cabelo != 'r') {
					System.out.println("Cor de cabelo informada incorretamente.");
				}
				
			}
			while(cabelo != 'P' && cabelo != 'p' && cabelo != 'C' && cabelo != 'c' && cabelo != 'L' && cabelo != 'l' && cabelo != 'R' && cabelo != 'r');
			
			if(idade > 50 && peso < 60) {
				acimaCinquentaMenosSessenta++;
			}
			
			if(altura < 1.5) {
				somaIdadeMenos150 += idade;
				pessoasMenos150++;
			}
			
			if(olhos == 'A' || olhos == 'a') {
				pessoasOlhosAzuis++;
			}
			else if(cabelo == 'R' || cabelo == 'r') {
				pessoasRuivasNaoAzul++;
			}			
			
		}
		System.out.println();
		
		if(pessoasMenos150 > 0) {
			mediaIdadeMenos150 = somaIdadeMenos150 / pessoasMenos150;
		}
		else {
			mediaIdadeMenos150 = 0;
		}
		
		percentualPessoasOlhosAzuis = (pessoasOlhosAzuis * 100) / quantPessoas;
		
		System.out.println("A quantidade de pessoas com mais de 50 anos e menos de 60 Kg é de " + acimaCinquentaMenosSessenta + ".");
		System.out.println("A média das idades das pessoas com menos de 1,5 metros é de " + mediaIdadeMenos150 + " anos.");
		System.out.println("O percentua de pessoas de olhos azuis entre todas as outras é de " + percentualPessoasOlhosAzuis + "%.");
		System.out.println("A quantidade de pessoas ruivas que não possuem olhos azuis é de " + pessoasRuivasNaoAzul + ".");

	}

}
