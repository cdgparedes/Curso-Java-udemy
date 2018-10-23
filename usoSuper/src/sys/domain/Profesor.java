package sys.domain;

public class Profesor extends Persona{

	private  String especialidad;
	private  String cedulaProfesional;
	
	
	public Profesor(String especialidad,String cedulaProfecional,String nombre){
		super(nombre);
		this.especialidad = especialidad;
		this.cedulaProfesional = cedulaProfesional;
	
	}
	
	public Profesor(String especialidad,String cedulaProfecional,int edad,String nombre){
		super(edad,nombre);
		this.especialidad = especialidad;
		this.cedulaProfesional = cedulaProfesional;
	
	}
	
	
	
	
	public Profesor(String cedulaProfesional,String especialidad,String nombre,int edad,String sexo ){
	super(edad,nombre,sexo);
	this.setCedulaProfesional(cedulaProfesional);
	this.setEspecialidad(especialidad);	
	/*this.setNombre(nombre);
	this.setEdad(edad);
	this.setSexo(sexo);*/
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedulaProfesional() {
		return cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	
	
	
	

	  public void muestrInfoProfesor(){
			System.out.println();
			System.out.println("INFOFRMACIÓN DEL PROFESOR  ");
			System.out.println("Escuela a la que pertenece "+Persona.getNombreEscuela());
			System.out.println("ESPECIALIDAD " + this.especialidad);
			System.out.println("CEDULA PROFESIONAL " + this.cedulaProfesional);
			System.out.println("Nombre " + this.getNombre());
			System.out.println("Edad " + this.getEdad());
			System.out.println("Sexo " + this.getSexo());
			System.out.println();
			
		}
		
}
