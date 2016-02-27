import java.util.*;

class Exercicio03 {
	
	/**
	*
	* Seja: 
	* 
	*
	* Faça um metodo recursivo que receba um numero inteiro N e retorne o n-ésimo termo da sequencia.
	*
	*/
	
	public static int coisa(int el){
		
		int foo;
		
		if (el == 0) {
			foo = 2;
		} else if (el == 1) {
			foo = 4;
		} else if (el == 2) {
			foo = 6;
		} else {
			foo = coisa(el - 3) * coisa(el - 2) - coisa(el - 1);
		}
		return foo;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a coisa: " );
		int el = scan.nextInt();
		
		System.out.println("O negócio da coisa é: " + coisa(el));
	}
}