package atividade_repeticao;

import java.util.Scanner;

public class Atividade1_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, contador = 0, contadorr = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade < 21 && idade >= 0) {
				contador++;

			} else if (idade > 50) {
				contadorr++;

			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + contador);
		System.out.println("Total de pessoas maiores de 50 anos: " + contadorr);

	}

}
