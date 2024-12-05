package exerciciosVetores;

import java.util.Scanner;

public class Atividade2_vetor {

	public static void main(String[] args) {
		int result = 0, cont = 0, numeros[] = new int[10];
		float media;

		Scanner leia = new Scanner(System.in);

		for (cont = 0; cont < 10; cont++) {
			System.out.println("Escreva o " + (cont + 1) + "º número:");
			numeros[cont] = leia.nextInt();
			result = result + numeros[cont];

		}

		System.out.println("Elementos nos índices ímpares: ");
		for (cont = 0; cont < 10; cont++) {
			if (cont % 2 != 0) {
				System.out.println(numeros[cont]);
			}
		}

		System.out.println("Elementos pares: ");
		for (cont = 0; cont < 10; cont++) {
			if (numeros[cont] % 2 == 0) {
				System.out.println(numeros[cont]);

			}
		}
		media = (float) result / 10;
		System.out.println("Soma: " + result);
		System.out.printf("A média é: %.2f",  media);

		leia.close();
	}

}
