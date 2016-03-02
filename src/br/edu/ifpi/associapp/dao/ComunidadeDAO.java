package br.edu.ifpi.associapp.dao;

import java.util.List;

import br.edu.ifpi.associapp.modelo.Comunidade;

public interface ComunidadeDAO {
	
	public int inserir(Comunidade c);
	public List<Comunidade> lista();
	public Comunidade obter(int id);
	public void remover(Comunidade c);

}
