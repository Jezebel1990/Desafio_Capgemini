package classes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import classes.Conexao;
import classes.modelo.Anuncio;

public class AnuncioDAO {
	private Connection connection;
	Long id;
	String nomeanuncio;
	String cliente;

	Date inicio = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String Inicio = dateFormat.format(inicio);

	Date termino = new Date();
	DateFormat dateFormato = new SimpleDateFormat("dd-MM-yyyy");
	String Termino = dateFormat.format(termino);

	Double investimento;
	 
public AnuncioDAO(){
        this.connection = new Conexao().getConnection();
    } 
    public void adicionar(Anuncio anuncio)throws SQLException, ParseException{ 
        String sql = "INSERT INTO anuncio(nomeanuncio,cliente,inicio,termino,investimento) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, anuncio.getNomeanuncio());
            stmt.setString(2, anuncio.getCliente());
            stmt.setDate(3, new java.sql.Date(anuncio .getInicio().getTime()));
            stmt.setDate(4, new java.sql.Date(anuncio .getTermino().getTime()));
            stmt.setDouble(5, anuncio.getInvestimento());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}