
package arrayClass;
import java.util.Arrays;
import java.util.*;
public class HabilidadesConArreglos { 
  //int [] cantidades = new int[5] ;
	int [] cantidades = {5,4,3,2,1} ;
  public static void main(String arg[]){
	  
      

	  HabilidadesConArreglos objeto = new HabilidadesConArreglos();
	  //objeto.rellenarValores();
	 // objeto.leerArreglo();
	  
	  //System.out.println("------Arreglo Ordenado ----");
	  //objeto.ordenarValores();
	  //objeto.leerArreglo();
	  objeto.buscarValor();
  }
  
  // vamos a buscar valores en un arreglo ordenado .
  public void buscarValor(){
	 String[] nombresEmpleados ={"Pedro","Maria","Juan"};
	 Arrays.sort(nombresEmpleados);
	 int index = Arrays.binarySearch(nombresEmpleados,"Pedro");
	 System.out.println("La palabra Pedro la encontré en la posición  : "+index );
	

  
  }
  public void ordenarValores(){
	  Arrays.sort(cantidades);
  }
  
  public void rellenarValores(){
	  Arrays.fill(cantidades,100);
  }
 public void  leerArreglo(){
	 for(int valor:cantidades){
	 System.out.println("\n" + valor);	 
	 }
 }
}
