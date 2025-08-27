package exercicios;
import java.util.*;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota2= scanner.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota3=scanner.nextDouble();
		
		
		double media = (nota1+nota2+nota3)/3; 
		
		if(media >= 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		scanner.close();

	}

}
