package ejercicioThrows;

public class Principal {
  public static void main(String  args[]){
	 try{// aqui hacemos control de la excepcion que nos envion el metoso dividir 
	  int resultado = division(6,0);
	  System.out.println("Reaultado = " + resultado );
	  }catch(miExcepcionPropia me){// tambien hacemos el catch
		  System.out.println("se ha producido un error ");
		  me.printStackTrace();
	  }
    }
  
  
   static int division ( int numerador, int denominador ) throws miExcepcionPropia {
	 
	  if (denominador == 0){
		  throw new miExcepcionPropia("Estas dividiendo un numero por cero y no es valido ");
	  }
	 int resultado =  numerador/denominador ;
	 return  resultado;
   }
   
}

  
   class miExcepcionPropia extends Exception {
	   public miExcepcionPropia(String miMensaje);
	   super(miMensaje );// llamamos alconstructor padre
   }