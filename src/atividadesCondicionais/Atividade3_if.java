package atividadesCondicionais;
import java.util.Scanner;
public class Atividade3_if {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraD;
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite o nome do doador: ");
		nome = leia.next();
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		System.out.println("Primeira Doação de sangue: ");
		primeiraD = leia.nextBoolean();
		
		
		if((idade > 18 && idade < 60) || (idade > 59 && primeiraD == false)) {
			System.out.println(nome + " está apto a doar sangue");
		}else if(idade < 70 && primeiraD == true) {
			System.out.println(nome + " Não está apto para doar sangue");
			
		}
		else if((idade < 18 || idade > 69) || ( idade > 59 && idade < 70)) {
			System.out.println(nome + " Não está apto a doar sangue");
		}			
	}

}
