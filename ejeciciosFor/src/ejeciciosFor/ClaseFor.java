package ejeciciosFor;

public class ClaseFor {
	public static void main(String args[]) {
		ClaseFor objeto = new ClaseFor();
		// objeto.concatenarNumeros();
		objeto.imprimeTablas();

	}

	// Realiza LAS TABLAS DE MULTIPLICAR HASTA N NUMEROS

	public void imprimeTablas() {
		int cuantasTablas = 3;
		for (int k = 1; k <= 3; k++) {
			System.out.println("\n\tLA TABLA DEL  " + k);
			for (int l = 1; l <= 10; l++) {
				System.out.println("\n" + k + " * " + l + " = " + (k * l));
			}
		}
	}

	// 0.1.2.3.4
	public void concatenarNumeros() {
		String numeros = "";
		for (int i = 0; i < 5; i++) {
			numeros += i + ", ";

		}

		// System.out.println("El resultado de for " + numeros);

		// Imprimir una tabla de multiplicar
		int numeroDeTabla = 2;
		// System.out.println("Tabla del " + numeroDeTabla);

		for (int j = 1; j <= 10; j++) {
			// System.out.println("\n 2 * " + j + " = " + (2*j));
		}

	}

}
