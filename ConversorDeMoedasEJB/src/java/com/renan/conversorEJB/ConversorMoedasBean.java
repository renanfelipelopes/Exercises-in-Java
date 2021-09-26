package com.renan.conversorEJB;

import javax.ejb.Stateless;

@Stateless
public class ConversorMoedasBean implements conversorRemote {

    @Override
    public double realParaDolar(double real) {
        return real / 2.29;
    }

    @Override
    public double realParaEuro(double real) {
        return real / 3.03;
    }

    @Override
    public double dolarParaReal(double dolar) {
        return dolar * 2.29; 
    }

    @Override
    public double dolarParaEuro(double dolar) {
        return dolar / 1.33;
    }

    @Override
    public double euroParaReal(double euro) {
        return euro * 3.03;
    }

    @Override
    public double euroParaDolar(double euro) {
        return euro * 1.33;
    }
    
}
