package com.chace;

import com.chace.springInjectionXmlConfig.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDependencyInjection {

//    @Autowired
//    static Xxml autoWiredXxml;

    public static void main(String[] args) {

        /* spring dependency injection with xml configuration WORKING */
        {
            /* load the context and create beans specified in the Beans.xml file */
            ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");

            /* getting beans created from Beans.xml file */
//            Xxml xxmlFromBeansXMLFile = (Xxml) ac.getBean("beanXidFromXmlFile");
//            Yxml yxmlFromBeansXMLFile = (Yxml) ac.getBean("beanYidFromXmlFile");
//            Yxml yxmlFromxxml = xxmlFromBeansXMLFile.getY();
//            yxmlFromxxml.methodY();
//            xxmlFromBeansXMLFile.makeYjavaTalk("\"Hi chace XML\"");
//            yxmlFromBeansXMLFile.methodY();

            Xxml xxmlFromBeansXMLFileComponentScanning = (Xxml) ac.getBean(Xxml.class);
            Yxml yxmlFromxxml = xxmlFromBeansXMLFileComponentScanning.getY();
            yxmlFromxxml.methodY();
            xxmlFromBeansXMLFileComponentScanning.makeYjavaTalk("\"Hi chace XML\"");
//            yxmlFromBeansXMLFile.methodY();

            ac.close();
        }

        /* spring dependency injection with Java configuration WORKING */
        /*{
            ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
            Xjava x = (Xjava) appContext.getBean("xjava");
            Yjava yFromx = x.getY();
            yFromx.methodY();
            yFromx.printDBConfigs();
            x.makeYjavaTalk("\"Hi chace JAVA\"");
        }*/
    }

}
