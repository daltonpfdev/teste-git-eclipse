package util;

public class Operacao {

	public static int[] removerRoom(int[] original, int item) {

		int quantidade = 0;

		int contador = 0;
		while (contador < original.length) {

			if (original[contador] == item) {
				quantidade++;
			}
			contador++;
		}
		
		if (quantidade == 0) {
			return original;
		}
		
		int[] novoVetor = new int[10 - quantidade];

		int contador4 = 0;

		while (contador4 < novoVetor.length) {

			if (contador4 >= item) {
				novoVetor[contador4] = contador4 + 1;
			} else {
				novoVetor[contador4] = contador4;
			}
			contador4++;
		}

		original = novoVetor;
		
		return original;

	}

}
