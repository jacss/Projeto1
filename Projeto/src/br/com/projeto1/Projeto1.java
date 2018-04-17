package br.com.projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
		// Classe para entrada de dados
		Scanner sc = new Scanner(System.in);
		int opcao;// Vari�vel de escolha para cada entrada de dados
		boolean sair = false;

		do {
			System.out.println("----------------------");
			// Menu de intera��o com o usu�rio
			System.out.println("Escolha uma op��o: \n 1.Soma\n 2.Subtra��o\n 3.Divis�o\n 4.Faixa Et�ria\n "
					+ "5.N�meros Primos\n 6.Mudan�a de Base\n 7.Sair");
			// Pege o que o usu�rio digitou atraves do teclado.
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				// Array com 3 posi��es
				int[] numSoma = new int[2];
				int soma = 0;
				// Intera��o que ecebe os numeros para serem somados
				for (int i = 0; i < numSoma.length; i++) {
					// Classe que exibe informa�oes na tela
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					// Captura informa��es do teclado
					numSoma[i] = sc.nextInt();
					// Soma os numeros
					soma += numSoma[i];
				}
				// Classe que apresante os numeros digitados e a soma dos mesmos
				System.out.printf("A soma entre %d e %d � %d \n", numSoma[0], numSoma[1], soma);
				break;
			case 2:
				// Array com 3 posi��es
				int[] numSub = new int[2];
				int subtracao;
				// Intera��o que ecebe os numeros para serem subtraidos
				for (int i = 0; i < numSub.length; i++) {
					// Classe que exibe informa�oes na tela
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					numSub[i] = sc.nextInt();// Captura informa��es do teclado
				}
				subtracao = numSub[0] - numSub[1];// Realiza a subtra��o dos n�meros
				// Classe que apresante os numeros digitados e a subtraidos dos mesmos
				System.out.printf("A subtra��o entre %d e %d � %d \n", numSub[0], numSub[1], subtracao);
				break;
			case 3:

				int divisao = 0;
				// Array com 3 posi��es
				int[] numDiv = new int[2];
				// Intera��o que ecebe os numeros para serem divididos
				for (int i = 0; i < numDiv.length; i++) {
					// Classe que exibe informa�oes na tela
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					numDiv[i] = sc.nextInt();// Captura informa��es do teclado

				}
				divisao = numDiv[0] / numDiv[1];// Realiza a divis�o dos numeros
				// Classe que apresante os numeros digitados e a dividisos dos mesmos
				System.out.printf("A divis�o entre %d e %d � %d \n", numDiv[0], numDiv[1], divisao);
				break;
			case 4:
				// Vari�ves para entrada de dados
				int qtdPessoas;
				int cont = 0;
				int contMasculino = 0;
				int contFeminino = 0;
				int mediaIdades = 0;
				int somaIdades = 0;
				int somaIdadeMasculino = 0;
				int somaIdadeFeminino = 0;
				int mediaM = 0;
				int mediaF = 0;
				// ArrayList da classe pessoa
				ArrayList<Pessoa> listPessoas = new ArrayList<>();

				System.out.print("Digite a quantidade de pessoas!!");// Classe que exibe informa�oes na tela
				qtdPessoas = sc.nextInt();// Recebe a quandidade de pessoas

				for (int i = 0; i < qtdPessoas; i++) {
					Pessoa p = new Pessoa();// Classe pessoa instanciada
					System.out.println("Digite o nome " + (i + 1) + "�" + " pessoa!!");
					p.setNome(sc.next());// Recebe o nome da pessoa
					System.out.println("Digite a idade" + (i + 1) + "�" + " pessoa!!");
					p.setIdade(sc.nextInt());// Recebe a idade da pessoa
					System.out.println("Digite o sexo " + (i + 1) + "�" + " pessoa M/F!!");
					p.setSexo(sc.next());// Recebe o sexo da pessoa
					// Verifica se o usuario digitou o caracter correto
					if (p.getSexo().equals("M") || p.getSexo().equals("m")) {
						somaIdadeMasculino += p.getIdade();// Soma as idades masculina
						contMasculino++;// Conta quantas pessoas do sexo masculino foi digitado
						mediaM = somaIdadeMasculino / contMasculino;// Calcula a m�dia das idades do sexo masculino
						// Verifica se o usuario digitou o caracter correto
					} else if (p.getSexo().equals("F") || p.getSexo().equals("f")) {
						somaIdadeFeminino += p.getIdade();// Soma as idades do sexo feminino
						contFeminino++;// Conta quantas pessoas do sexo feminino foi digitado
						mediaF = somaIdadeFeminino / contFeminino;// Calcula a m�dia das idades do sexo feminino
					} else {
						// Se o usu�rio digitar um caracter errado volta para ser insediro novamente
						System.out.println("Caracter inv�lido");
						System.out.println("Digite o nome " + (i + 1) + "�" + " pessoa!!");
						p.setNome(sc.next());
						System.out.println("Digite a idade" + (i + 1) + "�" + " pessoa!!");
						p.setIdade(sc.nextInt());
						System.out.println("Digite o sexo " + (i + 1) + "�" + " pessoa M/F!!");
						p.setSexo(sc.next());
					}

					listPessoas.add(p);// O Array recebe o objeto pessoa
					cont++;// Conta quantas pessoas foram inseridas
					somaIdades += p.getIdade();// Soma as idades das pessoas inseridas
					mediaIdades = somaIdades / cont;// Calcula a m�dias de idades das pessoas inseridas

				}
				for (Pessoa pes : listPessoas) {
					// Mostras as pessoas inseridas
					System.out.println("-----------------------");
					System.out.println("Nome da pessoa: " + pes.getNome());
					System.out.println("Idade da pessoa: " + pes.getIdade());
					System.out.println("O sexo da pessoa: " + pes.getSexo());

				}
				System.out.println("-----------------------");
				// Mostra a quantidade de de pessoas inseridas
				System.out.println("Idade de " + cont + " pessoas calculadas");
				// Mostra a somas das idades das pessoas inseridas
				System.out.println("Soma das idades: " + somaIdades);
				// Mostra a media das idades das pesssos inseridas
				System.out.println("M�dia das idades: " + mediaIdades);
				// Mostra a media das idades masculinas
				System.out.println("M�dia das idades Masculino: " + mediaM);
				// Mostra a media das idades femininas
				System.out.println("M�dia das idades Feminino: " + mediaF);

				break;
			case 5:
				// Array list para armazenar os numeros primos
				ArrayList<Integer> primos = new ArrayList<>();
				// Array list para armazenar os numeros n�o primos
				ArrayList<Integer> naoprimos = new ArrayList<>();

				int num;
				int somap = 0;
				int somaNp = 0;
				System.out.println("Digite um numero");
				num = sc.nextInt();// Pega o numero digitado pelo usuario
				for (int i = 1; i < num; i++) {
					int contador = 0;
					for (int j = 1; j <= i; j++) {

						if (i % j == 0)
							contador++;// conta quantas vezes o numero digitado foi dividido
					}
					if (contador == 2) {
						primos.add(i);// armazena os numeros primos
						somap = somap + i;// soma dos numeros primos

					} else {
						naoprimos.add(i);// armazeno os numeros n�o primos
						somaNp = somaNp + i;// calcula a soma dos numeros n�o primos
					}

				}
				System.out.print("Primos: " + primos + "\n");// mostra os numeros primos
				System.out.print("Soma dos n�meros Primos: " + somap + "\n");// soma dos numeros primos
				System.out.print("N�o primos: " + naoprimos + "\n");// numeros n�o primos
				System.out.print("Soma dos n�meros n�o Primos: " + somaNp + "\n");// soma dos numeros n�o primos

				break;
			case 6:

				// Pergunta para o usu�rio qual a sua op��o
				System.out.println("Digite 1 para tranformar de Dedimal para Binario.");
				System.out.println("Digite 2 para tranformar de Binario para Decimal.");
				int escolha;
				escolha = sc.nextInt();

				if (escolha == 1) {
					int divisor;
					// N�mero em binario que o usu�rio vai digitar
					String binario = "";
					System.out.println("Digite um numero");
					// Pega a informa��o do teclado
					divisor = sc.nextInt();
					// Mantem o numero original que o usuario digitou
					int numero = divisor;
					while (divisor > 0) {
						if (divisor % 2 == 0) {
							// Pega o resto da divis�o terminado em 0 e monta o numero.
							binario = "0" + binario;
						} else {
							// Pega o resto da divis�o terminado em 1 e monta o numero.
							binario = "1" + binario;
						}
						// A cada intera��o o n�mero � dividido por 2.
						divisor = divisor / 2;

					}
					// Mostra o n�mero convertido em bin�rio.
					System.out.printf("O o numero %d em binario � %s\n ", numero, binario);
				} else if (escolha == 2) {
					// N�mero bin�rio que o usu�rio vai digitar
					Scanner leitor = new Scanner(System.in);
					System.out.println("Digite um numero.");
					String binario = "";
					// Pega o n�mero que o usu�rio digitou.
					binario = leitor.nextLine();
					// Converte a string em int e o bin�rio em decimal.
					int decimal = Integer.parseInt(binario, 2);
					// Mostra o n�mero convertido de bin�rio para decimal.
					System.out.printf("O numero %s em decimal � %d.\n", binario, decimal);

				} else {
					// Cai nessa condi��o se o usu�rio digitar um n�mero diferente da op��o.
					System.out.println("Numero inv�lido");
				}

				break;
			case 7:
				System.out.println("Voce est� sanido do sistema!!");
				System.exit(0);
				break;

			}
		} while (!sair);
	}

}
