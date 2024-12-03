package atividadesCondicionais;

import java.util.Scanner;

public class atividade1_if {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int result;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro Número: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo Número: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro Número: ");
		n3 = leia.nextInt();

		result = n1 + n2;
		if(result > n3) {
			System.out.println("A soma do primerio e segundo número, é maior que o terceiro numero");
		}else if(result < n3) {
			System.out.println("A soma do primerio e segundo número, é menor que o terceiro número");
		}else if(result == n3) {
			System.out.println("A soma do primeiro e segundo número, é igual ao terceiro número");	
		}
	}
}
