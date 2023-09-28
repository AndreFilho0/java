package com.loiane.cursojava.POO;

public class TesteLampada {
	public static void main(String[] arg) {
		Lampada lampada = new Lampada ("led",120.0,2.0);
		System.out.print(lampada.nome+" " + +lampada.duracao+"h "+lampada.potencia+"w"  );
		
	}

}
