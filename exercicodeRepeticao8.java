package exercicios;
import java.util.Scanner;

public class exercicodeRepeticao8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner = new Scanner(System.in);
		        System.out.println("Digite um número para ver a tabuada:");
		        int x = scanner.nextInt();

		        for (int i = 1; i <= 10; i++) {
		            int resultado = x * i;
		            System.out.println(x + " * " + i + " = " + resultado);
		        }

		        scanner.close();
		    }
	}

