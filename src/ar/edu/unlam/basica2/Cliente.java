package ar.edu.unlam.basica2;

public class Cliente implements Comparable<Cliente> {

	private String nombre;
	private Integer edad;
	
	
	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public Cliente() {
		
	}
	
	public Cliente(String nombre, Integer edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	public Cliente(Integer edad, String nombre) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	@Override
	public boolean equals(Object clienteAComparar){
		if(clienteAComparar == null){
			return false;
		}
		if(this.nombre.equals(((Cliente)clienteAComparar).getNombre()))
			{
			return true;
			}else{
			return false;
			}
	}
	
	

   @Override
    public int compareTo(Cliente clienteAComparar){
    	return (this.getNombre().compareTo(clienteAComparar.getNombre()));
    }
   
   	
 	
}
