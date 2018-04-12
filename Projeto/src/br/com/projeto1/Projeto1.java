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
			System.out.println("Escolha uma opção: \n 1.Soma\n 2.Subtração\n 3.Divisão\n 4.Faixa Etária\n "
					+ "5.Números Primos\n 6.Mudança de Base\n 7.Sair");
			
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				int[] numSoma = new int[2];
				int soma = 0;
				for (int i = 0; i < numSoma.length; i++) {
					System.out.println("Digite o " + (i + 1) + "º" + " número.");
					numSoma[i] = sc.nextInt();
					soma += numSoma[i];
				}
				System.out.printf("A soma entre %d e %d é %d \n",numSoma[0],numSoma[1],soma);
				break;
			case 2:
				int[] numSub = new int[2];
				int subtracao;
				for (int i = 0; i < numSub.length; i++) {
					System.out.println("Digite o " + (i + 1) + "º" + " número.");
					numSub[i] = sc.nextInt();
				}
				subtracao = numSub[0] - numSub[1];
				System.out.printf("A subtração entre %d e %d é %d \n",numSub[0],numSub[1],subtracao);
				break;
			case 3:

				int divisao = 0;
				int[] numDiv = new int[2];
				for (int i = 0; i < numDiv.length; i++) {
					System.out.println("Digite o " + (i + 1) + "º" + " número.");
					numDiv[i] = sc.nextInt();

				}
				divisao = numDiv[0] / numDiv[1];
				System.out.printf("A divisão entre %d e %d é %d \n",numDiv[0],numDiv[1],divisao);
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
					System.out.println("Digite o nome " + (i + 1) + "ª" + " pessoa!!");
					p.setNome(sc.next());
					System.out.println("Digite a idade" + (i + 1) + "ª" + " pessoa!!");
					p.setIdade(sc.nextInt());
					System.out.println("Digite o sexo " + (i + 1) + "ª" + " pessoa M/F!!");
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
						System.out.println("Caracter inválido");
						System.out.println("Digite o nome " + (i + 1) + "ª" + " pessoa!!");
						p.setNome(sc.next());
						System.out.println("Digite a idade" + (i + 1) + "ª" + " pessoa!!");
						p.setIdade(sc.nextInt());
						System.out.println("Digite o sexo " + (i + 1) + "ª" + " pessoa M/F!!");
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
				System.out.println("Média das idades: " + mediaIdades);
				System.out.println("Média das idades Masculino: " + mediaM);
				System.out.println("Média das idades Feminino: " + mediaF);

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

				System.out.println("Números Primos: " + primo);
				System.out.println("Soma dos numeros Primos: " + somaPrimo);
				System.out.println("Soma dos numeros não Primos: " + somaNaoPrimo);
				System.out.println("Números não Primos: " + naoPrimo);

				break;
			case 6:

				// Pergunta para o usuário qual a sua opção
				System.out.println("Digite 1 para tranformar de Dedimal para Binario.");
				System.out.println("Digite 2 para tranformar de Binario para Decimal.");
				int escolha;
				escolha = sc.nextInt();
				
				if (escolha == 1) {
					int divisor;
					// Número em binario que o usuário vai digitar
					String binario = "";
					System.out.println("Digite um numero");
					// Pega a informação do teclado
					divisor = sc.nextInt();
					// Mantem o numero original que o usuario digitou
					int numero = divisor;
					while (divisor > 0) {
						if (divisor % 2 == 0) {
							// Pega o resto da divisão terminado em 0 e monta o numero.
							binario = "0" + binario;
						} else {
							// Pega o resto da divisão terminado em 1 e monta o numero.
							binario = "1" + binario;
						}
						// A cada interação o número é dividido por 2.
						divisor = divisor / 2;

					}
					// Mostra o número convertido em binário.
					System.out.printf("O o numero %d em binario é %s\n ", numero, binario);
				} else if (escolha == 2) {
					// Número binário que o usuário vai digitar
					Scanner leitor =new Scanner(System.in);
					System.out.println("Digite um numero.");
					String binario = "";
					// Pega o número que o usuário digitou.
					binario = leitor.nextLine();
					// Converte a string em int e o binário em decimal.
					int decimal = Integer.parseInt(binario, 2);
					// Mostra o número convertido de binário para decimal.
					System.out.printf("O numero %s em decimal é %d.\n", binario, decimal);

				} else {
					// Cai nessa condição se o usuário digitar um número diferente da opção.
					System.out.println("Numero inválido");
				}

				break;
			case 7:
				System.out.println("Voce está sanido do sistema!!");
				System.exit(0);
				break;

			}
		} while (!sair);
	}

}
