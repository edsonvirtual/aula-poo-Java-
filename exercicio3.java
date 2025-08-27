package exercicios;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota = 6;
		
		if(nota >=7) {
			System.out.println("Aprovado - sua nota foi: " + nota);
		}else{
			if(nota >=5 && nota <7) {
				System.out.println("Recuperação - sua nota foi: " + nota);
			}else {
				if(nota <5) {
					System.out.println("Reprovado - sua nota foi: " + nota);
				}
			}
			
		}
	}

}
