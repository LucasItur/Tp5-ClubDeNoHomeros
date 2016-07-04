package ar.edu.unlam.basica2;

import java.util.Iterator;
import java.util.TreeSet;

public class Bar {

	
	public Propietario Homero = new Propietario();
	public static TreeSet<Cliente> clientes ;
	
	
	public Bar() {
		
		clientes = new TreeSet<Cliente>();
	}	
		
	
	public static void entraCliente(Cliente aceptado){
		clientes.add(aceptado);
		
	} //add cliente
	
	
	public void presentaClientes(){
		Iterator<Cliente> it=clientes.iterator();
		while (it.hasNext()){
			Cliente tmp = it.next();
			System.out.println(tmp.getNombre()+" "+tmp.getEdad());
		}
	} //out por pantalla
	
}

