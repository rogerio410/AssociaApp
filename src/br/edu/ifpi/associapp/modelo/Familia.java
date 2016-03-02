package br.edu.ifpi.associapp.modelo;

import java.util.List;

public class Familia {
	
	private Comunidade comunidade;
	private Pessoa lider;
	private List<Pessoa> membros;
	private List<Bem> bens;
	
	public Comunidade getComunidade() {
		return comunidade;
	}
	
	protected void setComunidade(Comunidade comunidade) {
		this.comunidade = comunidade;
	}

}
