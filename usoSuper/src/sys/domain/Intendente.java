package sys.domain;

public class Intendente extends  Persona  {
  private String areaLimpeza;

  public String getAreaLimpeza() {
	return areaLimpeza;
  }

  public void setAreaLimpeza(String areaLimpeza) {
	this.areaLimpeza = areaLimpeza;
  }
  
  public Intendente(String areaLimpieza,String nombre){
	 super(nombre);
	 this.areaLimpeza =areaLimpieza;
  }
  
  public Intendente(String areaLimpieza,String nombre, int edad){
	 super(edad,nombre);
	 this.areaLimpeza =areaLimpieza;
  }
  
  public Intendente (String arealimpieza,String nombre, int edad,String sexo){
	 super(edad,nombre,sexo);
	 this.setAreaLimpeza(arealimpieza);
	 /*this.setNombre(nombre);
	 this.setEdad(edad);
	 this.setSexo(sexo);*/
  }
  
  

  public void muestrInfoIntendente(){
		System.out.println();
		System.out.println("INFOFRMACIÓN DEL INTENDENTE  ");
		System.out.println("Escuela a la que pertenece "+Persona.getNombreEscuela());
		System.out.println("Clave sector  " + this.areaLimpeza);
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
		System.out.println();
		
	}
	
}
