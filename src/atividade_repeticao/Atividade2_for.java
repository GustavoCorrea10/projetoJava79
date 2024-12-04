package atividade_repeticao;

import java.util.Scanner;

public class Atividade2_for {

	public static void main(String[] args) {
		int contador, n1, totpar = 0, totimpar = 0;
		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 11; contador++) {

			System.out.println("Digite o " + contador + " Número: ");
			n1 = leia.nextInt();
			if (n1 % 2 == 0) {
				totpar = totpar + 1;
			} else if (n1 % 2 != 0) {
				totimpar = totimpar + 1;

			}

		}
		System.out.println("Total de números pares: " + totpar);
		System.out.println("Total de números pares: " + totimpar);
	}

}
