import java.util.*;

class Exercicio03 {
	
	public static String intercalateStr(String foo, String bar){
		String output = "";
		for (int i = 0; i < foo.length(); i++) {
			output = output + foo.charAt(i) + bar.charAt(i);
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Informe duas strings: ");
		
		String foo = in.nextLine();
		String bar = in.nextLine();
		
		System.out.println(intercalateStr(foo, bar));
		
	}
}