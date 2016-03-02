package br.edu.ifpi.associapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.associapp.modelo.Comunidade;
import br.edu.ifpi.associapp.modelo.enums.TipoComunidadeEnum;

public class ComunidadeJDBCDAO implements ComunidadeDAO{
	
	private Connection conn;

	@Override
	public Comunidade inserir(Comunidade c) {
		conn = ConnectionFactory.getConnection();
		
		try {
			Statement s = conn.createStatement();
			String sql = "INSERT INTO comunidade(nome, idadeMinimaLider, tipo) values('"+c.getNome()+"', "
					+c.getIdadeMinimaLider()+", '"+c.getTipo()+"')";
			s.executeUpdate(sql);
			
			sql = "SELECT id FROM comunidade ORDER BY id DESC limit 1";
			ResultSet rs = s.executeQuery(sql);
			int id = rs.getInt("id");
			c.setId(id);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir Comunidade");
		}
		
		return c;
	}

	@Override
	public List<Comunidade> lista() {
		List<Comunidade> lista = new ArrayList<>();
		conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM comunidade";
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultado = stmt.executeQuery(sql);
			while (resultado.next()) {
				Comunidade c = new Comunidade();
				c.setId(resultado.getInt("id"));
				c.setNome(resultado.getString("nome"));
				c.setIdadeMinimaLider(resultado.getInt("idadeMinimaLider"));
				c.setTipo(TipoComunidadeEnum.valueOf(resultado.getString("tipo")));
				lista.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return lista;
	}
	
	@Override
	public Comunidade obter(int id) {
		conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM comunidade WHERE id = " + id;
		Comunidade c = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet resultado = stmt.executeQuery(sql);
			while (resultado.next()) {
				c = new Comunidade();
				c.setId(resultado.getInt("id"));
				c.setNome(resultado.getString("nome"));
				c.setIdadeMinimaLider(resultado.getInt("idadeMinimaLider"));
				c.setTipo(TipoComunidadeEnum.fromInteger(resultado.getInt("tipo")));
			}
			return c;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void remover(Comunidade c) {
		// TODO Auto-generated method stub
		
	}

}
