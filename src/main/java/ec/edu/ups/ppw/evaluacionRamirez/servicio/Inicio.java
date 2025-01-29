package ec.edu.ups.ppw.evaluacionRamirez.servicio;

import ec.edu.ups.ppw.evaluacionRamirez.DAO.CandidatoDAO;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Binomio;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Candidato;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	@Inject
	private CandidatoDAO candidatoDAO;
	
	@PostConstruct
	public void init() {
		
		Candidato c = new Candidato();
		c.setNombre("Pablo");
		candidatoDAO.addCandidato(c);
		
		Binomio b = new Binomio();
		b.setNombre("dg");
		candidatoDAO.addBinomio(b);
	}
}
