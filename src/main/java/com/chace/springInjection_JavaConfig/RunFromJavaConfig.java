package com.chace.springInjection_JavaConfig;

import com.chace.springInjection_JavaConfig.beans.Xjava;
import com.chace.springInjection_JavaConfig.beans.Yjava;
import com.chace.springInjection_JavaConfig.config.ApplicationConfiguration;
import com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans.Xxml;
import com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans.Yxml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunFromJavaConfig {

    public static void main(String[] args) {

        System.out.println("***********************************************");
        System.out.println("Running JAVA annotated Beans from JAVA config class ");
        System.out.println("***********************************************");


        /* spring dependency injection with Java configuration WORKING */
        {
            ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

            /* getting Y bean created from java annotated @Service class and do some actions */
            Yjava yjavaBean = appContext.getBean(Yjava.class);
            yjavaBean.methodY();

            /* getting X bean created from java annotated @Controller class and do some actions */
            Xjava x = appContext.getBean(Xjava.class);
            Yjava yFromx = x.getY();
            x.makeYjavaTalk("\"Hi chace JAVA\"");
            yFromx.printDBConfigs();


//            /* getting Y bean created from xml file and do some actions */
//            Yxml yxmlBean = appContext.getBean(Yxml.class);
//            yxmlBean.methodY();
//
//            /* getting X bean created from xml file and do some actions */
//            Xxml xxmlBean = appContext.getBean(Xxml.class);
//            Yxml yxmlFromxxml = xxmlBean.getYxmlPropertyInsideXxml();
//            xxmlBean.makeYjavaTalk("\"Hi chace XML\"");
//            yxmlFromxxml.printDBConfigs();

        }
    }

}
