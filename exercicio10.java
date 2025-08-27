package exercicios;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b  = 4;
		double c = 10;
		
	if(verificarTriangulo(a,b,c)) {
		if( a==b && b==c) {
			System.out.println("é um triângulo equilatero.");
		}else {
			if (a==b || a==c || b==c ) {
				System.out.println("é um triângulo isósceles");
		}else {
			System.out.println("é um triângulo escaleno");
		}
			}
		}else {
		System.out.println("Os lados não formam um triângulo. ");
	}

	}
	public static boolean verificarTriangulo(double a, double b, double c) {
		return (a+b>c)&& (a+c>b)&&(b+c>a);
	}

}
