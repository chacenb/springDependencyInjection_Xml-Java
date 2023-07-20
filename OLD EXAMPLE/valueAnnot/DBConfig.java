package com.chace.valueAnnot;

/* Configuration class that provides a @Bean method for DBConnection class */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = true)
public class DBConfig {
    @Value("Default DBConfiguration")
    private String defaultName;

    @Value("true")
    private boolean defaultBoolean;

    @Value("10")
    private int defaultInt;

    @Value("${APP_NAME_NOT_FOUND:Default}")
    private String defaultAppName;

    // @Value("#{systemProperties['java.home']}")
    @Value("${java.home}")
    private String javaHome;

    @Value("${HOME}")
    private String homeDir;

    @Bean
    public DBConn getDBConn() {
        DBConn dbConnection = new DBConn();
        return dbConnection;
    }

    @Value("Test")
    public void printValues(String s, @Value("another variable") String v) {
        System.out.println("Input Argument 1 =" + s);
        System.out.println("Input Argument 2 =" + v);

        System.out.println("Home Directory = " + homeDir);
        System.out.println("Default Configuration Name = " + defaultName);
        System.out.println("Default App Name = " + defaultAppName);
        System.out.println("Java Home = " + javaHome);
        System.out.println("Boolean = " + defaultBoolean);
        System.out.println("Int = " + defaultInt);

    }
}
