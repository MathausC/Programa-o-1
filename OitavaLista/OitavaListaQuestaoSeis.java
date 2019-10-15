package com.CC;

public class OitavaListaQuestaoSeis {

	public static void main(String[] args) {
		int numeroTabuada, cont, resultado;
		
		for(numeroTabuada = 1; numeroTabuada <= 10; numeroTabuada++) {
			System.out.println("Tabuada de adição de " + numeroTabuada + ":");			
			for(cont = 0; cont <= 10; cont++) {
				resultado = numeroTabuada + cont;
				System.out.println(numeroTabuada + " + " + cont + " = " + resultado);
				
			}			
			System.out.println();
			
		}

	}

}
