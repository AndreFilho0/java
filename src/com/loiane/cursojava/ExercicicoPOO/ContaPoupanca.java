package com.loiane.cursojava.ExercicicoPOO;

public class ContaPoupanca extends ContaBancaria {
	protected double rendimento ;
	
	
	public ContaPoupanca(String nomeCliente, double saldo, int numConta,double rendimento) {
		super(nomeCliente,saldo,numConta);
		this.rendimento = rendimento;
	}


	public void calcularNovoSaldo() {
		setSaldo(getSaldo()+getSaldo()*rendimento);
		
	}


	
	public String toString() {
		return "ContaPoupanca [rendimento=" + rendimento + ", getNomeCliente()=" + getNomeCliente() + ", getSaldo()="
				+ getSaldo() + ", getNumConta()=" + getNumConta() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	}
	


