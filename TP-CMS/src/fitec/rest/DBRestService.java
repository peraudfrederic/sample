package fitec.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import org.springframework.stereotype.Component;

import fitec.service.DaoServiceImpl;
import fitec.service.IDaoService;


@Path("/DB")
@Produces("application/json")
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
	
}
