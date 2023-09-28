package com.loiane.cursojava.Loops;

public class For {
	public static void main(String[] args) {
		
		
		// tipos de loop "for " que a gente pode usar , segue essas ideia , temos um for('declarando variaveis locais para o loop';'condição do loop';'incrimento'){ 'ação'  } 
		
		for (int i=0;i<10;i++) {
			System.out.println(i);
						
		}
		// usando duas variaveis locais no ciclo
		for (int i=0 , j=10; i<j;i++,j--) {
			System.out.println("i:"+ i + "j:" + j);
			
		}
		
		//usando uma condição já existente 
		int i=0;
		for (;i<10;i++) {
			System.out.println(i);
			
		}
		
		
		
		
		
}

}
