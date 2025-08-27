package exercicios;
import java.util.Scanner;
public class exerciciodeRepeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número não negativo para calcular o fatorial");
		int n = scanner.nextInt();
		long fatorial = 1;
		
		if(n < 0 ) {
			System.out.println("Erro. o número não deve ser negativo");
		}else {
			int i  = n;
			if (i == 0) {
				fatorial = 1;
				
			}else {
				do {
					fatorial *= i;
					i--;
				}while (i >1);
			}
			System.out.println("O fatorial de: " + n + " é " + fatorial);
			
		}
		scanner.close();
	}

}
