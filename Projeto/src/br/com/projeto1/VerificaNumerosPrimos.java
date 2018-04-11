package br.com.projeto1;

public class VerificaNumerosPrimos {
	public static boolean eNumeroPrimo(int numero) {
		boolean eNumeroPrimo = false;
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			eNumeroPrimo = true;

		}
		return eNumeroPrimo;
	}

}
