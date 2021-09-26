package com.renan.services;

import javax.naming.InitialContext;

public class ServiceLocator {
    
    public static <T> T buscaEJB(final Class <T> clazz)
            throws Exception {
        InitialContext ctx = new InitialContext();
        return (T) ctx.lookup(clazz.getName());
    }
}
    

