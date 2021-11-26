package centro;

import java.util.ArrayList;

public class Asignatura {
	
	// Create and ArrayList to store all the Alumnos
	
	private ArrayList<Alumno> alumnosAsignatura;
	
	public Asignatura() {
		
		// Class maker of Asignatura
		this.alumnosAsignatura = new ArrayList<Alumno>();
	}
	
	public void addAlumnos(Alumno alumno) {
		
		// With this method we can add new Alumno to an Asignatura
		alumnosAsignatura.add(alumno);
	}
	
	public void getAlumnoMedia() {
		
		// This method compare the mean mark of each Alumno ant return de max value and the name of Alumno.
		
		double media = 0;
		int i = 0;
		String nombre = null ;
		
		while ( i < alumnosAsignatura.size()) {
			if (media < alumnosAsignatura.get(i).media()) {
				
				media = alumnosAsignatura.get(i).media();
				nombre = alumnosAsignatura.get(i).getNombre();
			}
			i++;
		}
		
		System.out.println("La nota medía más alta es de " + media + " del alumno " + nombre);
		
	}


	

}
