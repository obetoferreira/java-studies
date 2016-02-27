import java.util.*;

class Exercicio07 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos números deseja gravar no array?");
		int n = in.nextInt();
		int[] nGroup = new int[n];
		int largest = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Núme	ro " + (i + 1) + " de " + n + ":");
			nGroup[i] = in.nextInt();
			
			if (i == 0 || nGroup[i] > largest) {
				largest = nGroup[i];
			}
		}
		
		System.out.println("O maior número do array é: " + largest);
	}
}