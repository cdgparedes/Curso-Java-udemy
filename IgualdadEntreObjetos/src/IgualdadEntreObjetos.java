
public class IgualdadEntreObjetos {
	public static void main(String args[]){
		String cad1 = "abcd";
		String cad2 = "abcd";
		String cad3 =  new  String ("abcd");
		
		//Comparando la refencia 
		if (cad1 == cad2){
			System.out.println("\r Comparando  referenciascad1 = a cad2 ");
			
		}
		if (cad1 == cad3){
			System.out.println("\r Comparando  referencias cad1 = a cad3 ");
			
		}
		
		//Comparando EL VALOR CON EL METODO EQUALS 
		if (cad1.equals(cad2)){
			System.out.println("\r Comparando  valor de cad1 con  cad2  tienen el mismo valor ");
			
		}
		if (cad1.equals(cad3)){
			System.out.println("\r Comparando  valor de  cad1 con cad3 tienen el mismo valor ");
			
		}
		
	}

}
