package com.CC;
import java.util.Scanner;

public class NonaListaQuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double altura, largura, comprimento, raio, volume;
		int formaGeometrica;
		char continuar;
		
		System.out.println("Vamos calcular o vol�me de uma forma geom�trica.");
		do {
			do {
				System.out.println("Informe qual a forma geom�trica a ser calculada:");
				System.out.print("(1 - cubo, 2 - esfera, 3 - cilindro, 4 - paralelep�pedo) ");
				formaGeometrica = input.nextInt();
				if(formaGeometrica < 1 || formaGeometrica > 4) {
					System.out.println("Forma geom�trica incorreta.");
				}
			}
			while(formaGeometrica < 1 || formaGeometrica > 4);
			
			switch(formaGeometrica) {
				case 1:
					do {
						System.out.print("Informe o tamanho das arestas do cubo em cent�metros: ");
						altura = input.nextDouble();
						if(altura <= 0) {
							System.out.println("As arestas devem ter valor maior que zero (0)");
						}
					}
					while(altura <= 0);
					
					volume = calcularVolumeCubo(altura);
					
					System.out.println("O volume do cubo � de " + volume + " cm�.");
					break;
					
				case 2:
					do {
						System.out.print("Informe o tamanho do raio da esfera em cent�metros: ");
						raio = input.nextDouble();
						if(raio <= 0) {
							System.out.println("O raio deve ter valor maior que zero (0)");
						}
					}
					while(raio <= 0);
					
					volume = calcularVolumeEsfera(raio);
					
					System.out.println("O volume da esfera � de " + volume + " cm�.");
					break;
					
				case 3:
					do {
						System.out.print("Informe o tamanho do raio do cilindro em cent�metros: ");
						raio = input.nextDouble();
						if(raio <= 0) {
							System.out.println("O raio dever ter valor maior que zero (0)");
						}
					}
					while(raio <= 0);
					
					do {
						System.out.print("Informe a altura do cilindro em cent�metros: ");
						altura = input.nextDouble();
						if(altura <= 0) {
							System.out.println("A altura deve ter valor maior que zero (0)");
						}
					}
					while(altura <= 0);
					
					volume = calcularVolumeCilindro(raio, altura);
					
					System.out.println("O volume do cilindro � de " + volume + " cm�.");
					break;
					
				case 4:
					do {
						System.out.print("Informe a altura do paralelep�pedo em cent�metros: ");
						altura = input.nextDouble();
						if(altura <= 0) {
							System.out.println("A altura deve ter valor maior que zero (0)");
						}
					}
					while(altura <= 0);
					
					do {
						System.out.print("Informe a largura do paralelep�pedo em cent�metros: ");
						largura = input.nextDouble();
						if(largura <= 0) {
							System.out.println("A largura deve ter valor maior que zero (0)");
						}
					}
					while(largura <= 0);
					
					do {
						System.out.print("Informe o comprimento do paralelep�pedo em cent�metros: ");
						comprimento = input.nextDouble();
						if(comprimento <= 0) {
							System.out.println("O comprimento deve ter valor maior que zero (0)");
						}
					}
					while(comprimento <= 0);
					
					volume = calcularVolumeParalelepipedo(altura, largura, comprimento);
					
					System.out.println("O vol�me do paralelep�pedo � de " + volume + " cm�.");
			}
			
			do {
				System.out.print("Voc� deseja calcular o volume novamente? (S - sim, N - n�o) ");
				continuar = input.next().charAt(0);
				if(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n') {
					System.out.println("Resposta incorreta.");
				}				
			}
			while(continuar != 'S' && continuar != 's' && continuar != 'N' && continuar != 'n');
		}
		while(continuar == 'S' || continuar == 's');
	}
	
	public static double calcularVolumeCubo(double aresta) {
		double resultado = Math.pow(aresta, 3);
		return resultado;
	}
	
	public static double calcularVolumeEsfera(double raio) {
		double resultado = (4 * Math.PI * Math.pow(raio, 3)) / 3;
		return resultado;
	}
	
	public static double calcularVolumeCilindro(double raio, double altura) {
		double resultado = Math.PI * Math.pow(raio, 2) * altura;
		return resultado;
	}
	
	public static double calcularVolumeParalelepipedo(double altura, double largura, double comprimento) {
		double resultado = altura * largura * comprimento;
		return resultado;
	}

}
