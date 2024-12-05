package exerciciosVetores;

import java.util.Scanner;

public class atividade1_vetor {

	public static void main(String[] args) {

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int receber, cont;
		Scanner leia = new Scanner(System.in);

		for (cont = 0; cont < 10; cont++) {
			System.out.println("Escreva um número: ");
			numeros[cont] = leia.nextInt();

		}

		System.out.println("Digite o número que você deseja encontrar: ");
		receber = leia.nextInt();

		for (int contador = 0; contador < 10; contador++) {
			if (receber == numeros[contador]) {
				System.out.println("O numero " + receber + " está na posição: " + (contador));
				cont++;
			}

		}
		if (cont == 0) {
			System.out.println("O numero " + receber + "º não foi encontrado");
		}
	}
}
