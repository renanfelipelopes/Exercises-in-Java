package com.renan.ejb;

import javax.ejb.Remote;

@Remote
public interface HelloWordRemote {
    public String ola(); 
}
