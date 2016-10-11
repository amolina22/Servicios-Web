package com.mx.abel.jersey;

import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Abel Molina S
 */
@Path("/inicio")
public class JerseyService {

    @Path("saludo")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMensaje() {
        return "Hola este es un ejemplo de servicio rest !! - Jersey 2. Fecha: " + new Date();
    }

    @Path("miNombre/{name}")
    @GET
    public String doMiNombre(@PathParam("name") String name) {
        return "Hola, " + name;
    }

    @Path("miNombre")
    @GET
    public String doMiNombreWithRequestParam(@QueryParam("name") String name) {
        return "Hola, " + name;
    }
}
