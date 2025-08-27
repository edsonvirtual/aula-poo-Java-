package exercicios;
import java.util.*;
public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner scanner = new Scanner(System.in);
				
				String login = "admin";
				int senha = 1234;
				
				System.out.println("Digite o login:");
				String loginDigitado = scanner.next();
				
				System.out.println("Digite a senha:");
				int senhaDigitada = scanner.nextInt();
				
				if (loginDigitado.equals(login) && senhaDigitada == senha) {
					System.out.println("Login Aprovado");
				} else {
					System.out.println("Acesso negado");
				}
				
				scanner.close();
			}
		}
	