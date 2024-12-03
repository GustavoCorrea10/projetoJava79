package atividadesCondicionais;
import java.util.Scanner;
public class Atividade3_switch {
	public static void main(String[] args) {
		String nome;
		int cargo;
		float salario;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		System.out.println("|____________________________________________________________________|");
		System.out.println("|Código do Cargo |    Cargo                 |  Percentual de Reajuste|");
		System.out.println("|________________|__________________________|________________________|");
		System.out.println("|       1        |  Gerente                 |     10%                |");
		System.out.println("|       2        |  Vendedor                |     7%                 |");
		System.out.println("|       3        |  Supervisor              |     9%                 |");
		System.out.println("|       4        |  Motorista               |     6%                 |");
		System.out.println("|       5        |  Estoquista              |     5%                 |");
		System.out.println("|       6        |  Tecnico de TI           |     8%                 |");
		System.out.println("|________________|__________________________|________________________|");
		System.out.println("Nome do Colaborador: ");
		nome = leia.next();
		System.out.println("Cargo: ");
		cargo = leia.nextInt();
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		switch (cargo) {
		case 1:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 10 / 100);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salario: %.2f", novoSalario);
			break;
		case 2:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 7 / 100);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salario: %.2f", novoSalario);
			break;
		case 3:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 9 / 100);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salario: %.2f", novoSalario);
			break;
		case 4:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 6 / 100);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salario: %.2f", novoSalario);
			break;
		case 5:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 5 / 100);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salario: %.2f", novoSalario);
			break;
		case 6:
			System.out.println("Nome do colaborador: " + nome);
			novoSalario = salario + (salario * 8 / 100);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salario: %.2f", novoSalario);
			break;

		}
	}
}
