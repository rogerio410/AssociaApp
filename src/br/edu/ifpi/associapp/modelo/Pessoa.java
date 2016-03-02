package br.edu.ifpi.associapp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private List<Parentesco> parentescos = new ArrayList<>();
	
	public void addParentesco(Pessoa p, TipoParentesco tp){
		//Adicionar nesta pessoa
		Parentesco parentesco = new Parentesco();
		parentesco.setParente(p);
		parentesco.setTipo(tp);
		this.parentescos.add(parentesco);
		//Adicionar Parentesco na outra pessoa (espelho)
		Parentesco parentesco2 = new Parentesco();
		parentesco2.setParente(this);
		parentesco2.setTipo(tp.getEspelho());
		p.getParentescos().add(parentesco2);
	}
	
	public List<Parentesco> getParentescos() {
		return parentescos;
	}

}




