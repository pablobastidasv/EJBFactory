package com.test.factory;

import com.test.ejb.Servicios;

import static com.test.factory.ServicioEnum.*;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * Created by pbastidas on 30/10/14.
 */
public class ServicesFactory {

    @Inject
    private ServicesProvider servicesProvider;

    @Produces
    @ServicesDescriptor(SERVICIO)
    public Servicios getNecesidadServiceBean(){
        return servicesProvider.doLookup(Servicios.class, SERVICIO);
    }

}
