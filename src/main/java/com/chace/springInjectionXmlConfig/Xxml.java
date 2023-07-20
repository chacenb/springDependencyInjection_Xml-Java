package com.chace.springInjectionXmlConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Xxml {
    @Autowired
    Yxml yxml;

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
