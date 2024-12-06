package exerciciosCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade2_CollectionSet {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		int n1 = leia.nextInt();
		
		if (numeros.contains(n1)) {
            System.out.println("O número " + n1 + " Encontrado!");
        } else {
            System.out.println("O número " + n1 + " não foi encontrado!");
        }
		
	
		}
		
		
		
		
		
	
	}


