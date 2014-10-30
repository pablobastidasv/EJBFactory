package com.test.ejb;

/**
 * Created by pbastidas on 30/10/14.
 */
public enum ServicioEnum {
    SERVICIO(ServiciosRemote.class, "com.test.ejb.ServiciosBean", "TestEJBCastEar-EAR-1.0-SNAPSHOT","TestEJBCastEar-EJB-1.0-SNAPSHOT","ServiciosBean");

    private final String localBusinessName;
    private final Class remoteClazz;
    private final String beanName;
    private final String appName;
    private final String moduleName;

    public String getLocalBusinessName() {
        return localBusinessName;
    }

    public Class getRemoteClazz() {
        return remoteClazz;
    }

    public String getBeanName() {
        return beanName;
    }

    public String getAppName() {
        return appName;
    }

    public String getModuleName() {
        return moduleName;
    }

    ServicioEnum(Class remoteClazz, String localBusinessName, String appName, String moduleName, String beanName) {
        this.localBusinessName = localBusinessName;
        this.remoteClazz = remoteClazz;
        this.beanName = beanName;
        this.appName = appName;
        this.moduleName = moduleName;
    }
}
