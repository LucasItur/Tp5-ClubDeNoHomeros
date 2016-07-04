package ar.edu.unlam.basica2;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestBar {
	
	@Test
	public void testDeBarVacio() {
		Bar ElClubDeLosNoHomeros = new Bar();
		
		assertTrue(ElClubDeLosNoHomeros.clientes.isEmpty());
	}
	
	@Test
	public void testQueEntranClientes() {
		Bar ElClubDeLosNoHomeros = new Bar();
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",18));
		
		assertTrue(!ElClubDeLosNoHomeros.clientes.isEmpty());
	}
	
	@Test
	public void testQueNoEntranClientesRepetidos() {
		Bar ElClubDeLosNoHomeros = new Bar();
		
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",18));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",24));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Carlos",54));
		
		assertTrue(ElClubDeLosNoHomeros.clientes.size()==2);
	}
	
	@Test
	public void testQueLosClientesEstanOrdenadosAlfabeticamente(){
		Bar ElClubDeLosNoHomeros = new Bar();
		
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",18));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",24));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Carlos",54));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Ana",29));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Valeria",32));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Laura",22));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Andy",27));
		
		//ElClubDeLosNoHomeros.presentaClientes();  //El bar presetan clientes alfabeticamente
		
		assertEquals("Ana", ElClubDeLosNoHomeros.clientes.first().getNombre());
		assertEquals("Valeria",ElClubDeLosNoHomeros.clientes.last().getNombre());
	}
	
	@Test
	public void testQueHomeroOrdenaPorEdad(){
		Bar ElClubDeLosNoHomeros = new Bar();
		
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Juan",18));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Carlos",54));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Ana",29));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Valeria",32));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Laura",22));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Andy",27));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Victor",38));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Jose",24));
		ElClubDeLosNoHomeros.Homero.aceptaCliente(new Cliente("Leo",22));
		
		ElClubDeLosNoHomeros.Homero.presentaClientesPorEdad();
		
		assertTrue(18== ElClubDeLosNoHomeros.Homero.listaPorEdad.get(0).getEdad());
		assertTrue(54== ElClubDeLosNoHomeros.Homero.listaPorEdad.get(ElClubDeLosNoHomeros.Homero.listaPorEdad.size()-1).getEdad());
	
	}
	
}
