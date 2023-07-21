package com.chace.springInjection_XmlConfig.getBeanFromExplicitDeclaration.beans;

//@Controller
public class Xxml {
//    @Autowired
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
