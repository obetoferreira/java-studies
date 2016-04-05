import java.util.*;

class Exercicio06 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos números deseja gravar no array?");
		int n = in.nextInt();
		int[] nGroup = new int[n];
		int smallest = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Número " + (i + 1) + " de " + n + ":");
			nGroup[i] = in.nextInt();
			
			if (i == 0 || nGroup[i] < smallest) {
				smallest = nGroup[i];
			}
		}
		
		System.out.println("O menor número do array é: " + smallest);
	}
}