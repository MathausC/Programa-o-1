package com.CC;

public class OitavaListaQuestaoQuatro {

	public static void main(String[] args) {
		
		int populacaoA = 5000000, populacaoB = 7000000, anos = 0;
		
		while(populacaoA <= populacaoB) {
			populacaoA += ((populacaoA * 3)/100);
			populacaoB += ((populacaoB * 2)/100);
			anos++;			
		}
		
		System.out.println("Levar� " + anos + " anos para a que a popula��o do pa�s 'A' ultrapasse a pupula��o do pa�s 'B'.");

	}

}
