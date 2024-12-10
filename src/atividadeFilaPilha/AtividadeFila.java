package atividadeFilaPilha;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class AtividadeFila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Integer valor;
		Scanner leia = new Scanner(System.in);
		do {
			System.out.println("_______________________________");
			System.out.println(" 1 - Adicionar Clientes na Fila");
			System.out.println(" 2 - Listar todos os Clientes  ");
			System.out.println(" 3 - Retirar Clientes da Fila  ");
			System.out.println(" 0 - Sair                      ");
			System.out.println("_______________________________");
			System.out.println("Entre com a opção desejada:    ");
			valor = leia.nextInt();
			leia.nextLine();
			switch (valor) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nFila: ");
					for (String filaAtualizada : fila)
						System.out.println("- " + filaAtualizada);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia! ");
				} else {
					System.out.println("\nFila: ");
					fila.poll();
					for (String removido : fila)
						System.out.println(removido);

				}
				break;
			case 0:
				System.out.println("Programa Finalizado! ");

			}

		} while (valor != 0);

	}

}
