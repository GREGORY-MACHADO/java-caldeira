package caldeiras;

//public class caldeiras {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Olá Mundo!");

	//}

//}
import java.util.Scanner;

public class caldeiras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldo = 1000; // Definindo um saldo inicial de 1000 reais

        System.out.println("Bem-vindo ao Caixa Eletrônico!");
        System.out.println("Seu saldo atual é: " + saldo + " reais");

        System.out.print("Digite a quantia que deseja sacar: ");
        int quantia = scanner.nextInt();

        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Você sacou " + quantia + " reais.");
            System.out.println("Seu novo saldo é: " + saldo + " reais");
        } else {
            System.out.println("Saque inválido. Verifique o saldo ou a quantia inserida.");
        }

        scanner.close();
    }
}