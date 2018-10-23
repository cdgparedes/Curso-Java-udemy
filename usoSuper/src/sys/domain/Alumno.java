package sys.domain;

public class Alumno extends Persona {//Extends con esto hacemos  herencia 
	private int numeroAlumno;
     
	public Alumno(int numeroAlumno, String nombre){//Constructor vacio 
		super(nombre);
		this.numeroAlumno = numeroAlumno;
	}
	
	public Alumno(int numeroAlumno, int edad,String nombre){//Constructor vacio 
		super(edad,nombre);
		this.numeroAlumno = numeroAlumno;
	}
	
	
	
	public Alumno(int numeroAlumno,String nombre, int edad,String sexo){//contructor con valores 
		
		super(edad,nombre,sexo);
		this.setNumeroAlumno(numeroAlumno);
		// las siguinetes tres lineas las comentamos porque para ello vamos a inicializar con constructor padre
		/*this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);*/
		
	}
	
	
	public void muestrInfoAlummno(){
		System.out.println();
		System.out.println("INFOFRMACIÓN DEL ALUMNO");
		System.out.println("Escuela a la que pertenece "+Persona.getNombreEscuela());
		System.out.println("Número de alumno " + this.getNumeroAlumno());
		System.out.println("Nombre " + this.getNombre());
		System.out.println("Edad " + this.getEdad());
		System.out.println("Sexo " + this.getSexo());
		System.out.println();
		
	}
	
	
	public int getNumeroAlumno() {
		return numeroAlumno;
	}

	public void setNumeroAlumno(int numeroAlumno) {
		this.numeroAlumno = numeroAlumno;
	}

}
