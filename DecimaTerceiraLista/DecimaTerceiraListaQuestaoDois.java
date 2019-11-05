package com.CC;

import java.util.Scanner;

public class DecimaTerceiraListaQuestaoDois {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int golsBrasil, golsFranca, golsUruguai, golsJapao;

		System.out.println("Vamos ver quais os pr�ximos jogos da copa.");
		System.out.println("Informe o placar do jogo Brasil x Jap�o:");
		System.out.print("Gols do Brasil: ");
		golsBrasil = input.nextInt();
		golsBrasil = validarPontuacao(golsBrasil);

		System.out.print("Gols do Jap�o: ");
		golsJapao = input.nextInt();
		golsJapao = validarPontuacao(golsJapao);
		System.out.println();

		while (golsBrasil == golsJapao) {
			System.out.println("N�o pode aver empates em uma seme final.");
			System.out.println("Informe o placar do jogo Brasil x Jap�o:");
			System.out.print("Gols do Brasil: ");
			golsBrasil = input.nextInt();
			golsBrasil = validarPontuacao(golsBrasil);

			System.out.print("Gols do Jap�o: ");
			golsJapao = input.nextInt();
			golsJapao = validarPontuacao(golsJapao);
			System.out.println();
		}

		System.out.println("Informe o placar do jogo Fran�a x Uruguai:");
		System.out.print("Gols da Fran�a: ");
		golsFranca = input.nextInt();
		golsFranca = validarPontuacao(golsFranca);

		System.out.print("Gols do Uruguai: ");
		golsUruguai = input.nextInt();
		golsUruguai = validarPontuacao(golsUruguai);
		System.out.println();

		while (golsFranca == golsUruguai) {
			System.out.println("N�o pode aver empates em uma seme final.");
			System.out.println("Informe o placar do jogo Fran�a x Uruguai:");
			System.out.print("Gols da Fran�a: ");
			golsFranca = input.nextInt();
			golsFranca = validarPontuacao(golsFranca);

			System.out.print("Gols do Uruguai: ");
			golsUruguai = input.nextInt();
			golsUruguai = validarPontuacao(golsUruguai);
			System.out.println();
		}

		exibeProximosJogos(golsBrasil, golsJapao, golsFranca, golsUruguai);
	}

	public static int validarPontuacao(int gols) {
		Scanner input = new Scanner(System.in);
		while (gols < 0) {
			System.out.println("O valor de gols n�o pode ser menor que zero (0).");
			System.out.print("Informe a quantidade de gols novamente: ");
			gols = input.nextInt();
		}
		return gols;
	}

	public static void exibeProximosJogos(int golsBrasil, int golsJapao, int golsFranca, int golsUruguai) {
		String finalista1, finalista2, terceiroLugar1, terceiroLugar2;
		finalista1 = determinarNomeVencedor("Brasil", "Jap�o", determinarVencedor(golsBrasil, golsJapao));
		finalista2 = determinarNomeVencedor("Fran�a", "Uruguai", determinarVencedor(golsFranca, golsUruguai));
		terceiroLugar1 = determinaNomePerdedor("Brasil", "Jap�o", determinarVencedor(golsBrasil, golsJapao));
		terceiroLugar2 = determinaNomePerdedor("Fran�a", "Uruguai", determinarVencedor(golsFranca, golsUruguai));

		System.out.println("Os finalistas ser�o: " + finalista1 + " x " + finalista2);
		System.out.println("A disputa pelo terceiro lugar ser� entre: " + terceiroLugar1 + " x " + terceiroLugar2);
	}

	public static int determinarVencedor(int golsTimeA, int golsTimeB) {
		if (golsTimeA > golsTimeB) {
			return 1;
		} else {
			return 2;
		}
	}

	public static String determinarNomeVencedor(String nomeTimeA, String nomeTimeB, int vencedor) {
		if (vencedor == 1) {
			return nomeTimeA;
		} else {
			return nomeTimeB;
		}
	}

	public static String determinaNomePerdedor(String nomeTimeA, String nomeTimeB, int vencedor) {
		if (vencedor == 2) {
			return nomeTimeA;
		} else {
			return nomeTimeB;
		}
	}
}
