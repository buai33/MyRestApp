/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.mcgill.cccs425.demo1;

import com.mcgill.cccs425.biz.Book;
import com.mcgill.cccs425.biz.BookDb;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * REST Web Service
 *
 * @author xwliu
 */
@Path("/books")
public class BookService {
    private static BookDb db = new BookDb();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsersResource
     */
    public BookService() {
    }

    /**
     * Retrieves representation of an instance of com.mcgill.cccs425.demo1.UsersResource
     * @return an instance of java.lang.String
     */
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getText() {
//        //TODO return proper representation object
//        return "hello world!";
//    }
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    @Path("/users")
//    public String getBooks() {
//        //TODO return proper representation object
//        return "here goes list of books";
//    }
//    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("/json")
//    public String getJson() {
//        //TODO return proper representation object
//        return "{\"field\": \"value\"}";
//    }
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    @Path("/users/getuserbyid")
//    public String getBookById(@QueryParam("id") String id) {
//        //TODO return proper representation object
//        return "here is the detailed info for user id: " + id + "\n";
//    }
    
    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getBook(@QueryParam("id") String id) {
//        //TODO return proper representation object
//        return (new User(id, "User name for id: " + id)).toString();
//    }
//    
//        
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    @Path("/users/getuserbyid")
//    public String getBookById(@QueryParam("id") String id) {
//        //TODO return proper representation object
//        return "here is the detailed info for user id: " + id + "\n";
//    }
    
        
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public Response getBook(@HeaderParam("Accept") String accept, @PathParam("id") long id) {
        //TODO return proper representation object
       Book result = db.find(id);
       if (result == null) {
           result = new Book(id, "title" + id);
       }
       if (result != null) {
           if (id == 1) {
               return Response.ok(result).type(MediaType.APPLICATION_XML).build();
           }
           return Response.ok(result).type(MediaType.APPLICATION_JSON).build();
           
       }
       return Response.status(Response.Status.NOT_FOUND).build();
    }
 

    /**
     * PUT method for updating or creating an instance of UsersResource
     * @param content representation for the resource
     */
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    @Path("/setdata")
    public String putData(String content) {
        somedata = content;
        return "data process OK -- ";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getdata")
    public String getData() {
        return somedata;
    }
    private static String somedata = "";
    
}
