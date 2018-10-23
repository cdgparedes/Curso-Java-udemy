package arreglosBidimencionales;
 //Sintaxis  tipo[][]nombreArreglo= new tipo[renglon][columna]

public class EjemploArreglosBidimencionales {
	int [][] matrizDeEnteros = new int [3][4];
	//Esta asignacion es valida;
	//int [][] matrizDeEnteros={{1,3,5,7},{5,4,1,16},{7,9,61,13}};
	
	// La sintaxis para asignar valores  nombreArreglo[reglon][columna]= valor;
    
	public static void main(String arg[]){
		EjemploArreglosBidimencionales objeto = new EjemploArreglosBidimencionales();
		objeto.asignaValores();
		objeto.leerArregloBidimencional();
	}
	public void asignaValores(){
	  //primer fila  
		matrizDeEnteros[0][0] = 1;
		matrizDeEnteros[0][1] = 3;
		matrizDeEnteros[0][2] = 5;
	    matrizDeEnteros[0][3] = 7;
	  
	  //Segunda fila
	    matrizDeEnteros[1][0] = 5;
	    matrizDeEnteros[1][1] = 4;
	    matrizDeEnteros[1][2] = 1;
	    matrizDeEnteros[1][3] = 16;
	  //tererafila 
	    matrizDeEnteros[2][0] = 7;
	    matrizDeEnteros[2][1] = 9;
	    matrizDeEnteros[2][2] = 61;
	    matrizDeEnteros[2][3] = 13;
	    
	  
	}
	
	
	//leer informacion arreglo 
	public void leerArregloBidimencional(){
	 for (int[] renglon:matrizDeEnteros){
		 for(int columna:renglon){
			 System.out.print(columna + "");//no colocamos ln para evitar el salto de linea 
		 }
		 System.out.print("\n");//aqui hacemos el salto de linea 
	 }
	}
}
