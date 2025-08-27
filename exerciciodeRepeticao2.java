package exercicios;
import java.util.*;

public class exerciciodeRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro (n>1): ");
		int n = scanner.nextInt();
		
		if (n < 1 ) {
			System.out.println("O número deve ser maior ou igual a 1");
			return;
		}
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		System.out.println("A soma dos inteiros de 1 a " + n + "é: " +soma);
		scanner.close();
	}
}
