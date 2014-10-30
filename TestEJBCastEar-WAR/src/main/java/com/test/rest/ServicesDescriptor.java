package com.test.rest;

import com.test.ejb.ServicioEnum;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by pbastidas on 30/10/14.
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface ServicesDescriptor {
    ServicioEnum value();
}
