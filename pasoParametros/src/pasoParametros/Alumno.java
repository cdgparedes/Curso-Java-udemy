package pasoParametros;

public class Alumno {
	private int calificacion;
	private String nombre ;
	private static double cuotaSemestral;
	private int edad;
	
	public Alumno(int cal, String nomb){
		calificacion = cal;
		nombre = nomb; 
	}
	
	
	public Alumno(){// Este es un constructor 
		
	}
    
	
	public Alumno(String nomb){
     nombre= nomb;
     
	}

	public void muestraInformacionAlumno(){
		System.out.print("Nombre :" + nombre);
		System.out.println("  calificación  :" + calificacion);
		System.out.println("\nEdad : " + edad);
		muestraCoutaSemestral();//Esto es el llamado de un estatico desde un dinamoco.
		//System.out.println(" La couta semestral es de :  "+ cuotaSemestral);
	}
	
	
	public static void  muestraCoutaSemestral(){
	 System.out.println("La Cuota semestral semestral es de  :  " +  cuotaSemestral);	
	}
	

}
