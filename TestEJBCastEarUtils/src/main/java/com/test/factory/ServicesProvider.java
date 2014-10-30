package com.test.factory;

/**
 * Created by pbastidas on 30/10/14.
 */
public interface ServicesProvider {

    <T> T doLookup(final Class<T> clazz, final ServicioEnum servicioEnum);
}
