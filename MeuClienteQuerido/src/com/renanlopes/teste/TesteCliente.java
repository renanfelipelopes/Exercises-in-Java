package com.renanlopes.teste;

import org.junit.Test;
import com.renanlopes.cliente.*;

public class TesteCliente {
	
	@Test
	public void Test(){
		Cliente cliente = new Cliente(6065, "8569-0", "000.111.222-33", 2200.0);
				
		cliente.sacarContaCorrente(1000);
				
		
	}

}
