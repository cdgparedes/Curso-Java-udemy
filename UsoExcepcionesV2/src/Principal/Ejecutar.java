package Principal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutar {

static int miArreglo[] = new int[3];
  
public static void main(String args[]){
  llenarArreglo();
  sumaArreglo();
}

public static void llenarArreglo(){
	Scanner entrada  = new Scanner(System.in);
	try{
		int numero ;
		for(int i = 0; i<=3; i++){
			System.out.println("Introduce un número para la posición -->  " + i);
			numero = entrada.nextInt();// Con nextInt() guardamos un dato numerico
			miArreglo[i]=numero;
		}
	}catch(ArrayIndexOutOfBoundsException aio){
		System.out.println("Estas  fuera de los índices del arreglo " );
		
	  }catch(InputMismatchException ime){
			System.out.println("Estas ingresando un dato que no es un número " );
			
	   }finally{
		   System.out.println("Esto siempre se ejecuta y aqui podemos  cerrra conexiones de bases de datos ");
	   }
}
	

public static  void sumaArreglo(){
	  int suma =0 ;
	  for(int i = 0; i<=2; i++){
		suma = suma + miArreglo[i];  
	  }
	  System.out.println("La suma de los números  es " + suma );
 }

}
