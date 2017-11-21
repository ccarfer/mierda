package auxiliar;

import java.util.Random;

import Modelo.Datos;
import Modelo.Estudiante;

public class Practicas {
	// private static String[] diasSemana = { "lunes", "martes", "miercoles",
	// "jueves", "viernes", "sábado", "domingo" };

	public void muestraNumeros() {

		int x = 0;
		while (x <= 1000) {
			System.out.println("x: " + x);
			x++;
		}
	}

	public void muestraNumeros(int min, int max) {

		if (min <= max) {
			int x = min;
			while (x <= max) {
				System.out.println("x: " + x);
				x++;
			}
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void muestraNumeros2(int min, int max) {

		if (min <= max) {
			int x = min;
			do {
				System.out.println("x: " + x);
				x++;
			} while (x <= max);
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void muestraNumeros3(int min, int max) {
		int x = min;
		if (min <= max) {
			// for (int x = min; x < max; x++) {
			// for (;;) {
			while (true) {
				System.out.println("x: " + x);
				x++;
			}
		} else
			System.out.println("Error, min debe ser menor que maximo");
	}

	public void generaAleatorios(int cuantos, int inferior, int superior) // max
																			// 30,
																			// min
																			// 10
	{

		for (int i = 0; i < cuantos; i++)
			System.out.println(inferior + (int) (Math.random() * (superior - inferior + 1)));
	}

	public void generaAleatorios2(int cuantos, int inferior, int superior) // max
																			// 30,
																			// min
																			// 10
	{

		Random rnd = new Random();
		for (int i = 0; i < cuantos; i++)
			System.out.println(inferior + rnd.nextInt(superior - inferior + 1));
	}

	public int[] generaAleatorios3(int cuantos, int inferior, int superior) // max
																			// 30,
																			// min
																			// 10
	{
		int[] resultado = new int[cuantos];
		Random rnd = new Random();
		for (int i = 0; i < cuantos; i++)
			// System.out.println(inferior + rnd.nextInt(superior - inferior +
			// 1));
			resultado[i] = inferior + rnd.nextInt(superior - inferior + 1);
		return resultado;
	}

	public int[] frecuenciaAparicion(int cuantos, int inferior, int superior) {
		int[] resultado = new int[superior - inferior + 1];
		int[] lanzamientos = this.generaAleatorios3(cuantos, inferior, superior);
		for (int i = 0; i < lanzamientos.length; i++) {
			resultado[lanzamientos[i] - 1]++;
		}
		return resultado;

	}

	public void estadisticaCadena(String cadena) {
		int contadorVocales = 0;
		int contadorMayusculas = 0;
		int contadorEspeciales = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
					|| cadena.charAt(i) == 'u' || cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E'
					|| cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U')
				contadorVocales++;
			if (cadena.charAt(i) >= 'A' && cadena.charAt(i) <= 'Z')
				contadorMayusculas++;
			int caracterAscii = cadena.charAt(i);
			if ((caracterAscii >= 0 && caracterAscii <= 47) || (caracterAscii >= 58 && caracterAscii <= 64) ||

					(caracterAscii >= 91) && (caracterAscii <= 96))

				contadorEspeciales++;
		}
		// System.out.println("Hay " + contadorVocales + " vocales en " +
		// cadena);
		System.out.println("Hay " + contadorEspeciales + " caracteres especiales en " + cadena);

	}

	public void listaDiasSemana() {
		Datos datos = new Datos();
		// String[] diasSemana = { "lunes", "martes", "miercoles", "jueves",
		// "viernes",
		// "sábado", "domingo" };
		// for (int i = 0; i < datos.getDiasSemana().length; i++)
		for (String dia : datos.getDiasSemana())
			// System.out.println(datos.getDiasSemana()[i]);
			System.out.println(dia);
	}

	public void listaEstudiantes(Estudiante[] lista) {
		for (Estudiante estudiante : lista) {

			if (estudiante != null) {
				System.out.println(estudiante.getNombre());
			}

		}

	}

	public void listaEstudiantes2(Estudiante[][] lista) {

		for (int i = 0; i < lista.length; i++) {

			for (int j = 0; j < lista.length; j++) {
			}
		}

	}

	public int visitiantesIslaYear(int isla, int[][] visitanteYear) {
		int acu = 0;
		for (int j = 0; j < visitanteYear[isla].length; j++) {
			acu = visitanteYear[isla][j];
		}
		return acu;
	}

	public int visitiantesIslaYearColumna(int meses, int[][] visitanteYear) {
		int acu = 0;
		for (int i = 0; i < visitanteYear.length; i++) {
			acu = visitanteYear[i][meses];
		}
		return acu;
	}

	public int[] ordenarArray(int[] numeros) {
		try {
			int nuevoArray;
			for (int i = 0; i < numeros.length - 1; i++) {
				for (int j = i + 1; j < numeros.length; j++) {
					if (numeros[j] < numeros[i]) {
						nuevoArray = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = nuevoArray;
						System.out.println(numeros[j]);
					}
				}
			}
		} catch (Exception e) {
		}
		return numeros;
	}

	public void ordenarCandenas(String[] cadenas) {
		try {
			for (int i = 0; i < cadenas.length - 1; i++) {
				for (int j = i + 1; j < cadenas.length; j++) {
					if (cadenas[i].compareTo(cadenas[j]) > 0) {
						String nuevoArray = cadenas[i];
						cadenas[i] = cadenas[j];
						cadenas[j] = nuevoArray;
						System.out.println(cadenas[j]);
					}
				}
			}
		} catch (Exception e) {
		}
	}
	public void ordenarEstudiantes (Estudiante[] estudiante){
		try {
			for (int i = 0; i < estudiante.length - 1; i++) {
				for (int j = i + 1; j < estudiante.length; j++) {
					if (estudiante[i].compareTo(estudiante[j]) > 0) {
						Estudiante nuevoArray = estudiante[i];
						estudiante[i] = estudiante[j];
						estudiante[j] = nuevoArray;
						System.out.println(estudiante[j]);
					}
				}
			}
		} catch (Exception e) {
		}
	}
}