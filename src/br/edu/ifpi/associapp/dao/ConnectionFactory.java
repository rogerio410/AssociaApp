package br.edu.ifpi.associapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection("jdbc:sqlite:associapp.db");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Não foi possivel obter uma conexao.");
		}
	}

}
