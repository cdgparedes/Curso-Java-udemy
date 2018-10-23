package sobrecargaMetodos;



public class Alumno {
	private double calificacion;
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
	
	
	
	
	// sobre carga de metodos 
	
	public void setDatosAlumnos(String nomb){
     nombre = nomb;		
	}
	
	public void setDatosAlumnos(double  cal){
	     calificacion = cal;		
		}
	
	public void setDatosAlumnos(String nomb, int ed){
	     nombre = nomb;
	     edad = ed;
		}
	public void setDatosAlumnos(String nomb, int ed,double cal){
	     nombre = nomb;
	     edad = ed;
	     calificacion = cal; 
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
