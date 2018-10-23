
public class UsoAndOrNot {
	public static void main(String args[]) {
		String sexo = "hombre";
		int edad = 18;
		/*
		// Uso de operador and &&
		if (sexo.equalsIgnoreCase("Hombre") && edad == 18 ){
			System.out.println("la persona es un hmbre y tiene 18 años  ");
		} else {
			System.out.println("la persona es una mujer  ");
		}
      */
		/*
		// Uso de operador and  || OR
				if (sexo.equalsIgnoreCase("mujer ")|| edad == 20 ){
					System.out.println("la persona es un hmbre y tiene 18 años  ");
				} else {
					System.out.println("la persona es una mujer  ");
				}
				
			*/	
	  // uso del operador necacion !
				
				if ( ! sexo.equals("hombre")){
					System.out.println("\n (!) El personaje es un Hombre");
				}
		
	}
}
