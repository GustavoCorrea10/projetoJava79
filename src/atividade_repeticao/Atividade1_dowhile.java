package atividade_repeticao;

import java.util.Scanner;

public class Atividade1_dowhile {

	public static void main(String[] args) {
		int numero = 0, soma = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma = soma + numero;

			}
		} while (numero != 0);

		System.out.println("A soma dos número positivos é: " + soma);
	}
}
