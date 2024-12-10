package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2, 5);
		System.out.println("O primeiro resultado é "+ resultado);
		System.out.println("O segundo valor é "+ somar(8, 3));
		
		falar("Vai corinthians");
		falar("O gato amarelo");
		
		ExemploMetodoExterno.mensagem();
		

	}
	
	//Definição do Método Somar - Método com retorno e com Parametros
	public static int somar(int x, int y) {
		return x + y; // 2 + 5
	}
	
	
	
	//definição do metodo falar - Metodo sem retorno e com parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
