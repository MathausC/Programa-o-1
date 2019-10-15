package com.CC;

public class OitavaListaQuestaoQuatro {

	public static void main(String[] args) {
		
		int populacaoA = 5000000, populacaoB = 7000000, anos = 0;
		
		while(populacaoA <= populacaoB) {
			populacaoA += ((populacaoA * 3)/100);
			populacaoB += ((populacaoB * 2)/100);
			anos++;			
		}
		
		System.out.println("Levará " + anos + " anos para a que a população do país 'A' ultrapasse a pupulação do país 'B'.");

	}

}
