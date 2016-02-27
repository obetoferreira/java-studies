import java.util.*;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		int numAlunos = 10;
		Object[][] listaAlunos = new Object[numAlunos][2];
		Double somaNotas = 0.0;
		
		for (int i = 0; i < numAlunos; i++) {

			listaAlunos[i][0] = myFunc.randString(5);
			listaAlunos[i][1] = myFunc.randDouble(0, 10);
			
			Object 	nomeAlunoObj = listaAlunos[i][0],
					notaAlunoObj = listaAlunos[i][1];
			String nomeAluno = (String) nomeAlunoObj;
			Double notaAluno = (Double) notaAlunoObj;
			somaNotas = somaNotas + notaAluno;
 				
			System.out.println("Nota de " + nomeAluno + ": " + notaAluno);
		
		}
		
		Double mediaGeral = myFunc.averageOf(somaNotas, numAlunos);
		
		System.out.println("Alunos acima da média: ");
		for (int i = 0; i < numAlunos; i++) {
			
			Object 	nomeAlunoObj = listaAlunos[i][0],
					notaAlunoObj = listaAlunos[i][1];
			String nomeAluno = (String) nomeAlunoObj;
			Double notaAluno = (Double) notaAlunoObj;
			
			if (notaAluno > mediaGeral) {
				System.out.println("- " + nomeAluno);
			}
		}
	}
}