package com.CC;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int coordenadaX, coordenadaY, largura, altura, coordenadaXDireita, coordenadaYAbaixo;
	    System.out.println("Diga onde se encontra a coordenada x do vértice supeior esquerdo do seu retângulo.");
	    coordenadaX = input.nextInt();
        System.out.println("Diga onde se encontra a coordenada y do vértice supeior esquerdo do seu retângulo.");
        coordenadaY = input.nextInt();
        System.out.println("Qual a largura do seu retângulo?");
        largura = input.nextInt();
        System.out.println("Qual a altura do seu retângulo?");
        altura = input.nextInt();
        coordenadaXDireita = coordenadaX + largura;
        coordenadaYAbaixo = coordenadaY - altura;
        System.out.println("O vértice superior direito tem coordenadas: (" + coordenadaXDireita + ", " + coordenadaY + ");");
        System.out.println("O vértice inferior direito tem coordenadas: (" + coordenadaXDireita + ", " + coordenadaYAbaixo + ");");
        System.out.println("O vértice inferior esquerdo tem coordenadas: (" + coordenadaX + ", " + coordenadaYAbaixo + ");");
    }
}
