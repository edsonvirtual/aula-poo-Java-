package exercicios;
import java.util.Scanner;

public class exerciciodeRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Digite um número");
		        
		        int n = scanner.nextInt();

		        int i = 2;
		        while (i <= n) {
		            System.out.println(i);
		            i += 2;
		        }

		        scanner.close();
	}

}
