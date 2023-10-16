package com.loiane.cursojava.ExercicicoPOO;

public class ContaEspecial extends ContaBancaria {
	protected double limite;
	
	
	
	public ContaEspecial(String nomeCliente, double saldo, int numConta,double limite) {
		super(nomeCliente,saldo,numConta);
		this.limite = limite;
	}


	public void sacar (double saque) {
		 if (saldo>=saque && limite>=saldo) {
			 saldo=saldo-saque;
			 System.out.println("saque feito com sucesso");
		 } else if (limite<=saldo) {
			 System.out.println("não tem limite");
		 }else {
			 System.out.println("não tem saldo");
		 }
		  
	}

	
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeCliente=" + nomeCliente + ", saldo=" + saldo + ", numConta="
				+ numConta + "]";
	}
	
	

}
