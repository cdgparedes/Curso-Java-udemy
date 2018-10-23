package proyectoMath;

public class EjerciciosMath {
  public static void main(String args[]){
   EjerciciosMath objeto = new EjerciciosMath();
  // objeto.numerosAleatorios();
   //objeto. maximoMinimo();
  // objeto.mayorMenorparametro();
   //objeto.redondeo();
   objeto.potencia();
  }
	 
    public void potencia(){
    	double a = 2.0;
    	double b= 5.0;
    	System.out.println("El resultado de elevar " + a +" a " + b +" es "+ Math.pow(a, b));
    }
    public void redondeo(){
      double a= 5.8;
      double b = 5.3;
      System.out.println("El redondeo del numero a es " + Math.round(a));
      System.out.println("El redondeo del numero b es " + Math.round(b));
    }
    public void mayorMenorparametro(){
    	double numero = 5.1 ;
    	System.out.println("El entero mayor del  numero es : " + Math.ceil(numero) +"\n");
    	System.out.println("El entero menor  del  numero es : " + Math.floor(numero) +"\n");
    }
  
    public void  maximoMinimo(){
    	int numero = 1000;
    	int numero2=999;
    	System.out.println("\nEl mayor entre numero y numero dos  es : "+ Math.max(numero, numero2));
    	System.out.println("\nElmenor  entre numero y numero dos  es : "+ Math.min(numero, numero2));
    	
    }
  
	 public void numerosAleatorios(){
		 for(int i=0;i<10;i++){
			 int aleatorio=(int)((Math.random()*10)+1);
			// System.out.println(aleatorio);
			 
		 
	 }
  }
}
