package com.loiane.cursojava.RelacionamentoClasse;

public class testeContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		Endereco end = new Endereco();
		Telefone t1= new Telefone();
		Telefone t2= new Telefone();
		
		t1.setNumero(9559);
		t2.setNumero(65465);
		
		Telefone[] telefones = new Telefone[2];
		telefones[0]=t1;
		telefones[1]=t2;
	    
		
		
		end.setNumero("0");
		end.setCep("75340-000");
		end.setCidade("hidro");
		end.setEstado("go");
		end.setNomeRua("zé ");
		
		contato.setTelefones(telefones);
		contato.setEnderco(end);
		contato.setNome("andre");
		
		System.out.println(contato.getEnderco().getCidade());
		System.out.println(contato.getNome());
		for (Telefone t : contato.getTelefones()) {
			System.out.println(t.getNumero());
		}
		
		

	}

}
