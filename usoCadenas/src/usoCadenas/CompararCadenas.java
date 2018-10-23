package usoCadenas;

public class CompararCadenas {
	public void comparandoStrings(){
		String nombre = "";
		if(nombre.equals ("JUAN") ){
			System.out.println("Si correspondende al  Nombre  ");
			
		}else {
			System.out.println("\n El nombre no es igual\t Debes revisarlo");
		}
		
	    if (nombre.equals("")){
	    	System.out.println("\tojo:\nla cadena está vacia\n");
	    }
		
		if (nombre.isEmpty()){
			System.out.println("\rojo:\n Esta es otra forma de probar la cadena está vacia con isEmpty");
		}
		
		
		
		nombre = "Juan Manuel  Perez Arellano";
		if(nombre.startsWith("Juan")){
			System.out.println("\nEl nombre  dela persona comienza con la palabra Juan ");
			
		}
		if(nombre.endsWith("Arellano")){
			System.out.println("\nEl nombre  dela persona termina con la palabra Arellano ");
			
		}
		
		// Tamaño de una cadena 
		String miCadena = "Esta es mi primer cuso de java ";
		int lenght = miCadena.length();
		System.out.println("\n\rEl tamalño de la miCadena es : " + lenght);
		
		
		//posicion de una cadena dentro de otra 
		String cadenaBuscada = "mi";
		int indice = miCadena.indexOf(cadenaBuscada);
	    System.out.println("\nLa posición donde se encotró cadenaBuscada es :" + indice);
		
	
	     char caracter  = miCadena.charAt(2);
	     System.out.println("\nEl caracter de la posición 2 es :" + caracter);
			
        //limpiar espacios en cadenas 
	     
	     String cadenaConEspacios = " Esta es una cadena Con espacios ";
	     System.out.println(cadenaConEspacios.trim());
	    // Como extraer una subcadena de  una cadena 
	     
	     String numCta = "7987 6466 6566";
	     String cuatroUltimoCaracteres = numCta.substring(5, 9);
	     System.out.println("\n la subcadena es :" + cuatroUltimoCaracteres);
	
	}
	
}
