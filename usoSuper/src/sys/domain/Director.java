package sys.domain;

public class Director extends Persona  {
	private  String claveSector;  



  public String getClaveSector() {
		return claveSector;
	}
  public void setClaveSector(String claveSector) {
		this.claveSector = claveSector;
	}

  
  public  Director (String claveSector, String nombre){
	  super(nombre);
	  this.claveSector = claveSector;
	
  }
  
  public  Director (String claveSector,int edad, String nombre){
	  super(edad,nombre);
	  this.claveSector = claveSector;
	
  }
  
  
  public  Director (String claveSector,String nombre, int edad, String sexo){
	super(edad, nombre,sexo);
	this.claveSector = claveSector ; 
	/*this.setEdad(edad);
	this.setNombre(nombre);
	this.setSexo(sexo);
	 */	
  }
  
  public void muestrInfoDirector(){
		System.out.println();
		System.out.println("INFOFRMACIÓN DEL DIRECTOR ");
		System.out.println("Escuela a la que pertenece "+Persona.getNombreEscuela());
		System.out.println("Clave sector  " + this.claveSector);
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
		System.out.println();
		
	}
	
}