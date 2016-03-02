package br.edu.ifpi.associapp.modelo;

import br.edu.ifpi.associapp.modelo.enums.Cargo;

public class Membro {
	
	private Pessoa pessoa;
	private Cargo cargo;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	

}
