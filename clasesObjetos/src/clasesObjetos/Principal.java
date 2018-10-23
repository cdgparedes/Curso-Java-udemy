package clasesObjetos;

public class Principal {
	public static void main(String args[]){
		Persona p1 = new Persona ("juan","Perez",22,"Masculino");
		Persona p2 = new Persona ("Cesar","Grajales",30,"Masculino");
		
		p1= p2;
		p1.asignaNombre("Ricardo");
		System.out.println(p1.regresaNombre());
		System.out.println(p1.regresaEdad());
		System.out.println(p1.regresoGenero());
		System.out.println(p1.regresaApellido());
		
		System.out.println(p2.regresaNombre());
		System.out.println(p2.regresaEdad());
		System.out.println(p2.regresoGenero());
		System.out.println(p2.regresaApellido());
		
		
  }

}