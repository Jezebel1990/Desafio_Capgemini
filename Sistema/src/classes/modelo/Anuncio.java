package classes.modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Anuncio {

	private Long id;
	private String nomeanuncio;
	private String cliente;

	private Date inicio = new Date();
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	String Inicio = dateFormat.format(inicio);

	private Date termino = new Date();
	DateFormat dateFormato = new SimpleDateFormat("dd-MM-yyyy");
	String Termino = dateFormat.format(termino);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeanuncio() {
		return nomeanuncio;
	}

	public void setNomeanuncio(String nomeanuncio) {
		this.nomeanuncio = nomeanuncio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public Double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(Double investimento) {
		this.investimento = investimento;
	}

	private Double investimento;

	public void setInvestimento(String text) {
		// TODO Auto-generated method stub

	}

	public void setInicio(String text) {
		// TODO Auto-generated method stub

	}

	public void setTermino(String text) {
		// TODO Auto-generated method stub

	}

}
