package com.chace.springInjection_JavaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Xjava {
    Yjava yjava;

    @Autowired
    public Xjava(Yjava yjava) {
        this.yjava = yjava;
    }

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
