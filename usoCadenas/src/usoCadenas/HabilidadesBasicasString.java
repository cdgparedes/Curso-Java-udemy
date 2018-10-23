package usoCadenas;

public class HabilidadesBasicasString {
	public void mostrarCadenas(){
	  String mensaje1 = "Entrada de datos  o cadena  valida";
	  String mensaje2 ="";
	  String mensaje3=null;
	  mensaje1+="Esta es una concatenación";
	 
	  //Uniendo strings 
	   String nombre = "Cesar ";
	   String apellido = "perez";
	   String nombreCompleto= nombre+""+apellido;
	   //System.out.println(nombreCompleto);
	  
	  //Cconcatencaion de cadenas y numeros
	  double precio = 100.60;
	  String mensaje ="Precio: " + precio;
	  //System.out.println(mensaje);	
	  
	  /* Caracteeres especiales en Strings 
	  \n nueva linea 
	  \t tabulación
	  \r retorno de carro
	  \"" Dobles comillas 
	  \\backslash
	   */
	  String caracterEspecial;
	  caracterEspecial = "CODIGO: JSP\nPrecio : $50.00 ";
	  
	  caracterEspecial = "CODIGO:\tJSP\r\nPrecio:\t$50.000";
	  
	  caracterEspecial = "Precionala letra \"x\" para salir ";
	  caracterEspecial = "c:\\java\\ejercicios";
	  System.out.println(caracterEspecial);
	  
	   
	}
	

}
