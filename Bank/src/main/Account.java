package main;

public class Account {

	int accountnumber;
	String name;
	double saldo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double Depositar(double valor) {
		return saldo += valor;
	}
	
	public double Sacar(double valor1) {
	    double valorASubtrair = 5.0;
	    saldo -= valorASubtrair;
	    return saldo -= valor1;
	}
	}
   

