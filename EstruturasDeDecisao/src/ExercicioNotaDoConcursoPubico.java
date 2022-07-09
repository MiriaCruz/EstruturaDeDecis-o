import java.util.Scanner;

public class ExercicioNotaDoConcursoPubico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a nota de Portugu�s do aluno(a): ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de Matem�tica do aluno(a): ");
		Double notaMatematica = scanner.nextDouble();
		
		Double mediaAluno = notaMatematica + notaPortugues;
		Double mediaMinima = 150.0;
		Double notaPorMateria = 60.0;
		
		Boolean notaMinima = notaPortugues >= notaPorMateria && notaMatematica >= notaPorMateria;
		Boolean mediaAprovado = mediaAluno >= mediaMinima;
		Boolean alunoAprovado = notaMinima && mediaAprovado;
		
		if(alunoAprovado) {
			System.out.println("O aluno obteve nota " + notaPortugues + " em Portugu�s e "
					+ notaMatematica + " em Matem�tica, totalizando: " + mediaAluno + " pontos, "
							+ "portanto o aluno(a) est� APROVADO(A).");
			
		} else {
		 System.out.println("O aluno obteve nota " + notaPortugues + " em Portugu�s e "
				+ notaMatematica + " em Matem�tica, totalizando: " + mediaAluno + " pontos, "
				+ "portanto o aluno(a) est� REPROVADO(A).");
		}		 
		
		scanner.close();
		
	}

}
