package com.chace.springInjection_JavaConfig.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Xjava {
    private Yjava yjava;

    @Autowired
    public Xjava(Yjava yjava) {this.yjava = yjava;}

    public void makeYjavaTalk(String msg){
        yjava.talkFromOutside(this.getClass(), msg);
    }

    public Yjava getY() {
        return yjava;
    }

    public void setY(Yjava yjava) {
        this.yjava = yjava;
    }
}
