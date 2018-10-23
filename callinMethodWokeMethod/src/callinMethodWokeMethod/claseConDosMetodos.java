package callinMethodWokeMethod;

public class claseConDosMetodos {
	//method callin 
	
	public void calcula (){
	 int x = 4 , y=5;	
	 int g = multiplicacion(x,y); 
	 
	 System.out .println(x + " * " + y + " es igual a " + g);
	}
	
	//Worked Method
    public int multiplicacion (int num1 , int num2 ){
    	return num1*num2;
    }
}
