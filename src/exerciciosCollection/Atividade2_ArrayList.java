package exerciciosCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		for (int cont = 0; cont < 10; cont++) {
			int vl1 = leia.nextInt();

			numeros.add(vl1);
		}

		System.out.println("Números adicionados na lista: " + numeros);

		System.out.println("Digite o número que você deseja encontrar: ");
		int e = leia.nextInt();

		if (numeros.contains(e)) {
			int indice = numeros.indexOf(e);
			System.out.println("O Número " + e + " está no indice " + indice);
		} else {
			System.out.println("O número " + e + " não está na lista");
		}

	}

}
