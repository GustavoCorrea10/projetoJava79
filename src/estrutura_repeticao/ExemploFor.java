package estrutura_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);


                                         //ou usar contador++
		for (contador = 1; contador < 4; contador = contador + 1) {
			
			System.out.println("\nDigite o " + contador + "º nome: ");
			nome = leia.nextLine();
			System.out.println("\nO " + contador + " nome é: " + nome);

		
		}

		System.out.println("\nAcabou");
		leia.close();

	}

}
