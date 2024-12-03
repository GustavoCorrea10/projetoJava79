package atividadesCondicionais;
import java.util.Scanner;
public class Atividade1_switch {
	public static void main(String[] args) {		
		int codigo;
		int quantidade;
		int valorT = 0;	
		Scanner leia = new Scanner(System.in);
		System.out.println("1 - Cachorro quente | R$ 10,00 |");
		System.out.println("2 - X- Salada       | R$ 15,00 |");
		System.out.println("3 - X-Bacon         | R$ 18,00 |");
		System.out.println("4 - Bauru           | R$ 12,00 |");
		System.out.println("5 - Refrigerante    | R$ 8,00  |");
		System.out.println("6 - Suco de laranja | R$ 13,00 |");
		System.out.println("____________________|__________|");
		System.out.println("Digite o Código do produto: ");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();	
		switch (codigo) {
		case 1:
			System.out.println("Produto: cachorro Quente");
			valorT = quantidade * 10;
			System.out.println("valor total: R$ " + valorT);
			break;
		case 2:
			System.out.println("Produto: X-salada");
			valorT = quantidade * 15;
			System.out.println("valor total: R$ " + valorT);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valorT = quantidade * 18;
			System.out.println("valor total: R$ " + valorT);
			break;
		case 4:
			System.out.println("Produto: Bauru");
			valorT = quantidade * 12;
			System.out.printf("valor total: R$ " + valorT);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valorT = quantidade * 8;
			System.out.println("valor total: R$ " + valorT);
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			valorT = quantidade * 13;
			System.out.println("valor total: R$ " + valorT);
			break;
	

	}
		
	}
}
