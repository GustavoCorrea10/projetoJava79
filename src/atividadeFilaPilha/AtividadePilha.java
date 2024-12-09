package atividadeFilaPilha;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		Stack<String> livro = new Stack<String>();
		Integer valor;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("_______________________________");
			System.out.println(" 1 - Adicionar Livro na pilha  ");
			System.out.println(" 2 - Listar todos os Livros    ");
			System.out.println(" 3 - Retirar livro da planilha ");
			System.out.println(" 0 - Sair                      ");
			System.out.println("_______________________________");
			System.out.println("Entre com a opção desejada:    ");

			valor = leia.nextInt();
			leia.nextLine();

			switch (valor) {
			case 1:
				System.out.println("Digite o nome: ");
				String nomeLivro = leia.nextLine();
				livro.push(nomeLivro);
				System.out.println("Livro adicionado!");
				break;

			case 2:
				if (livro.isEmpty()) {
					System.out.println("\nA pilha está vazia! ");
				} else {
					System.out.println("\nLista de Livros na Pilha: ");
					livro.size();
					for (String listaLivro : livro)
						System.out.println("- " + listaLivro);
				}
				break;

			case 3:
				if (livro.isEmpty()) {
					System.out.println("A pilha está vazia! ");
				} else {
					System.out.println("\nPilha: ");
					livro.pop();
					for (String removeLivre : livro)
						System.out.println("- " + removeLivre);
				}
				break;
			case 0:
				System.out.println("Programa finalizado! ");

			}
		} while (valor != 0);
	}

}
