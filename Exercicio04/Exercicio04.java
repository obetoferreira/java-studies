import java.util.*;

class Exercicio04 {
	
	public static double perimRetangulo(double x, double y){
		return (x * 2) + (y * 2);
	}
	
	public static double areaRetangulo(double x, double y){
		return x * y;
	}
	
	public static double diagonalRetangulo(double x, double y){
		return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
	}
	
	public static double perimCirculo(double rad){
		return 2 * Math.PI * rad;
	}
	
	public static double areaCirculo(double rad){
		return Math.PI * Math.pow(rad, 2);
	}
	
	public static double perimQuadrado(double x){
		return 4 * x;
	}
	
	public static void main(String[] args) {
		
		// Variables
		Scanner in = new Scanner(System.in);
		int quest = 0;
		double foo, bar, baz, qux;
		
		// Main method
		while (quest < 1 || quest > 28) {
			System.out.println("Informe um número entre 01 e 28: ");
			quest = in.nextInt();
		}
		
		// Questions
		switch (quest) {
			case 1:
				System.out.println("Informe a base do retângulo: ");
				foo = in.nextDouble();
				System.out.println("Informe a altura do retângulo: ");
				bar = in.nextDouble();
				System.out.println("O perímetro do retângulo é: " + perimRetangulo(foo, bar));
				break;
			
			case 2:
				System.out.println("Informe a base do retângulo: ");
				foo = in.nextDouble();
				System.out.println("Informe a altura do retângulo: ");
				bar = in.nextDouble();
				System.out.println("A área do retângulo é: " + areaRetangulo(foo, bar));
				break;
				
			case 3:
				System.out.println("Informe a base do retângulo: ");
				foo = in.nextDouble();
				System.out.println("Informe a altura do retângulo: ");
				bar = in.nextDouble();
				System.out.println("A diagonal do retângulo é: " + diagonalRetangulo(foo, bar));
				break;
			
			case 4:
				System.out.println("Informe o raio do círculo: ");
				foo = in.nextDouble();
				System.out.println("O perímetro do círculo é " + perimCirculo(foo));
				break;
				
			case 5:
				System.out.println("Informe o raio do círculo: ");
				foo = in.nextDouble();
				System.out.println("A área do círculo é " + areaCirculo(foo));
				break;
				
			case 6:
				System.out.println("Informe o lado do quadrado: ");
				foo = in.nextDouble();
				System.out.println("O perímetro do quadrado é " + perimQuadrado(foo));
				break;
		}
	}
}
