package br.com.projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		boolean sair = false;

		do {
			System.out.println("----------------------");
			System.out.println("Escolha uma op��o: \n 1.Soma\n 2.Subtra��o\n 3.Divis�o\n 4.Faixa Et�ria\n "
					+ "5.N�meros Primos\n 6.Mudan�a de Base\n 7.Sair");
			
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				int[] numSoma = new int[2];
				int soma = 0;
				for (int i = 0; i < numSoma.length; i++) {
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					numSoma[i] = sc.nextInt();
					soma += numSoma[i];
				}
				System.out.printf("A soma entre %d e %d � %d \n",numSoma[0],numSoma[1],soma);
				break;
			case 2:
				int[] numSub = new int[2];
				int subtracao;
				for (int i = 0; i < numSub.length; i++) {
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					numSub[i] = sc.nextInt();
				}
				subtracao = numSub[0] - numSub[1];
				System.out.printf("A subtra��o entre %d e %d � %d \n",numSub[0],numSub[1],subtracao);
				break;
			case 3:

				int divisao = 0;
				int[] numDiv = new int[2];
				for (int i = 0; i < numDiv.length; i++) {
					System.out.println("Digite o " + (i + 1) + "�" + " n�mero.");
					numDiv[i] = sc.nextInt();

				}
				divisao = numDiv[0] / numDiv[1];
				System.out.printf("A divis�o entre %d e %d � %d \n",numDiv[0],numDiv[1],divisao);
				break;
			case 4:
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
				ArrayList<Pessoa> listPessoas = new ArrayList<>();

				System.out.print("Digite a quantidade de pessoas!!");
				qtdPessoas = sc.nextInt();

				for (int i = 0; i < qtdPessoas; i++) {
					Pessoa p = new Pessoa();
					System.out.println("Digite o nome " + (i + 1) + "�" + " pessoa!!");
					p.setNome(sc.next());
					System.out.println("Digite a idade" + (i + 1) + "�" + " pessoa!!");
					p.setIdade(sc.nextInt());
					System.out.println("Digite o sexo " + (i + 1) + "�" + " pessoa M/F!!");
					p.setSexo(sc.next());

					if (p.getSexo().equals("M") || p.getSexo().equals("m")) {
						somaIdadeMasculino += p.getIdade();
						contMasculino++;
						mediaM = somaIdadeMasculino / contMasculino;

					} else if (p.getSexo().equals("F") || p.getSexo().equals("f")) {
						somaIdadeFeminino += p.getIdade();
						contFeminino++;
						mediaF = somaIdadeFeminino / contFeminino;
					} else {
						System.out.println("Caracter inv�lido");
						System.out.println("Digite o nome " + (i + 1) + "�" + " pessoa!!");
						p.setNome(sc.next());
						System.out.println("Digite a idade" + (i + 1) + "�" + " pessoa!!");
						p.setIdade(sc.nextInt());
						System.out.println("Digite o sexo " + (i + 1) + "�" + " pessoa M/F!!");
						p.setSexo(sc.next());
					}

					listPessoas.add(p);
					cont++;
					somaIdades += p.getIdade();
					mediaIdades = somaIdades / cont;

				}
				for (Pessoa pes : listPessoas) {

					System.out.println("-----------------------");
					System.out.println("Nome da pessoa: " + pes.getNome());
					System.out.println("Idade da pessoa: " + pes.getIdade());
					System.out.println("O sexo da pessoa: " + pes.getSexo());

				}
				System.out.println("-----------------------");
				System.out.println("Idade de " + cont + " pessoas calculadas");
				System.out.println("Soma das idades: " + somaIdades);
				System.out.println("M�dia das idades: " + mediaIdades);
				System.out.println("M�dia das idades Masculino: " + mediaM);
				System.out.println("M�dia das idades Feminino: " + mediaF);

				break;
			case 5:
				ArrayList<Integer> primo = new ArrayList<>();
				ArrayList<Integer> naoPrimo = new ArrayList<>();

				int[] numeros = new int[10];
				int i = 0;
				int somaPrimo = 0;
				int somaNaoPrimo = 0;

				for (; i < numeros.length; i++) {
					System.out.println("Digite:");
					numeros[i] = sc.nextInt();
					VerificaNumerosPrimos v = new VerificaNumerosPrimos();
					if (v.eNumeroPrimo(numeros[i])) {

						primo.add(numeros[i]);
						somaPrimo += numeros[i];
					} else {
						naoPrimo.add(numeros[i]);
						somaNaoPrimo += numeros[i];
					}

				}

				System.out.println("N�meros Primos: " + primo);
				System.out.println("Soma dos numeros Primos: " + somaPrimo);
				System.out.println("Soma dos numeros n�o Primos: " + somaNaoPrimo);
				System.out.println("N�meros n�o Primos: " + naoPrimo);

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
					Scanner leitor =new Scanner(System.in);
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
