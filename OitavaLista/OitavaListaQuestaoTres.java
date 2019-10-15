package com.CC;

public class OitavaListaQuestaoTres {

	public static void main(String[] args) {
		
		int tamanhoPedro = 150, tamanhoLucas = 110, anos = 0;
		
		while(tamanhoPedro >= tamanhoLucas) {
			tamanhoPedro += 2;
			tamanhoLucas += 3;
			anos++;
		}
		
		System.out.println("Em " + anos + " anos, Lucas será maior que que Pedro.");

	}

}
