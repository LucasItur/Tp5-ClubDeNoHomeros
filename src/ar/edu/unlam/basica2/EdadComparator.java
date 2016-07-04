package ar.edu.unlam.basica2;

import java.util.Comparator;

class EdadComparator implements Comparator<Cliente> {
	
	public int compare(Cliente c1, Cliente c2) {
		return c1.getEdad() - c2.getEdad();
	 }

}
