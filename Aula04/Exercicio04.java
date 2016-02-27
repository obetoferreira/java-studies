import java.util.*;


class Exercicio04 {
	public static double media(int[] num){
		double numeros = 0;
		for(int i = 0;i < num.lenght; i++){
			numeros = numeros + num[i];
		}
		return numeros/num.lenght;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho array: ");
		int n = scan.nextInt();
		
		int numeros[] = new int[n];
		
		for(int i = 0; i < numeros.lenght; i++){
			System.out.println("Digite um numero: ");
			numeros[i] = scan.nextInt();
		}
		
		System.out.print("A media e: ");
		
	}
}