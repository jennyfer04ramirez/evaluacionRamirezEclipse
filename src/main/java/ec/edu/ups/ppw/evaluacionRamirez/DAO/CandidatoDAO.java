package ec.edu.ups.ppw.evaluacionRamirez.DAO;

import java.util.List;

import ec.edu.ups.ppw.evaluacionRamirez.modelo.Binomio;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Candidato;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class CandidatoDAO {

	@PersistenceContext
    EntityManager em;
	
	public void addCandidato(Candidato candidato) {
        em.persist(candidato);
    }
	
	public List<Candidato> getCandidato(){
        String jplql = "SELECT c FROM Candidato c";
        Query q = em.createQuery(jplql,Candidato.class);
        List<Candidato> lista = q.getResultList();
        return lista;
    }
	
	public void addBinomio(Binomio binomio) {
        em.persist(binomio);
    }
	
	public List<Binomio> getBinomio(){
        String jplql = "SELECT b FROM Binomio b";
        Query q = em.createQuery(jplql,Binomio.class);
        List<Binomio> lista = q.getResultList();
        return lista;
    }
	
}
