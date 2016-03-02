package br.edu.ifpi.associapp.testes;

import java.util.List;

import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.modelo.Comunidade;

public class TesteListarComunidade {
	
	public static void main(String[] args) {
		
		ComunidadeDAO dao = new ComunidadeJDBCDAO();
		
		List<Comunidade> comunidades = dao.lista();
		
		for (Comunidade comunidade : comunidades) {
			System.out.println("Comunidade: "+ comunidade.getId() + " : " + comunidade.getNome() + " Tipo: " + comunidade.getTipo());
		}
		
	}

}
