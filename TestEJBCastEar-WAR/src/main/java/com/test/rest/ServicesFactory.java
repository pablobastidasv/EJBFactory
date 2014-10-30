package com.test.rest;

import com.test.ejb.ServicioEnum;
import com.test.ejb.Servicios;
import com.test.factory.ServiceDescriptorDTO;
import com.test.factory.ServicesProvider;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import static com.test.ejb.ServicioEnum.SERVICIO;

/**
 * Created by pbastidas on 30/10/14.
 */
public class ServicesFactory {

    @Inject
    private ServicesProvider servicesProvider;

    private ServiceDescriptorDTO getServiceDescriptorDTO(ServicioEnum servicio) {
        return new ServiceDescriptorDTO(
                servicio.getLocalBusinessName(),
                servicio.getRemoteClazz(),
                servicio.getBeanName(),
                servicio.getAppName(),
                servicio.getModuleName()
        );
    }

    @Produces
    @ServicesDescriptor(SERVICIO)
    public Servicios getNecesidadServiceBean(){
        return servicesProvider.doLookup(Servicios.class, getServiceDescriptorDTO(SERVICIO));
    }

}
