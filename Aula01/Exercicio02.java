import java.util.*;

class Exercicio02 {
	
	public static double soma(double foo, double bar) {
		double output = foo + bar;
		return output;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe os números da soma: ");	
		double num1 = in.nextDouble();
		System.out.print(" + ");	
		double num2 = in.nextDouble();
		
		System.out.println(soma(num1, num2));
	}
}