package com.renan.conversorEJB;

import javax.ejb.Remote;

@Remote
public interface conversorRemote {
    
    public double realParaDolar(double real);
    public double realParaEuro(double real);
    public double dolarParaReal(double dolar);
    public double dolarParaEuro(double dolar);
    public double euroParaReal(double euro);
    public double euroParaDolar(double euro);
    
    
}
