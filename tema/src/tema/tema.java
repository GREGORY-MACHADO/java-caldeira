package tema;

import java.util.Scanner;

public class tema {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Escreva uma frase e clocaremos ao contrário");
			String frase = scanner.nextLine();
			
			String resultado = reverter(frase);
			System.out.println("O contrário é: " + resultado);
			
			scanner.close();

	}

	public static String reverter(String texto){
		StringBuilder stringBuilder = new StringBuilder(texto);
		return stringBuilder.reverse().toString();
	}
	
}


