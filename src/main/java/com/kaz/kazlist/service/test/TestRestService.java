package com.kaz.kazlist.service.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service/test")
public class TestRestService {
  @GET
  @Path("/available")
  @Produces(MediaType.TEXT_PLAIN)
  public String available() {
    return "yup I am here";
  }
}