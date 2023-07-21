package com.chace;

import com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans.Xxml;
import com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans.Yxml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainDependencyInjection {

    @Autowired
    Xxml autoWiredXxml;

    public static void main(String[] args) {

        /* spring dependency injection with xml configuration WORKING */
        {
            /* load the context and create beans specified in the BeansFromComponentScanning.xml file */
            ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beanXmlConfFiles/BeansFromComponentScanning.xml");

            /* getting beans created from BeansFromComponentScanning.xml file */
//            Xxml xxmlFromBeansXMLFile = (Xxml) ac.getBean("beanXidFromXmlFile");
//            Yxml yxmlFromBeansXMLFile = (Yxml) ac.getBean("beanYidFromXmlFile");
//            Yxml yxmlFromxxml = xxmlFromBeansXMLFile.getY();
//            yxmlFromxxml.methodY();
//            xxmlFromBeansXMLFile.makeYjavaTalk("\"Hi chace XML\"");
//            yxmlFromBeansXMLFile.methodY();


            /* getting beans from component scanning */
            Xxml xxmlFromBeansXMLFileComponentScanning = (Xxml) ac.getBean(Xxml.class);
            Yxml yxmlFromBeansXMLFileComponentScanning = (Yxml) ac.getBean(Yxml.class);
            Yxml yxmlFromxxml = xxmlFromBeansXMLFileComponentScanning.getYxmlPropertyInsideXxml();
            yxmlFromxxml.methodY();
            xxmlFromBeansXMLFileComponentScanning.makeYjavaTalk("\"Hi chace XML\"");
            yxmlFromBeansXMLFileComponentScanning.methodY();

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
