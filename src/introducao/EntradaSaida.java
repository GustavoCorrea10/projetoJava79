package introducao;

import java.util.Scanner; //importando Scanner para dentro da classe

public class EntradaSaida {

	public static void main(String[] args) {
		//variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		
		//pedir/inserir o nome, temperatura
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
		
		
		//processamento
		 fahrenheit = temperatura * 1.8f + 32;
		
		
		//saida dos dados
		 System.out.println("Bom dia, " + nome);
		 System.out.printf("A temperatura em Fahrenhiet é %.2f. ",  fahrenheit);
	}

}
