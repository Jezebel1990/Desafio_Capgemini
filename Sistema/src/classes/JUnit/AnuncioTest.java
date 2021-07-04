package classes.JUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.*;

public class AnuncioTest extends TestCase{
	public void testExecuta() {
		
		Long Id = (long) 1234567;
		String Nomeanuncio = "Campanha Natal sem fome";
		String Cliente = "Maria";
	     Date inicio = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    String Inicio = dateFormat.format(inicio);
		
	    Date termino = new Date();
	    DateFormat dateFormato = new SimpleDateFormat("dd-MM-yyyy");
	    String Termino = dateFormat.format(termino);
		
        Double Investimento = 0.0;
	}

}
