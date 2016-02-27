import java.util.*;

class Exercicio02 {
	
	// Declarando uma variavel global (Válida para toda a classe)
	public static int x = 3;
	
	// Os parametros de um metodo são variaveis locais do método. 
	// Se um método tiver uma variável (local) com o mesmo nome de uma variável global vindo dentro deste método vale a variável local.
	// A variável local tem validade (escopo de vida) restrita e limitada ao método onde se (e a partir de onde) ela foi declarada.
	
	// Em um método que temnuma variável local com um nome de outra global, acessamos a global colocando a palavra "this." antes do nome da variável
	
	// Faça um método que receba uma string e retornar o numero de vogais
	
	public static boolean isVogal(char el){
		
	}
	
	public static int contVogal(String el){
		int output = 0;
		
		for (int i = 0; i < el.length(); i++) {
			if (isVogal(el.charAt(i))) {
				output++;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma string: ");
		String foo = in.nextLine();
		System.out.println("A string " + foo + "tem " + contVogal( foo ) + " vogal(s).");
	}
}