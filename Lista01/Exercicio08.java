import java.util.*;

class Exercicio08 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos números deseja gravar no array?");
		int n = in.nextInt();
		int[] nGroup = new int[n];
		int evenCount = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Número " + (i + 1) + " de " + n + ":");
			nGroup[i] = in.nextInt();
			
			if (nGroup[i] % 2 != 0) {
				evenCount++;
			}
		}
		
		System.out.println("Total de números ímpares do array: " + evenCount);
	}
}