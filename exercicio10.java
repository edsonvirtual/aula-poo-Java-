package exercicios;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b  = 4;
		double c = 10;
		
	if(verificarTriangulo(a,b,c)) {
		if( a==b && b==c) {
			System.out.println("� um tri�ngulo equilatero.");
		}else {
			if (a==b || a==c || b==c ) {
				System.out.println("� um tri�ngulo is�sceles");
		}else {
			System.out.println("� um tri�ngulo escaleno");
		}
			}
		}else {
		System.out.println("Os lados n�o formam um tri�ngulo. ");
	}

	}
	public static boolean verificarTriangulo(double a, double b, double c) {
		return (a+b>c)&& (a+c>b)&&(b+c>a);
	}

}
