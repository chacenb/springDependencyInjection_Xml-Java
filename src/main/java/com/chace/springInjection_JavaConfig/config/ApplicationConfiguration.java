package com.chace.springInjection_JavaConfig.config;

//import com.chace.valueAnnot.DBConn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/* @Config.. classes are auto picked up for some initial setup of the aplpication */
@Configuration
/* specifies the package inside which the beans are in order to scan them */
@ComponentScan("com.chace.springInjection_JavaConfig")
/* Specify where we should look for the properties in order to use @Value in our classes */
@PropertySources({@PropertySource("classpath:db.properties"), @PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = true)})
public class ApplicationConfiguration {

}
