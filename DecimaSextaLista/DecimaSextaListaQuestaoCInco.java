package com.CC;

public class DecimaSextaListaQuestaoCInco {

	public static double serie(int cont, int n) {
		if(cont < n) {
			return 1/fatorial(n - cont) + serie(cont + 1, n);
		}
		else {
			return 1 / fatorial(0);
		}
	}
	
	public static double fatorial(double n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}

}
