package main;

import main.Account;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		boolean isRunning = true;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem vindo ao Banco do Beavis!");
		System.out.println();
		
		Account account = new Account();
		
		System.out.println("Para criar sua conta por favor digite o número da conta que deseja criar: ");
		
		account.accountnumber = sc.nextInt();
		System.out.println();
		
		System.out.println("Agora por favor digite seu nome completo: ");
		sc.nextLine();
		account.name = sc.nextLine();
		System.out.println();
		
		System.out.println("E para finalizar, por favor informe o valor de depósito inicial (informar 0,00 caso não deseje depositar agora): ");
		account.saldo = sc.nextDouble();
		System.out.println();
		
		System.out.println("Parabéns, você criou sua conta!");
		System.out.println("Número da conta: " + account.accountnumber + ", Nome: " + account.name + ", Saldo total: R$ " + account.saldo);

		
		System.out.println();
		
		System.out.println("Digite: 1. Depositar");
		System.out.println("Digite: 2. Sacar");
		System.out.println("Digite: 3. Consulta");

		
		int choice = sc.nextInt();

		while (isRunning){
		
		switch (choice){
		
		case 1 :
			System.out.println("Digite o valor que deseja depositar: ");
			
			double valor = sc.nextDouble();
			
			account.Depositar(valor);
			
			break;
			
		case 2 :
			
			System.out.println("Digite o valor que deseja sacar: ");
			
			double valor1 = sc.nextDouble();
			
			account.Sacar(valor1);
			
			break;
			
		case 3:
			
			System.out.println();
			System.out.println("Número da conta: " + account.accountnumber + ", Nome: " + account.name + ", Saldo total: R$ " + account.saldo);
			System.out.println();
			
			
		}
		
	}
		sc.close();
		
		System.out.println("Obrigado, finalizando sessão... [\\\\\\\\\\\\XXXXXXXX]");
		
		}
		
	}