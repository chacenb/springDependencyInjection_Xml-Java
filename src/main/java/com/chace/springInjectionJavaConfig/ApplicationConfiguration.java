package com.chace.springInjectionJavaConfig;

//import com.chace.valueAnnot.DBConn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.chace.springInjectionJavaConfig")
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = true)
public class ApplicationConfiguration {

    @Value("initial Value")
    private String initializedValue;

    @Value("true")
    private boolean initializedBoolean;

    @Value("10")
    private int initializedInt;

    @Value("${APP_NAME_NOT_FOUND:Default}")
    private String defaultAppName;

    @Value("${java.home}")
    private String javaHome;

    @Value("Test")
    public void printValues(String s, @Value("another variable") String v) {
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("************ INPUT ARGUMENTS *******");
        System.out.println("Input Argument 1 = " + s + " Input Argument 2 = " + v);

        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("************ INITIALIZED PROPERTIES *******");
        System.out.println("Default Configuration Name = " + initializedValue);
        System.out.println("Boolean = " + initializedBoolean);
        System.out.println("Int = " + initializedInt);
        System.out.println("Java Home = " + javaHome);

        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("************ READING ROOT.PROPERTIES FILE *******");
        System.out.println("Default App Name = " + defaultAppName);
    }
}
