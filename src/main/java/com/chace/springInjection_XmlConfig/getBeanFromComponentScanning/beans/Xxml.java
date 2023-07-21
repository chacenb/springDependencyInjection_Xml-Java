package com.chace.springInjection_XmlConfig.getBeanFromComponentScanning.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Xxml {

    @Autowired
    private Yxml yxmlPropertyInsideXxml;

    public Xxml() {
        System.out.println("Xxml constructed");
    }

    public void makeYjavaTalk(String msg){
        yxmlPropertyInsideXxml.talkFromOutside(this.getClass(), msg);
    }

    public void setYxmlPropertyInsideXxml(Yxml yxmlPropertyInsideXxml) {
        this.yxmlPropertyInsideXxml = yxmlPropertyInsideXxml;
    }

    public Yxml getYxmlPropertyInsideXxml() {
        return yxmlPropertyInsideXxml;
    }
}
