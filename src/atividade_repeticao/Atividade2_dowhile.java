package atividade_repeticao;

import java.util.Scanner;

public class Atividade2_dowhile {

	public static void main(String[] args) {
		int numero = 0, contar = 0;
		float media = 0, somar = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				somar = somar + numero;
				contar++;
			}

		} while (numero != 0);

		media = somar / contar;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f\n", media);

	}

}
