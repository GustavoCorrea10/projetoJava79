package estrutura_decisao;

import java.util.Scanner;

public class ExemploElse {

	public static void main(String[] args) {

		// variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// entrada de dados
		System.out.println("Digite a sua Média: ");
		media = leia.nextFloat();

		// processamento

		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovado !");
		}

		else {
			System.out.println("Você foi reprovado !");
		}

		leia.close();
	}

}