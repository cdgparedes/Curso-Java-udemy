package usoDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
 
public class DateTime {
 
	public static void main(String args[]){
		  /*
    DateTime objeto = new DateTime();
     objeto.usarNow();
    System.out.println("-------------");
    objeto.usarOf();
    System.out.println("-------------");
    objeto.usarParse();
    System.out.println("-------------");
    
    objeto.regresaPartesDateTime();
	
    comparaDateTime objeto = new comparaDateTime();
    //objeto.isBefore();
    objeto.compareTo();
    */
	ajustandoDateTime objeto =  new ajustandoDateTime(); 
	//objeto.ajustaDateTime();
	objeto.modificarTiempo();
 }
	public void regresaPartesDateTime(){
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println(" La fevha y hora actual es " +fechaHoraActual );
        System.out.println("El metodo getYear() regresa un entero(año actual) " + fechaHoraActual.getYear());
        System.out.println("El metodo getMonth() regresa un entero( mes actual) " + fechaHoraActual.getMonth());
        System.out.println("El metodo getDayOfMonth() regresa un entero(dia actual) " + fechaHoraActual.getDayOfMonth());
        System.out.println("El metodo getDayOfYear() regresa un entero(dia del año) " + fechaHoraActual.getDayOfYear());
        System.out.println("El metodo getDayOfWeekr() regresa un objeto(dia de la semana ) " + fechaHoraActual.getDayOfWeek());
        
        System.out.println("El metodo getHour() regresa un entero( hora del dia  en formato de 24 hrs ) " + fechaHoraActual.getHour());
        System.out.println("El metodo getMinute() regresa un entero( minuto actual ) " + fechaHoraActual.getMinute());
        System.out.println("El metodo getHour() regresa un entero( hora del dia  en formato de 24 hrs ) " + fechaHoraActual.getHour());
        System.out.println("El metodo getSecond() regresa un entero(segundo actual ): " + fechaHoraActual.getSecond());
        System.out.println("El metodo getNano() regresa un entero( Nano segundo actual ) " + fechaHoraActual.getNano());

           
	}
	
	public void usarParse(){
		LocalDate fecha = LocalDate.parse("2015-10-31");
		System.out.println("Haciendo uso de localdate LocalDate.parse : " + fecha);
	   LocalTime tiempo1 = LocalTime.parse("02:32:45");
	   System.out.println("Haciendo Uso de LocalTime.parse"+ tiempo1);
	   LocalDateTime fechaTiempo  = LocalDateTime.parse("2015-10-31T02:32:45.123456789"); 
	   System.out.println("Haciendo Uso de LocalDateTime.parse: "+ fechaTiempo );
	
	}
	
	public void usarOf(){
		LocalDate fecha1 = LocalDate.of(2018, Month.AUGUST, 30);
		System.out.println("Haciendo Uso de LocalDate.of :" + fecha1);
		
		LocalDate fecha2 = LocalDate.of(2015,10,31);
		System.out.println("Haciendo Uso de LocalDate.of :" + fecha1);
       
		LocalTime tiempo1 = LocalTime.of(14,32);
		System.out.println("Haciendo uso de LocalTime" + tiempo1);
		
		LocalTime tiempo2 = LocalTime.of(14,32,45);
		System.out.println("Haciendo uso de LocalTime" + tiempo2);
		
		LocalTime tiempo3 = LocalTime.of(14,32,45,123456789);
		System.out.println("Haciendo uso de LocalTime" + tiempo3);
		
		LocalDateTime fechaYHora = LocalDateTime.of(1981,10,16,14,32);
		System.out.println("Haciendo uso de LocalDateTime" + fechaYHora );
	}
	public void usarNow (){
	  LocalDate fechaActual	= LocalDate.now(); 
	  LocalTime tiempoActual = LocalTime.now(); 
	  LocalDateTime fechaYTiempoActual = LocalDateTime.now(); 
	  
	  System.out.println("Utilizando LocalDate: " + fechaActual);
	  System.out.println("Utilizando LocalTime: " + tiempoActual);
	  System.out.println("Utilizando LocalDateTime: " + fechaYTiempoActual);
	}
}
