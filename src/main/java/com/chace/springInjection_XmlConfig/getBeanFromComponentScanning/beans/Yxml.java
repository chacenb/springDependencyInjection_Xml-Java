package com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans;

import org.springframework.stereotype.Service;

@Service
public class Yxml {

    public Yxml() {
        System.out.println("Yxml constructed");
    }

    public void methodY(){
        System.out.println("Hi from inside Yxml");
    }

    public void talkFromOutside(Class<?> triggerClass,String msg) {
        System.out.println(triggerClass + " Made me say " + msg);
    }

}
