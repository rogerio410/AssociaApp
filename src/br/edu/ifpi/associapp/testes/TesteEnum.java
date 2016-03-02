package br.edu.ifpi.associapp.testes;

import br.edu.ifpi.associapp.modelo.Membro;
import br.edu.ifpi.associapp.modelo.Pessoa;
import br.edu.ifpi.associapp.modelo.enums.Cargo;

public class TesteEnum {
	
	public static void main(String[] args) {
		
		Membro m = new Membro();
		
		m.setPessoa(new Pessoa());
		m.setCargo(Cargo.PRESIDENTE);
		
		System.out.println(m.getCargo().getId());
		
		m.setCargo(Cargo.fromInteger(1));
		
	}

}






