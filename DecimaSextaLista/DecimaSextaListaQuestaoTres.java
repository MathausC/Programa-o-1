package com.CC;

public class DecimaSextaListaQuestaoTres {

	public static int combRecursivo(int n, int k) {
		int resultado;

		if (k == 1) {
			resultado = n;
		} else if (k == n) {
			resultado = 1;
		} else if (k < 1 || n < k) {
			resultado = 0;
		} else {
			resultado = combRecursivo(n - 1, k - 1) + combRecursivo(n - 1, k);
		}

		return resultado;
	}
	
	public static int combNaoRecursivo(int n, int k) {
		if(k < 1 || n < k) {
			return 0;
		}
		else {
			return fatorial(n) / (fatorial(k) * fatorial(n - k));	
		}
	}

	public static int fatorial(int n) {
		int fatorial = 1;
		for(int cont = n; cont >= 1; cont--) {
			fatorial *= cont;
		}
		return fatorial;
	}

}
