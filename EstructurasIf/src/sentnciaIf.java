
public class sentnciaIf {
	public static void main(String args[]) {
		int edad = 15;
		/*if (edad >= 18) {
			System.out.println("Eres una persona mayor de edad ");
			System.out.println("\nPor lo tanto ahora puedes votar ");
		} else {
			System.out.println("No eres una persona mayor de edad ");
		}*/
		String resultado = (edad >= 18)? "Eres Mayor de edad " : "Eres menor de edad";
	    System.out.println(resultado + "  porque tienes " + edad );
	
		
	}
}
