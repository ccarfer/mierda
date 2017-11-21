package Principal;

import java.time.LocalDate;
import java.util.Random;

import auxiliar.Practicas;
import Modelo.Datos;
import Modelo.Estudiante;
import Modelo.Persona;
import Modelo.Profesor;

public class Principal {
	// metodo por el que debe empezar la ejecución ..
	public static void main(String[] args) {
		/*
		 * Persona persona; persona = new Persona();
		 * 
		 * persona.setNombre("Manolo"); System.out.println("nif : " +
		 * persona.getNif()); System.out.println("nombre : " +
		 * persona.getNombre()); System.out.println("altura : " +
		 * persona.getAltura()); System.out.println("persona1 creada");
		 */
		/*
		 * Persona padre = new Persona(); padre.setNombre("JorgePadre");
		 * padre.setSexo('M'); Persona madre = new Persona();
		 * madre.setNombre("MariaMadre"); madre.setNif("44567981H");
		 * madre.setSexo('F');
		 */

		/*
		 * Persona persona2 = new Persona("43897124R", "PEPE", 'F',
		 * LocalDate.of(1999, 9, 21), 170, padre, madre); System.out.println(
		 * "persona2 creada"); System.out.println("Nombre madre : " +
		 * persona2.getMadre().getNombre());
		 */
		// crear un Estudiante

		/*
		 * Estudiante estAnonimo = new Estudiante(123);
		 * System.out.println(estAnonimo.toString()); Estudiante estudiante =
		 * new Estudiante(111, "44556677G", "Carlos", 'M', LocalDate.now(), 187,
		 * estAnonimo, null);
		 * 
		 * System.out.println(estudiante.toString());
		 * 
		 * Profesor profe1 = new Profesor(); System.out.println(profe1);
		 * 
		 * Practicas practicas = new Practicas();
		 */
		// new Practicas().muestraNumerosDe1A1000();
		// practicas.muestraNumerosDe1A1000();
		// practicas.muestraNumeros3(20, 25);
		// practicas.generaAleatorios2(3,10,11);
		// practicas.estadisticaCadena("Las&%=\" PalmAs\\ de Gran CanarIa");
		// int [] numeros=practicas.generaAleatorios3(100, 1, 6);
		// int[] frecuencia = practicas.frecuenciaAparicion(100, 1, 8);
		// practicas.listaDiasSemana();
		// Estudiante[] lista = new Datos().getEstudiantes();
		// practicas.listaEstudiantes(lista);
		/*
		 * Random rmd = new Random();
		 * 
		 * int[][] visitanteYear = { { 251, 2365, 489, 567, 781, 4568, 879,
		 * 4568, 1235, 4668, 158, 9856 }, { 965, 65, 589, 867, 96, 456, 87, 695,
		 * 145, 354, 58, 125 }, { 69, 24, 489, 567, 781, 4568, 879, 4568, 1235,
		 * 58, 158, 4668 }, { 251, 2365, 781, 567, 781, 4568, 879, 4568, 58,
		 * 4668, 158, 9856 }, { 4668, 781, 489, 589, 781, 781, 4668, 58, 781,
		 * 4668, 158, 9856 }, { 251, 2365, 58, 4668, 4568, 781, 879, 4568, 1235,
		 * 4668, 158, 781 }, { 58, 2365, 489, 567, 781, 4568, 879, 589, 1235,
		 * 781, 158, 9856 }, };
		 * 
		 * String [] islas = {"GC","TEN","LAN","FUR","HIE","LAPAL","GOM"};
		 * String [] meses = {"ENE", "FEBR", ""};
		 * 
		 * //practicas.visitiantesIslaYear(6, visitanteYear);
		 * practicas.visitiantesIslaYearColumna(11, visitanteYear);
		 * System.out.println("La suma de los visitantes es = " +
		 * practicas.visitiantesIslaYear(6, visitanteYear) +
		 * practicas.visitiantesIslaYearColumna(11, visitanteYear));
		 */
		/*
		 * int[] numeros = { 28, 8, 17, 24, 14, 6, 35 };
		 * 
		 * practicas.ordenarArray(numeros);
		 * 
		 * String[] cadenas = { "perro", "gato", "alce", "leon" };
		 * practicas.ordenarCandenas(cadenas);
		 */
		Practicas practicas = new Practicas();
		Estudiante estAnonimo = new Estudiante(123);
		System.out.println(estAnonimo.toString());
		Estudiante estu1 = new Estudiante(111, "44556677G", "Carlos", 'M', LocalDate.now(), 187, estAnonimo, null);
		Estudiante estu2 = new Estudiante(121, "44556677G", "Pablo", 'M', LocalDate.now(), 187, estAnonimo, null);
		Estudiante estu3 = new Estudiante(131, "44556677G", "Marcos", 'M', LocalDate.now(), 187, estAnonimo, null);
		Estudiante[] estudiante = {estu1, estu2, estu3};
		
		practicas.ordenarEstudiantes(estudiante);
		System.out.println("fin");

	}

}