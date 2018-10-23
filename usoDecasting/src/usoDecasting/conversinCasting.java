package usoDecasting;

public class conversinCasting {
	public static void main(String args[]){
		/*int a = 1;
		double b  =2.5;
		b = a;
		
		System.out.println("El valor  de un double es :"+b);
		*/
		
		int a =1;
		double b=2.5;
		a = (int)b;
		System.out.println("El valor de un double es " +a);
		
		int codigo = 97;
		char codigoASCII = (char)codigo;
		System.out.println("El castind de Codigo en CodigoASCII ES : "+ codigoASCII );
	}

}
