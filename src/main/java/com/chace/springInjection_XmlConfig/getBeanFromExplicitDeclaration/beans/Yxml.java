package com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans;

//@Service
public class Yxml {

    public Yxml() {
        System.out.println("Yxml constructed");
    }

    public void methodY(){
        System.out.println("In method Yxml");
    }

    public void talkFromOutside(Class<?> triggerClass,String msg) {
        System.out.println(triggerClass + " Made me say " + msg);
    }

}
