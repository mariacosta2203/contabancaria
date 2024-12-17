package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.ContaPoupanca;
import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		try {
			opcao = leia.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("\nDigite valores inteiros ");
			leia.nextLine();
			opcao = 0;
		}
		
		
		ContaController contas = new ContaController();

		// Teste da classe conta

		/*Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();*/

		// Instanciamento da Classe Conta Corrente
		ContaCorrente cc2 = new ContaCorrente(1, 34, 1, "Francisco", 500.0f, 1000.0f);
		cc2.visualizar();

		// Instaciamento da Classe Conta Corrente com lite fixo
		ContaCorrente cc3 = new ContaCorrente(3, 12345, 1, "Maria", 1000.0f);
		cc3.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 3, "Victor", 10000000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		

		// Instanciamento | Classe -> Objeto Utilizavel
		/*
		 * Conta c11 = new Conta(123456, 0001, 1, "Maria das Neves", 500f);
		 * 
		 * c11.setSaldo(5000f);
		 * 
		 * System.out.println("Titular: " + c11.getTitular());
		 * System.out.println("Titular: " + c11.getSaldo());
		 */

		

		while (true) {

			System.out.println("\n" + Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DA M.E OLIVEIRA                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco da M.E Oliveira - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
				contas.listarTodas();
				keyPress();
				

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");
				
				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Maria Eduarda de Oliveira Costa ");
		System.out.println("Maria Eduarda - duda.costa2203@gmail.com");
		System.out.println("https://github.com/mariacosta2203");
		System.out.println("*********************************************************");

	}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}

