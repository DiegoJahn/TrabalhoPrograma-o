import java.util.Scanner;
public class Pergunta3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] p = {"Nota 1", "Nota 2", "Nota 3", "Nota 4", "Nota 5", "Nota 6"};
	Integer opcao1;
	System.out.println("\t1 para continuar");
	System.out.println("\t0 para parar");
	opcao1 = scan.nextInt();
	if (opcao1.equals(1)) {	
		int numeroDoAluno;	
		while (true) {
			System.out.println("Quantos alunos voce quer salvar?");
			numeroDoAluno = scan.nextInt();
			if (numeroDoAluno > 0) {
				break;
			}
		}	
		float[][] notaDoAluno;
		float[] mediaDoAluno;
		notaDoAluno = new float[numeroDoAluno][6];
		mediaDoAluno = new float[numeroDoAluno];
		int contador = 0;
		while (true) {
			if (true) {
				boolean opcao2 = true;
				int e = 0;
				while (opcao2) {
					System.out.printf("Informe a %s nota do Aluno número: %d\r\n", p[e], contador + 1);
					float nota = scan.nextFloat();
					if ((nota >= 0) && (nota <= 10)) {
						notaDoAluno[contador][e] = nota;
						mediaDoAluno[contador] += nota;
						e++;
					} else {
						System.out.println("\r\n\tDigite uma nota valido.\r\n");
					}
					if (e == 6) {
						opcao2 = false;
					}
				}
				contador++;
			}
			if (contador == numeroDoAluno) {
				System.out.println("\r\nContatos Salvos.\r\n");
				break;
			}
		}
		for (int i = 0; i < contador; i++) {
			System.out.printf("O aluno %d teve a média de %.2f.\r\n", i + 1, (mediaDoAluno[i] / 6));
		}
	}
	if (opcao1.equals(0)) {
		System.out.println("\r\nFim\r\n");	
	}
}
}