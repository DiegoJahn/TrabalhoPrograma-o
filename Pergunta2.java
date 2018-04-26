import java.util.Scanner;
public class Pergunta2 {
public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
	Integer opcao1;
	while (true) {
		System.out.println("\t1 para continuar");
		System.out.println("\t0 para Parar");
		opcao1 = scan.nextInt();
		if((opcao1.equals(1)) || (opcao1.equals(0))) {
			break;
		} else {
			System.out.println("\r\nDigite somente 1 para sim ou 0 para nao.\r\n");
		}
	}
	if (opcao1.equals(1)) {
		int numeroContato;
		while (true) {
			System.out.println("Quantos clientes voce quer salvar?");
			numeroContato = scan.nextInt();
			if(numeroContato > 0) {
				break;
			} else {
				System.out.println("\tDigite novamente um numero valido\r\n");
			}
		}
		String[] nomeDoContato;
		String[] emailDoContato;
		nomeDoContato = new String[numeroContato];
		emailDoContato = new String[numeroContato];
		int contador = 0;
		while (true) {
			if (true) {	
				boolean opcao2 = true;
				boolean opcao3 = true;
				while(opcao2) {
					System.out.println("Digite o nome:");
					String Nome = scan.next();
					if (Nome.length() >= 2){
						nomeDoContato[contador] = Nome;
						opcao2 = false;
					} else {
						System.out.println("\r\n\tDigite um nome valido.\r\n");
					}
				}	
				while(opcao3) {
					System.out.println("Digite o e-mail:");
					String Email = scan.next();
					if (Email.matches("^[a-z0-9\\-_\\.]+@[a-z0-9]+\\..+$")) { 
						emailDoContato[contador] = Email;
						opcao3 = false;
					} else {
						System.out.println("\r\n\tDigite um e-mail valido.\r\n");
					}
				}
				contador++;
			}
			if (contador == numeroContato) {
				System.out.println("\r\nContatos Salvos.\r\n");
				break;
			}
		}
		if (contador != 0) {
			for (int i = 0; i < contador; i++) {
				System.out.printf("Nome: %s\r\nE-mail: %s\r\n\r\n", nomeDoContato[i], emailDoContato[i]);
			}
		}
	} 
	if (opcao1.equals(0)) {
		System.out.println("\r\nFim\r\n");	
	}
}
}