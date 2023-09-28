package com.loiane.cursojava.POO;

public class contaCorrente {
	String nome;
	int numeroConta;
	double saldo;
	String status;
	double limite;
	
    void mostraCliente() {
    	System.out.println("Número da conta:"+numeroConta +" NOME: "+nome);
    	System.out.println("saldo: "+saldo+"-limite: "+limite + " status: "+status);
    }
    void saque (double saque){
    	if (saldo>=0 && saldo>=saque) {
    		System.out.println("saque feito com sucesso");
    		saldo-=saque;
    		
    	
    		
    		
    	}else {
    		System.out.println("saldo insuficiente ");
    		
    	}
    	
    }
    void deposito(double deposito) {
    	saldo+=deposito;
    	
    }
    
    
}
