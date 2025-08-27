package exercicios;
import java.util.*;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto: R$ ");		
		double precoOriginal = scanner.nextDouble();
		
		double precoFinal;
		
		if(precoOriginal > 100) {
			double desconto = precoOriginal * 0.10;
			precoFinal = precoOriginal - desconto;
			System.out.println("Preço com desconto de 10%: R$" + String.format("%.2f", precoFinal));
        } else {
            precoFinal = precoOriginal;
            System.out.println("Preço sem desconto: R$" + String.format("%.2f", precoFinal));
        }

        scanner.close();
    }
						
}
