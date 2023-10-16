package com.loiane.cursojava.ExercicicoPOO;

public class ContaBancaria {
	private String nomeCliente;
	private double saldo;
	private int numConta;
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public ContaBancaria() {}

	public ContaBancaria(String nomeCliente, double saldo, int numConta) {
		super();
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.numConta = numConta;
	}
	
	 public void sacar (double valor) {
			 if ((saldo-valor)>=0) {
				 saldo-=valor;
				 System.out.println("saque feito com sucesso");
			 }else {
			 System.out.println("não tem saldo");
			 }
		}
	 
	 public void depositar (double depositos) {
		 saldo += depositos;
	 }

	
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", saldo=" + saldo + ", numConta=" + numConta + "]";
	}
	 
	 
	}
	
	
	
	


