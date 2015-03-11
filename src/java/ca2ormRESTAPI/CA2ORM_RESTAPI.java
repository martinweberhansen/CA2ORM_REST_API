/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2ormRESTAPI;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author MASA
 */
@Path("person")
public class CA2ORM_RESTAPI {

    @Context
    private UriInfo context;

    public CA2ORM_RESTAPI()
    {
        
    }
    
    @GET
    @Produces("application/json")
    @Path("complete")
    public String getAllPersonsDetail() 
    {
        Gson gson = new Gson();
        return gson.toJson(list.values());
    }
    
    @GET
    @Produces("application/json")
    @Path("complete/{id}")
    public String getPerson(@PathParam("id")int id) 
    {
        Gson gson = new Gson();
        return gson.toJson(list.values());
    }
    
    @GET
    @Produces("application/json")
    @Path("contactinfo")
    public String getAllPersonsContactInfo() 
    {
        Gson gson = new Gson();
        return gson.toJson(list.values());
    }  
    
    @GET
    @Produces("application/json")
    @Path("contactinfo/{id}")
    public String getPersonContactinfo(@PathParam("id")int id) 
    {
        Gson gson = new Gson();
        return gson.toJson(lsit.values());
    }
    
    @POST
    @Consumes("application/json")
    public String getAllPersons() 
    {
        Gson gson = new Gson();
        return gson.toJson(list.values());
    }
    
    
    
    
    
    
    

}
