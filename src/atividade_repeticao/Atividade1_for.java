package atividade_repeticao;

import java.util.Scanner;

public class Atividade1_for {

	public static void main(String[] args) {
		int contador, n1, n2;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro numero do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo numero do intervalo: ");
		n2 = leia.nextInt();

		if (n1 > n2) {
			System.out.println("O primeiro valor deve ser menor que o segundo, reinicie o programa! ");
		} else {

			for (contador = n1; contador < n2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");

				}

			}

		}

	}

}
