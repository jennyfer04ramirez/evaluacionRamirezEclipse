package ec.edu.ups.ppw.evaluacionRamirez.servicio;

import ec.edu.ups.ppw.evaluacionRamirez.bussiness.GestionCandidato;
import ec.edu.ups.ppw.evaluacionRamirez.modelo.Candidato;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/candidatos")
public class CandidatoServicio {

	@Inject
	private GestionCandidato gestionCandidato;
	
	@GET 
	@Path("/candidato")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCandidatos() {

        try{
        	var m = gestionCandidato.GetAllCandidato();
;            return Response.ok(m).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
	
	@GET 
	@Path("/binomio")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBinomio() {

        try{
        	var m = gestionCandidato.GetAllBinomios();
;            return Response.ok(m).build();
        }catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
	
	@POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertCandidato(Candidato candidato) {
        try{
            var validar = gestionCandidato.AddCandidato(candidato);
            if (validar) {
				return Response.ok().build();
			}else {
				return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Ocurrio un error al ingresar").build();
			}
        }
        catch (Exception e){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
    }
}
