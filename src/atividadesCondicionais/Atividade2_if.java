package atividadesCondicionais;

import java.util.Scanner;

public class Atividade2_if {

	public static void main(String[] args) {
		int n1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um Número: ");
		n1 = leia.nextInt();
		
		if(n1 > 0 && (n1 % 2 == 0)) {
			System.out.println("O número " + n1 + " é par e positivo!");
		}
		else if(n1 < 0 && (n1 % 2 == 0)) {
			System.out.println("O número " + n1 + " é par e negativo!");
		}
		else if(n1 > 0 && (n1 % 2 != 0)) {
			System.out.println("O número " + n1 + " é ímpar e positivo!");
		}
		else if(n1 < 0 && (n1 % 2 != 0 )) {
			System.out.println("O número " + n1 + " é ímpar e negativo!");
		}
	}

}
