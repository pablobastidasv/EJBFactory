package com.test.factory;

/**
 * Created by pbastidas on 30/10/14.
 */
public class ServiceDescriptorDTO {
    private String localBusinessName;
    private Class remoteClazz;
    private String beanName;
    private String appName;
    private String moduleName;

    public ServiceDescriptorDTO(String localBusinessName, Class remoteClazz, String beanName, String appName, String moduleName) {
        this.localBusinessName = localBusinessName;
        this.remoteClazz = remoteClazz;
        this.beanName = beanName;
        this.appName = appName;
        this.moduleName = moduleName;
    }

    public ServiceDescriptorDTO() {
    }

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
}
