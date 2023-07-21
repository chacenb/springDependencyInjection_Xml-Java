package com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration;

import com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans.Xxml;
import com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans.Yxml;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunFromExplicitBeanDeclaration {
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("Running Explicit Bean Declaration in xml file ");
        System.out.println("***********************************************");

        /* load the context and create beans specified in the BeansFromComponentScanning.xml file */
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("beanXmlConfFiles/BeansFromExplicitDeclaration.xml");

        /* getting X bean created from xml file and do some actions */
        Xxml xxmlBean = appContext.getBean("beanX", Xxml.class);
        Yxml yxmlFromxxml = xxmlBean.getYxmlPropertyInsideXxml();
        yxmlFromxxml.methodY();
        xxmlBean.makeYjavaTalk("\"Hi chace XML\"");

        /* getting Y bean created from xml file and do some actions */
        Yxml yxmlBean = appContext.getBean("beanY", Yxml.class);
        yxmlBean.methodY();

        /* closing application context */
        appContext.close();
    }
}
