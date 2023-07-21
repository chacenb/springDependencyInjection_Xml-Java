package com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans;

import org.springframework.beans.factory.annotation.Value;

//@Service
public class Yxml {

//    @Value("${DB_DRIVER_CLASS}")
    private String driverClass;
//    @Value("${DB_URL}")
    private String dbURL;
//    @Value("${DB_USERNAME}")
    private String userName;
//    @Value("${DB_PASSWORD}")
    private char[] password;


    public Yxml() {
        System.out.println("Yxml constructed");
    }

    public void methodY(){
        System.out.println("Hi method from inside Yxml");
    }

    public void talkFromOutside(Class<?> triggerClass,String msg) {
        System.out.println(triggerClass + " Made me say " + msg);
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public void printDBConfigs() {
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("************ READING DB PROPERTIES VALUES **********");
        System.out.println("***************************************************");
        System.out.println("Driver Class = " + driverClass);
        System.out.println("DB URL = " + dbURL);
        System.out.println("User Name = " + userName);
        System.out.println("Password = " + String.valueOf(password));
        System.out.println("***************************************************");
        System.out.println("");

    }
}
