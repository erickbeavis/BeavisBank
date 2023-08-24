package main;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Bem vindo ao Banco do Beavis!");
		System.out.println();
		
		Account account = new Account ();
		
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
		
		System.out.println("Digite o valor que deseja depositar: ");
		
		double valor = sc.nextDouble();
		
		account.Depositar(valor);

		System.out.println();
		System.out.println("O saldo total da sua conta ficou: " + account.saldo);
		System.out.println();
		
		//FINAL DEPOSITAR
		
		System.out.println("Digite o valor que deseja sacar: ");
		
		double valor1 = sc.nextDouble();
		
		account.Sacar(valor1);
		

		System.out.println();
		System.out.println("O saldo total da sua conta ficou: " + account.saldo);
		
		System.out.println();
		System.out.println("Número da conta: " + account.accountnumber + ", Nome: " + account.name + ", Saldo total: R$ " + account.saldo);
		System.out.println();
		
		System.out.println("Obrigado, finalizando sessão... [\\\\\\\\\\\\XXXXXXXX]");
		
		sc.close();
	}

}
