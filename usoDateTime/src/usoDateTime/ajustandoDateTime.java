package usoDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ajustandoDateTime {
  public void ajustaDateTime(){
	  LocalDate fecha1 = LocalDate.of(2017,10,16);
	  System.out.println("\nFecha aactual  " + fecha1);
	  fecha1 = fecha1.withDayOfMonth(31);
	  System.out.println("Fecha cambiando el dia : " + fecha1);
	  
	  fecha1 = fecha1.withDayOfMonth(31);
	  System.out.println("Fecha cambiando el dia : " + fecha1);

	  fecha1 = fecha1.withMonth(2);
	  System.out.println("Cambiando el mes : " + fecha1 );
	  
	  fecha1 = fecha1.withDayOfYear(365);
	  System.out.println("\rCambiando el dia del año  : " + fecha1 );
	  
	  
	  LocalTime horaActual =  LocalTime.now();
	  System.out.println("\nLa hora actual es :  "+ horaActual);
	  
	  horaActual = horaActual.withHour(12);
	  System.out.println("\nLa hora modificada es  es :  "+ horaActual);
	  
	  horaActual =  horaActual.withMinute(15);
	  System.out.println("\nLa hora modificada su minuto es  :  "+ horaActual);
	  
	 
  }
  
  //Hay otras formas mas cencillas de modificar el tiempo .
  public  void modificarTiempo(){
   LocalDateTime fechaActual = 	LocalDateTime.now();
   System.out.println("\nLa Fecha y hora actual " + fechaActual);
   
  fechaActual = fechaActual.plus(3,ChronoUnit.WEEKS);
   System.out.println("\nLa Fecha MODIFICADA SUMANDOLE TRES SEMANAS " + fechaActual);
  
   fechaActual = fechaActual.minus(3,ChronoUnit.WEEKS);
   System.out.println("\nLa Fecha MODIFICADA RESTANDOLE TRES SEMANAS " + fechaActual);
   
    locaDateTime fechaNueva = LocalDateTime.now();
    System.out.println("La fecha Actual es : " + fechaNueva );
    
    fechaNueva = fechaNueva.minus(15);
    System.out.println("La fecha modificada mas 15 dias es : " + fechaNueva);
  
  }
}
