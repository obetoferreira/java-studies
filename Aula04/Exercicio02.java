import java.util.*;

class Exercicio02 {
	
	public static String invertStr(String el){
		String output = "";
		for (int i = el.length() - 1; i >= 0; i--) {
			output = output + el.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe uma string: ");
		String el = in.nextLine();
		
		System.out.println(invertStr(el));
		
	}
}