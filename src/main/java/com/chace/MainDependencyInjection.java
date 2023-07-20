package com.chace;

import com.chace.springInjectionJavaConfig.*;
import com.chace.springInjectionXmlConfig.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDependencyInjection {
    public static void main(String[] args) {

        /* spring dependency injection with xml configuration WORKING */
        {
            ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
            Xxml xxml = (Xxml) ac.getBean("x");
            Yxml yxmlFromxxml = xxml.getY();
            yxmlFromxxml.methodY();
            xxml.makeYjavaTalk("\"Hi chace XML\"");
            ac.close();
        }

        /* spring dependency injection with Java configuration WORKING */
        {
            ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
            Xjava x = (Xjava) appContext.getBean("xjava");
            Yjava yFromx = x.getY();
            yFromx.methodY();
            yFromx.printDBConfigs();
            x.makeYjavaTalk("\"Hi chace JAVA\"");
        }
    }

}
