package ec.edu.ups.ppw.evaluacionRamirez.servicio;

import ec.edu.ups.ppw.evaluacionRamirez.DAO.CandidatoDAO;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {

	@Inject
	private CandidatoDAO candidatoDAO;
	
	
}
