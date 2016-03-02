package br.edu.ifpi.associapp.testes;

import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.modelo.Comunidade;

public class TesteObterComunidade {
	
	public static void main(String[] args) {
		
		ComunidadeDAO dao = new ComunidadeJDBCDAO();
		
		Comunidade comunidade = dao.obter(1);
		
		System.out.println("Comunidade: "+ comunidade.getId() + " : " + comunidade.getNome() + " Tipo: " + comunidade.getTipo());
		
	}

}
