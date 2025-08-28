package aula3;

import java.util.Scanner;

public class aula28082025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		if (idade > 18) {
			System.out.println(nome + " Voce e maior de idade");
		}else {
			System.out.println(nome + " Voce e menor de idade");
		}
		
		for (int i = 1; i <= idade; i++ ) {
			System.out.println(i);
		}
		scanner.close();

	}

}
