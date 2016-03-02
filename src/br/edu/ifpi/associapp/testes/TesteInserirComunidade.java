package br.edu.ifpi.associapp.testes;

import br.edu.ifpi.associapp.dao.ComunidadeDAO;
import br.edu.ifpi.associapp.dao.ComunidadeJDBCDAO;
import br.edu.ifpi.associapp.modelo.Comunidade;
import br.edu.ifpi.associapp.modelo.enums.TipoComunidadeEnum;

public class TesteInserirComunidade {
	
	public static void main(String[] args) {
		
		ComunidadeDAO dao = new ComunidadeJDBCDAO();
		
		Comunidade c = new Comunidade();
		c.setNome("Macambira");
		c.setTipo(TipoComunidadeEnum.RURAL);
		c.setIdadeMinimaLider(22);;
		
		c = dao.inserir(c);
		System.out.println("Inseriu com sucesso. Id gerado:"+c.getId());
		
	}

}
