package com.loiane.cursojava.POO;

public class TesteMetodoSimples {
	public static void main(String[] arg) {
		MetodoSimples andre= new MetodoSimples();
		MetodoSimples jao= new MetodoSimples();
		jao.nome="jão";
		jao.idade=17;
		jao.p1=4;
		jao.p2=7.5;
		
		andre.nome="Andre";
		andre.idade=19;
		andre.p1=8.5;
		andre.p2=10;
		//metodo sem retorno:
		andre.media();
		//metodo com retorno:
		double Media = andre.mediaRetorno();
		System.out.println("A MEDIA É: "+Media );
		jao.media();
		
		//metodo com parametro:
		double novaMedia = andre.pontoExtra(1.0);
		System.out.println("nova media com ponto extra: "+novaMedia);
	}

}
