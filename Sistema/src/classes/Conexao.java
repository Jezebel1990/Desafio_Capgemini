package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/db_anuncio","root","je245b13");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
    }
}

		
	

