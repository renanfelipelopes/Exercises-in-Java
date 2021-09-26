package com.renan.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloWordBean implements HelloWordRemote{
    
    public String ola(){
        return "Olá mundo do Enterprise JavaBean ";
    }    
}
