package exercicios;
import java.util.Scanner;

public class exerciciodeRepeticao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Digite a quantidade de números primos que deseja encontrar:");
		        int n = scanner.nextInt();
		        int count = 0;
		        int num = 2;

		        while (count < n) {
		            boolean isPrimo = true;
		            if (num <= 1) {
		                isPrimo = false;
		            } else {
		                for (int i = 2; i <= Math.sqrt(num); i++) {
		                    if (num % i == 0) {
		                        isPrimo = false;
		                        break;
		                    }
		                }
		            }

		            if (isPrimo) {
		                System.out.println(num);
		                count++;
		            }
		            num++;
		        }
		        
		        scanner.close();
		    }
	}


