package ambitoVariables;

public class Principal {
 public static void main (String args[]){
	miClase objetoMiClase = new  miClase();
	miClase objetoMiClase2 = new  miClase();
	objetoMiClase.setEdad(10);
	objetoMiClase2.setEdad(30);
	System.out.println("La edad es :" + objetoMiClase.getEdad());
     
	System.out.println(objetoMiClase.mayorDeEdad(objetoMiClase.getEdad()));
     
	System.out.println("La edad es :" + objetoMiClase2.getEdad());
    
	System.out.println(objetoMiClase2.mayorDeEdad(objetoMiClase2.getEdad()));
     
	
 }
}
