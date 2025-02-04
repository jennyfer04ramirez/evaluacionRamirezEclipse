package ec.edu.ups.ppw.evaluacionRamirez.bussiness;

import java.util.List;

import ec.edu.ups.ppw.evaluacionRamirez.DAO.CandidatoDAO;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Binomio;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Candidato;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GestionCandidato {

	@Inject
	private CandidatoDAO candidatoDAO;

	public List<Binomio> GetAllBinomios() {
		return candidatoDAO.getBinomio();
	}

	public boolean AddCandidato(Candidato candidato) {
		candidatoDAO.addBinomio(candidato.getBinomio());
		candidatoDAO.addCandidato(candidato);
		return true;
	}

	public List<Candidato> GetAllCandidato() {
		return candidatoDAO.getCandidato();
	}
}
