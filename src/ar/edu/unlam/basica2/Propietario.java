package ar.edu.unlam.basica2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Propietario  {
	
	public static ArrayList<Cliente> listaPorEdad ;
	
	public Propietario() {
		listaPorEdad = new ArrayList<>();
	}

	
	public void aceptaCliente(Cliente clienteEnPuerta){
		
		if(!Bar.clientes.contains(clienteEnPuerta)) 
			Bar.entraCliente(clienteEnPuerta);
		
	}//comparacion fuera del bar.
	
	
	public void presentaClientesPorEdad(){
		listaPorEdad.clear();
		listaPorEdad.addAll(Bar.clientes);
			
		Collections.sort(listaPorEdad,new EdadComparator());
		
		Iterator<Cliente> it2=listaPorEdad.iterator();
		while (it2.hasNext()){
			Cliente tmp = it2.next();
			System.out.println(tmp.getNombre()+" "+tmp.getEdad());
		}
	}//reordenamiento a travez de colecciones
	
}
