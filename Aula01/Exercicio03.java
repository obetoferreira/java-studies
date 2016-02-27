import java.util.*;

class Exercicio03 {
	
	public static String parImpar(float num) {
		String output;
		if (num % 2 == 0) {
			output = "Par";
		} else {
			output = "Ímpar";
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Par ou ímpar? Apenas informe o número!");
		float myNum = in.nextFloat();
		
		System.out.println("O número " + myNum + " é " + parImpar(myNum));
	}
}