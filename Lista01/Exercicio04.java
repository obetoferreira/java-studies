import java.util.*;

class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numAlunos = 10;
		double[] notaAlunos = new double[numAlunos];
		double somaNotas = 0;
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Nota do aluno " + (i + 1));
			notaAlunos[i] = in.nextDouble();
			somaNotas = somaNotas + notaAlunos[i];
		}
		
		System.out.println("Média das notas informadas: " + myFunc.averageOf(somaNotas, numAlunos));
	}
}