package usoDateTime;

import java.time.LocalDate;
import java.time.Month;

public class comparaDateTime {
  // Regresa true si la fecha o tiempo esta antes de laotra fevha
	// de lo contrario regresa falso 
 public void isBefore(){
	LocalDate fecha1 =  LocalDate.now();
	LocalDate fecha2 =  LocalDate.of(2019,Month.OCTOBER,31);
	
	if (fecha1.isBefore(fecha2)){
		System.out.println("El dia "+ fecha1 +"Si esta ANTES DE " + fecha2) ;
	}
	else{
		System.out.println("El dia " + fecha1 + "No está antes de  " + fecha2);
	}
 }
 
 
 
 //Regresa true si la fecha o tiempo está despues de la echa espesificada  
 // de  lo ccontrario regresa Fall
 public void isAfter(){
	LocalDate fecha1 =  LocalDate.now();
	LocalDate fecha2 =  LocalDate.of(2010,Month.OCTOBER,31);
	
	if (fecha1.isAfter(fecha2)){
		System.out.println("El dia "+ fecha1 +"Si esta despues  " + fecha2) ;
	}
	else{
		System.out.println("El dia " + fecha1 + "  No está despues de  " + fecha2);
	}
 }
 
 public void compareTo(){
	 LocalDate fecha1 =  LocalDate.now();
	 LocalDate fecha2 =  LocalDate.of(2015,Month.OCTOBER,31);
	 if(fecha1.compareTo(fecha2)< 0){
	   System.out.println("la fecha " + fecha1 + "Está antes de la fecha " +  fecha2);
		
	 }
	 if(fecha1.compareTo(fecha2)> 0){
		   System.out.println("la fecha " + fecha1 + "Está despues de la fecha " +  fecha2);
			
		 }
 }
}
 