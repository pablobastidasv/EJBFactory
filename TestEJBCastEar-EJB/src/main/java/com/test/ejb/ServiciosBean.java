package com.test.ejb;

import com.test.ejb.Servicios;
import com.test.ejb.ServiciosRemote;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created by pbastidas on 30/10/14.
 */
@Stateless
@LocalBean
@Remote(ServiciosRemote.class)
public class ServiciosBean implements Servicios {

    public void hacerAlgo(){
        System.out.println("Algo");
    }

}
