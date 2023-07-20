package com.chace.springInjectionXmlConfig;

public class Yxml {
    public void methodY(){
        System.out.println("In method Yxml");
    }

    public void talkFromOutside(Class<?> triggerClass,String msg) {
        System.out.println(triggerClass + " Made me say " + msg);
    }

}
