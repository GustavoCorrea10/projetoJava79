package exerciciosCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> cor = new ArrayList<String>();
		// int cont = 0;
		Scanner leia = new Scanner(System.in);

		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Escreva uma cor: ");
			String cor1 = leia.next();

			cor.add(cor1);
		}

		System.out.println("\nCORES ADICIONADAS: ");

		for (String cor2 : cor) {
			System.out.println(cor2);
		}

		Collections.sort(cor);

		System.out.println("\nORDEM DAS CORES: ");
		for (String ordemCor : cor) {
			System.out.println(ordemCor);

		}

	}

}
