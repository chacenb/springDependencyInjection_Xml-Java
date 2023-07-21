package com.chace.springInjection_XmlConfig.getBeanFromComponentScanning;

import com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans.Xxml;
import com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans.Yxml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class RunFromComponentScanning {

    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("Running Component Scanned Beans from xml file ");
        System.out.println("***********************************************");

        /* load the context and create beans specified in the BeansFromComponentScanning.xml file */
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("beanXmlConfFiles/BeansFromComponentScanning.xml");

        /* getting Y bean created from xml file and do some actions */
        Yxml yxmlBean = appContext.getBean(Yxml.class);
        yxmlBean.methodY();

        /* getting X bean created from xml file and do some actions */
        Xxml xxmlBean = appContext.getBean(Xxml.class);
        Yxml yxmlFromxxml = xxmlBean.getYxmlPropertyInsideXxml();
        xxmlBean.makeYjavaTalk("\"Hi chace XML\"");
        yxmlFromxxml.printDBConfigs();


        /* closing application context */
        appContext.close();
    }
}
