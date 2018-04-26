import java.util.Scanner;
public class Pergunta1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Integer opcao1;
	while (true) {
		System.out.println("\t1 para continuar");
		System.out.println("\t0 para parar");
		opcao1 = scan.nextInt();
		if((opcao1.equals(1)) || (opcao1.equals(0))) {
			break;
		} else {
			System.out.println("\r\nDigite somente 1 para sim ou 0 para nao.\r\n");
		}
	}
	if (opcao1.equals(1)) {
		int numeroCliente;
		while (true) {
			System.out.println("Quantos clientes voce quer salvar?");
			numeroCliente = scan.nextInt();
			if (numeroCliente > 0) {
				break;
			} else {
				System.out.println("\tDigite novamente um numero valido\r\n");
			}
		}
		String[] nomeDoCliente;
		nomeDoCliente = new String[numeroCliente];
		int contador = 0;
		while (true) {
			if (true) {	
				boolean opcao2 = true;
				while (opcao2) {
					System.out.println("Digite o nome:");
					String Nome = scan.next();
					if (Nome.length() >= 2) {
						nomeDoCliente[contador] = Nome;
						opcao2 = false;
					} else {
						System.out.println("\r\n\tDigite um nome valido.\r\n");
					}
				}
				contador++;
			}	
			if (contador == numeroCliente) {
				System.out.println("\r\nNomes Salvos\r\n");
				break;
			}
		}
		if (contador != 0) {
			for (int i = 0; i < contador; i++) {
				System.out.printf("Nome: %s\r\n",nomeDoCliente[i]);
			} 
		}
	}
	if (opcao1.equals(0)) {
		System.out.println("\r\nFim\r\n");
	}			
}	
}