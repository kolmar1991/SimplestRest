package rest;


import entity.SimpleObject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("service")
@Stateless
public class RestService {

    @PersistenceContext
    EntityManager entityManager;

    @Path("/persist/{name}")
    @GET
    public String persist(@PathParam("name") String name){
        SimpleObject simpleObject = new SimpleObject(name);
        entityManager.persist(simpleObject);
        return "success";
    }
}
