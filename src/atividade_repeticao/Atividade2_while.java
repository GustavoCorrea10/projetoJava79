package atividade_repeticao;

import java.util.Scanner;

public class Atividade2_while {

	public static void main(String[] args) {
		int idade, pssd, idg;
		String continua = "s";
		double media, somaIdade = 0;
		Scanner leia = new Scanner(System.in);
		int totdesenvolvedorbkd = 0, totmcistrans = 0, tothcismobile = 0, totbinariafll = 0, totalp = 0;

		while (!continua.equalsIgnoreCase("n")) {
			System.out.println("______________________________________________________");
			System.out.println("| IDENTIDADE DE GÊNERO    | PESSOAS DESENVOLVEDORAS  |");
			System.out.println("|_________________________|__________________________|");
			System.out.println("| 1- Mulher Cis           |   1- Backend             |");
			System.out.println("| 2- Homem Cis            |   2- Frontend            |");
			System.out.println("| 3- Não Binário          |   3- Mobile              |");
			System.out.println("| 4- Mulher Trans         |   4- FullStack           |");
			System.out.println("| 5- Homem Trans          |                          |");
			System.out.println("| 6- Outros               |                          |");
			System.out.println("|_________________________|__________________________|");

			System.out.println("\nIdade:                     ");
			idade = leia.nextInt();
			
			
			System.out.println("\nIdentidade de Gênero:      ");
			idg = leia.nextInt();
			
			
			System.out.println("\nPessoa Desenvolvedora:     ");
			pssd = leia.nextInt();
			
			
			System.out.println("____________________________ ");
			totalp++;

			somaIdade = somaIdade + idade;

			if (pssd == 1) {
				totdesenvolvedorbkd++;

			}
			
			else if (idg == 1 || idg == 4 && pssd == 1) {
				totmcistrans = totmcistrans + 1;
			} 
			
			
			else if (idg == 2 || idg == 5 && pssd == 4 && idade > 40) {
				tothcismobile = tothcismobile + 1;
			} 
			
			
			
			
			else if (idg == 3 && pssd == 4 && idade < 30) {
				totbinariafll++;
			}
			
			
			

			System.out.println("Deseja continuar? S para SIM ou N para NÃO ");
			continua = leia.next();

		}

		if (totalp > 0) {

			media = somaIdade / totalp;
		} else {
			media = 0;
		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + totdesenvolvedorbkd);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totmcistrans);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + tothcismobile);
		System.out.println(
				"Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totbinariafll);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalp);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", media);

	}

}
