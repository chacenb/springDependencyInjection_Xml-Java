package com.chace.springInjectionXmlConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Xxml {
    @Autowired
    Yxml yxml;

    public Xxml() {
        System.out.println("Xxml constructed");
    }

    public void makeYjavaTalk(String msg){
        yxml.talkFromOutside(this.getClass(), msg);
    }

    public Yxml getY() {
        return yxml;
    }

    public void setY(Yxml yxml) {
        this.yxml = yxml;
    }
}
