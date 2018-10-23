package encapsulamiento;

public class Principal {
 public static void main (String args[]) {
  	 Profesor objetoProfesor = new Profesor();
  	 objetoProfesor.setNombre("Cesar Dubiel");
  	 objetoProfesor.setIdentificacion("112");
     objetoProfesor.setSueldo(4000);
  	 System.out.println("Nombre:" + objetoProfesor.getNombre());
  	 System.out.println("Sueldo:" + objetoProfesor.getSueldo());
  	 System.out.println("Identificacion:" + objetoProfesor.getIdentificacion());
  	 
 }
}
