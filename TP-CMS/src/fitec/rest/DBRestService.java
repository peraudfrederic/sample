package fitec.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;

import fitec.service.DaoServiceImpl;
import fitec.service.IDaoService;


@Path("/DB")
@Produces("application/json")
@Consumes("application/json")
@Component	//ou @Service : pour prise en charge par spring
public class DBRestService {
	
	private IDaoService dbService = new DaoServiceImpl();
	
	@GET
	@Path("/version")
	// url complete : http://localhost:8080/TP-CMS/services/rest/DB/version
	// ou services est configur� dans web.xml et rest dans restSpringConfig et 1 est l'id pour exemple
	public double getVersion() {
		return dbService.getVersion();
	}
	
	@POST
	@Path("/content")
	@Consumes(MediaType.APPLICATION_JSON)
	// url complete : http://localhost:8080/TP-CMS/services/rest/DB/content
	// ou services est configur� dans web.xml et rest dans restSpringConfig et 1 est l'id pour exemple
	//public Response getContent(String[] contentTab) {
	public Response getContent(String contentTab) {
	//public Response getContent(Object contentTab) {
		try {
			System.out.println(contentTab.toString());
			//auteur = serviceAuteur.ajouterAuteur(auteur);
			return Response
					.status(Status.OK)
					//.entity(auteur)
					.build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.BAD_REQUEST).build();
		}
	}
	
}
