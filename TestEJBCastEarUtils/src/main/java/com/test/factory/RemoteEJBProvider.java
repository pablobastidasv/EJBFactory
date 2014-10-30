package com.test.factory;

import javax.enterprise.inject.Alternative;

/**
 * Created by pbastidas on 30/10/14.
 */
@Alternative
public class RemoteEJBProvider implements ServicesProvider {
    @Override
    public <T> T doLookup(Class<T> clazz, ServicioEnum servicioEnum) {
        return new BeanLocator.GlobalJNDIName()
                .withAppName(servicioEnum.getAppName())
                .withModuleName(servicioEnum.getModuleName())
                .withBeanName(servicioEnum.getBeanName())
                .withBusinessInterface(servicioEnum.getRemoteClazz())
                .locate(clazz);
    }
}
