package com.loiane.cursojava.POO;

public class modificadoresAcesso {
	int a;   // visivel na classe e no pacote
	private int b; // visivel só na classe
	public int c; // visivel em tudo 
	protected int d ; // visivel na classe e nas subclasses e no pacote 
	
	public modificadoresAcesso() {};
	public modificadoresAcesso(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String toString() {
		return "modificadoresAcesso [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}





	

}
