package com.loiane.cursojava.ExercicicoPOO;

public class ContaEspecial extends ContaBancaria {
	protected double limite;
	
	
	
	public ContaEspecial(String nomeCliente, double saldo, int numConta,double limite) {
		super(nomeCliente,saldo,numConta);
		this.limite = limite;
	}


	public void sacar (double saque) {
		 if (getSaldo()>=saque && limite>=getSaldo()) {
			 setSaldo(getSaldo()- saque);
			 System.out.println("saque feito com sucesso, na conta da(o): "+ super.getNomeCliente());
		 } else if (limite<=getSaldo()) {
			 System.out.println("não tem limite");
		 }else {
			 System.out.println("não tem saldo");
		 }
		  
	}


	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", getNomeCliente()=" + getNomeCliente() + ", getSaldo()="
				+ getSaldo() + ", getNumConta()=" + getNumConta() + "]";
	}

	
	
	}
	
	


