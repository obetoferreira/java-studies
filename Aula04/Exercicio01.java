import java.util.*;

class Exercicio01 {
	
	public static int powOf(int foo, int bar){
		return (int) Math.pow(foo, bar);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Informe dois numeros: ");
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println("O resultado de " + a + " elevado a " + b + " é: " + powOf(a, b));
	}
}
