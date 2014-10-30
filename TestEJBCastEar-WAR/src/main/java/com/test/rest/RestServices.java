package com.test.rest;

import com.test.ejb.Servicios;
import com.test.ejb.ServiciosRemote;
import com.test.factory.ServicesDescriptor;
import static com.test.factory.ServicioEnum.*;

import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by pbastidas on 30/10/14.
 */
@Path("srv")
public class RestServices {


    @Inject
    @ServicesDescriptor(SERVICIO)
    Servicios servicio;

    @GET
    public Response hacerAlgo() throws NamingException {

        String baseJndi = "java:global/TestEJBCastEar-EAR-1.0-SNAPSHOT/TestEJBCastEar-EJB-1.0-SNAPSHOT/ServiciosBean!";

        Object lookupRemoto = new InitialContext().lookup(baseJndi + ServiciosRemote.class.getName());
        Object lookupLocal = new InitialContext().lookup(baseJndi + "com.test.ejb.ServiciosBean");


        Servicios sr = (Servicios) lookupRemoto;
        Servicios sl = (Servicios) lookupLocal;

        sr.hacerAlgo();
        sl.hacerAlgo();

        servicio.hacerAlgo();

        return Response.ok().build();
    }
}
