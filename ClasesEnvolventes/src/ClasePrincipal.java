
public class ClasePrincipal {
  public static  void main(String arg[]){
  ClasePrincipal objeto = new ClasePrincipal();
 //objeto.xxxvalue();
  //objeto.parseValueof();
  //objeto.metodoToString();
  objeto.metodoToString();
  }
  
  public void metodoToString(){
	  Double d = new Double("1234");
	  String dCadena = d.toString();
	  System.err.println(dCadena);
  }
   public void  parseValueof(){
   double d4 = Double.parseDouble("3.14");
   long primitivoLong = Long.parseLong("323");
   long objetoLong = 	Long.valueOf("456");
   System.err.println(primitivoLong + 1);
   System.err.println(objetoLong + 1);
   System.err.println(d4+1);
   
   }
   public void xxxvalue(){
	   Integer var = new Integer(42);
       byte b = var.byteValue(); 
       short s = var.shortValue();
       double d = var.doubleValue();
       System.out.println("El valor de  var =" + var);
       System.out.println("El valor de b =" + b);
       System.out.println("El valor de  s=" + s);
       System.out.println("El valor de  d =" + d);
   }
}

