package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a idade do atleta: ");
		
		int idade = scanner.nextInt();
		
		if (idade < 12) {
			System.out.println("Modalidade: INFANTIL");			
		}else {
			if(idade > 12 && idade < 17) {
				System.out.println("Modalidade: JUVENIL");
			}else {
				System.out.println("Modalidade: ADULTO");
			}
			scanner.close();
		}
		
	}
	
}
