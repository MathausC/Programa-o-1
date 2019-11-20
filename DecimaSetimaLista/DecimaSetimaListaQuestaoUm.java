package com.CC;

import java.util.Scanner;
import java.lang.Math;

public class DecimaSetimaListaQuestaoUm {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x, y, xCentro, yCentro, xEsquerdo, yEsquerdo, xDireito, yDireito, raio;
		int opcao;
		String mensagem;

		System.out.println("Vamos verificar se um ponto est� dentro de uma das formas geom�tricas.");

		do {
			System.out.println("Escolha uma das op��es abaixo:");
			System.out.println("1 - Verificar o ponto no triangulo;");
			System.out.println("2 - Verificar o ponto na circunfer�ncia;");
			System.out.println("0 - Encerrar programa.");
			opcao = input.nextInt();
			while (opcao < 0 || opcao > 2) {
				System.out.println("Op��o invpalida.");
				System.out.println("Escolha uma das op��es abaixo:");
				System.out.println("1 - Verificar o ponto no triangulo;");
				System.out.println("2 - Verificar o ponto na circunfer�ncia;");
				System.out.println("0 - Encerrar programa.");
				opcao = input.nextInt();
			}

			switch (opcao) {
			case 1:
				System.out.print("Informe a coordenada x do vertice superior esquerdo do triangulo: ");
				xEsquerdo = input.nextDouble();
				xEsquerdo = verificarPositivo(xEsquerdo);

				System.out.print("Informe a coordenada y do vertice superior esquerdo do triangulo: ");
				yEsquerdo = input.nextDouble();
				yEsquerdo = verificarPositivo(yEsquerdo);

				System.out.print("Informe a coordenada x do vertice inferior direita do triangulo: ");
				xDireito = input.nextDouble();
				xDireito = verificarPositivo(xDireito);

				System.out.print("Informe a coordenada y do vertice inferior direito do triangulo: ");
				yDireito = input.nextDouble();
				yDireito = verificarPositivo(yDireito);

				System.out.print("Agora informe a coordenada x do ponto: ");
				x = input.nextDouble();
				x = verificarPositivo(x);

				System.out.print("Informe a coordenada y do ponto");
				y = input.nextDouble();
				y = verificarPositivo(y);

				if (verificarTriangulo(xEsquerdo, yEsquerdo, xDireito, yDireito, x, y)) {
					mensagem = "O ponto de coordenada (" + x + ", " + y + ") EST� contido no triangulo";
				} else {
					mensagem = "O ponto de coordenada (" + x + ", " + y + ") N�O est� contido no triangulo";
				}

				break;

			case 2:
				System.out.print("Informe a coordenada x do centro da circunfer�ncia: ");
				xCentro = input.nextDouble();
				xCentro = verificarPositivo(xCentro);

				System.out.print("Informe a coordenada y do centro da circunfer�ncia: ");
				yCentro = input.nextDouble();
				yCentro = verificarPositivo(yCentro);

				System.out.print("Informe o raio da circunfer�ncia: ");
				raio = input.nextDouble();
				raio = verificarPositivo(raio);

				System.out.print("Agora informe a coordenada x do ponto: ");
				x = input.nextDouble();
				x = verificarPositivo(x);

				System.out.print("Informe a coordenada y do ponto");
				y = input.nextDouble();
				y = verificarPositivo(y);

				if (verificarCirculo(xCentro, yCentro, x, y, raio)) {
					mensagem = "O ponto de coordenada (" + x + ", " + y + ") EST� contido na circunfer�ncia";
				} else {
					mensagem = "O ponto de coordenada (" + x + ", " + y + ") N�O est� contido na circunfer�ncia";
				}

				break;

			default:
				mensagem = "Programa encerrado. Tenha um bom dia.";
			}

			System.out.println(mensagem);

		} while (opcao != 0);
	}

	public static boolean verificarTriangulo(double xVEsquerdo, double yVEsquerdo, double xVDireito, double yVDireito,
			double xPonto, double yPonto) {

		double verificacaoConcistencia = ((xPonto - xVEsquerdo) / (xVDireito - xVEsquerdo))
				+ ((yPonto - yVDireito) / (yVEsquerdo - yVDireito));

		if (xPonto < xVEsquerdo || xPonto > xVDireito || yPonto < yVDireito || yPonto > yVEsquerdo) {
			return false;
		} else if (verificacaoConcistencia > 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean verificarCirculo(double xCentro, double yCentro, double xPonto, double yPonto, double raio) {
		double distanciaPontoDoCentro = calcularDistancia(xPonto, yPonto, xCentro, yCentro);
		if (distanciaPontoDoCentro <= raio) {
			return true;
		} else {
			return false;
		}
	}

	public static double calcularDistancia(double x, double y, double x1, double y1) {
		double distanciaX, distanciaY, vetorResultante;
		if (x > x1) {
			distanciaX = x - x1;
		} else {
			distanciaX = x1 - x;
		}

		if (y > y1) {
			distanciaY = y - y1;
		} else {
			distanciaY = y1 - y;
		}

		vetorResultante = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
		return vetorResultante;
	}

	public static double verificarPositivo(double n) {
		Scanner input = new Scanner(System.in);
		while (n < 0) {
			System.out.println("Este n�mero n�o pode ser negativo");
			System.out.print("Informe novamente: ");
			n = input.nextDouble();
		}
		return n;
	}

}
