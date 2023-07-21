package com.chace.springInjection_JavaConfig.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Yjava {

    {
//        @Value("Default DBConfiguration")
//        private String defaultName;
//        @Value("true")
//        private boolean defaultBoolean;
//        @Value("10")
//        private int defaultInt;
//        @Value("${APP_NAME_NOT_FOUND:Default}")
//        private String defaultAppName;
//        @Value("${java.home}")
//        private String javaHome;
//        @Value("${HOME}")
//        private String homeDir;
    }

    @Value("${ROOT_PROPERTY}")
    private String rootProperty;
    @Value("${DB_DRIVER_CLASS}")
    private String driverClass;
    @Value("${DB_URL}")
    private String dbURL;
    @Value("${DB_USERNAME}")
    private String userName;
    @Value("${DB_PASSWORD}")
    private char[] password;

    public void methodY() {
        System.out.println("In method Yjava");
    }

    public void talkFromOutside(Class<?> triggerClass, String msg) {
        System.out.println(triggerClass + " Made me say " + msg);
    }


    public void printDBConfigs() {
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("************ READING DB PROPERTIES VALUES **********");
        System.out.println("***************************************************");
        System.out.println("Root property = " + rootProperty);
        System.out.println("Driver Class = " + driverClass);
        System.out.println("DB URL = " + dbURL);
        System.out.println("User Name = " + userName);
        System.out.println("Password = " + String.valueOf(password));
        System.out.println("***************************************************");
        System.out.println("");
    }
}
