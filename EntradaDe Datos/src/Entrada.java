//import com.sun.java_cup.internal.runtime.Scanner;
import java.util.Scanner;
public class Entrada {
public static void main(String args[]){
 Scanner entrada = new Scanner(System.in);
 
 String nombre;
 int edad;
 double sueldo;
 
 System.out.println("Como te llamas?");
 nombre = entrada.nextLine();
 
 System.out.println("\nCual es tu edad ?");
 edad = entrada.nextInt();
 
 System.out.println("\nCual es tu sueldo ?");
 sueldo = entrada.nextDouble();
 System.out.println("\n------------------------------");
 System.out.println("\nEl nombre de la persona es :" + "\t" + nombre );
 

 System.out.println("\n------------------------------");
 System.out.println("\nla edad  de la persona es :" + "\t" + edad );
 System.out.println("\nEl proximo a�o tu edad sera :"+(edad+1));
 
 System.out.println("\n------------------------------");
 System.out.println("\nEl sueldo   de la persona es :" + "\t" + sueldo );
 System.out.println("\nEl proximo a�o el sueldo sera   :" + "\t" + (sueldo*1.05));
 
}
}
