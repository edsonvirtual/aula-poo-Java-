package exercicios;
import java.util.*;

public class exerciciodeRepeticao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para inciar a contagem regressiva: ");;
		int n = scanner.nextInt();
		
		for (int i = n; i >= 1; i--) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
