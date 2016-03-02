package br.edu.ifpi.associapp.testes;

import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.modelo.Comunidade;
import br.edu.ifpi.associapp.modelo.enums.TipoComunidadeEnum;

public class TestarInserirComunidade {
	
	public static void main(String[] args) {
		
		ComunidadeDAO dao = new ComunidadeJDBCDAO();
		
		//Objeto
		Comunidade c = new Comunidade();
		c.setNome("CAITITU");
		c.setIdadeMinimaLider(18);
		c.setTipo(TipoComunidadeEnum.RURAL);
		
		dao.inserir(c);
		
	}

}
