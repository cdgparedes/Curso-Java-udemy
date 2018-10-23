package Principal.arraylist;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import clases.*;
public class SetColletion {
   public static void ejemploSet(){
	   Agenda per1 = new Agenda("37","Juan","4921301445");
	   Agenda per2 = new Agenda("30","Cesar","3213440691");
	   Agenda per3 = new Agenda("35","Carlos ","101010");
	   Agenda per4 = new Agenda("28","Chujfi","3135878755");
	   Agenda per5 = new Agenda("28","Chujfi","3135878755");
	   
	   Set<Agenda> agendaClientes = new HashSet<Agenda>();
	   //hashcode , equals
	    
	   if (per4.equals(per5)){
		   System.out.println("Los objetos son iguales");
		   System.out.println(per4.hashCode());
		   System.out.println(per4.hashCode());
	   }else{
		   System.out.println("Los objetos no son iguales");
		   System.out.println(per4.hashCode());
		   System.out.println(per4.hashCode());
	   }
	   agendaClientes.add(per1);
	   agendaClientes.add(per2);
	   agendaClientes.add(per3);
	   agendaClientes.add(per4);
	   agendaClientes.add(per5);
	 
	   System.out.println("\nLa agenda contiene el objeto 5  " + agendaClientes.contains(per5)+ "\n");
	   System.out.println("\nEl objeto tipo agenda está vacio  " + agendaClientes.isEmpty() + "\n"); 
	   agendaClientes.remove(per1);//brarrar un elemento 
	   System.out.println("Eltamaño de el set es  "+ agendaClientes.size());//mirar el tamaño de un set()
	   imprimirSet(agendaClientes);
   }
   
  static void imprimirSet(Collection<Agenda> col){
	 for(Agenda agenda : col){
		System.out.println(agenda.getNombre() + "" + agenda.getTelefono()+ ""+agenda.getEdad());
		
	 }
  }
   
}
