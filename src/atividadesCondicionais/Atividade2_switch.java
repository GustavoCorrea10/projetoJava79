package atividadesCondicionais;
import java.util.Scanner;
public class Atividade2_switch {
	public static void main(String[] args) {
		int codigo;
		int n1 = 0;
		int n2 = 0;
		int valorT = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual conta quer fazer?");
		System.out.println("1 -  soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		codigo = leia.nextInt();
		switch (codigo) {
		case 1:
			System.out.println("digite o numero 1:");
			n1 = leia.nextInt();
			System.out.println("digite o numero 2:");
			n2 = leia.nextInt();
			valorT = n1 + n2;
			System.out.println("valor total: R$ " + valorT);
			break;
		case 2:
			System.out.println("digite o numero 1:");
			n1 = leia.nextInt();
			System.out.println("digite o numero 2:");
			n2 = leia.nextInt();
			valorT = n1 - n2;
			System.out.println("valor total: R$ " + valorT);

			break;
		case 3:
			System.out.println("digite o numero 1:");
			n1 = leia.nextInt();
			System.out.println("digite o numero 2:");
			n2 = leia.nextInt();
			valorT = n1 * n2;
			System.out.println("valor total: R$ " + valorT);

			break;
		case 4:
			System.out.println("digite o numero 1:");
			n1 = leia.nextInt();
			System.out.println("digite o numero 2:");
			n2 = leia.nextInt();
			valorT = n1 / n2;
			System.out.println("valor total: R$ " + valorT);

			break;
		default:
			System.out.println("Operação inválida!");

		}

	}
}
