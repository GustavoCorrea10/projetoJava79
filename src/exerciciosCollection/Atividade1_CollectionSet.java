package exerciciosCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade1_CollectionSet {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número(não pode valor repetido): ");
		for (int cont = 0; cont < 10; cont++) {
			int vl1 = leia.nextInt();

			numeros.add(vl1);
		}
		System.out.println("Dados Listados: ");
		for (Integer vl2 : numeros) {
			System.out.println(vl2);

		}

	}

}
