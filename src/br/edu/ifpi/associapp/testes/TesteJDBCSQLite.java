package br.edu.ifpi.associapp.testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.edu.ifpi.associapp.dao.ConnectionFactory;

public class TesteJDBCSQLite {
	
	public static void main(String[] args) throws SQLException {
		Connection conn = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM gestao;";
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.executeQuery(sql);
	}

}






