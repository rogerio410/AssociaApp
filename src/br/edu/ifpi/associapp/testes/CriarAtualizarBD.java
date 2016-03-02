package br.edu.ifpi.associapp.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ifpi.associapp.dao.ConnectionFactory;

public class CriarAtualizarBD {
	public static void main(String[] args) throws SQLException {
		
		Connection conn = ConnectionFactory.getConnection();
		Statement stmt = conn.createStatement();
		String sql_comunidade = "CREATE TABLE comunidade"
				+ "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ " nome VARCHAR(100),"
				+ " idadeMinimaLider INTEGER,"
				+ " tipo INTEGER)";
		
		try {
			stmt.executeUpdate(sql_comunidade);
			System.out.println("Base criada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao atualizar a base!");
		}
		
	}

}
