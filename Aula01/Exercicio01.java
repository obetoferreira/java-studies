import java.util.*;

class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Declarando String
		System.out.println("Informe uma string: ");
		String myString = in.nextLine();
		
		// Declarando Int
		System.out.println("Informe um número inteiro: ");
		int myInt = in.nextInt();
		
		// Declarando Double
		System.out.println("Informe um número real: ");
		double myDouble = in.nextDouble();
		
		// Declarando Booleano
		System.out.println("Informe um boolean (true/false): ");
		boolean myBoolean = in.nextBoolean();
		
		System.out.println("Os dados informados foram: ");
		System.out.println("String: " + myString);
		System.out.println("Inteiro: " + myInt);
		System.out.println("Real: " + myDouble);
		System.out.println("Booleano: " + myBoolean);
		
	}
}