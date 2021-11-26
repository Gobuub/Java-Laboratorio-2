package centro;

//import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First we create our Alumnos
		
		int[] notas1= {5,4,6,3,7};
		Alumno a=new Alumno(1111, "11111111A", "Alex", notas1);
		int[] notas2= {6,5,7,4,8};
		Alumno b=new Alumno(1112, "11111111B", "Javi", notas2);
		int[] notas3= {7,6,8,5,9};
		Alumno c=new Alumno(1113, "11111111C", "Kike", notas3);
		int[] notas4= {8,7,9,6,10};
		Alumno d=new Alumno(1114, "11111111D", "Alberto", notas4);
		
		
		Asignatura programacion= new Asignatura();
		
		// Create a new Asignatura and add Alumnos to it.
		
		programacion.addAlumnos(a);
		programacion.addAlumnos(b);
		programacion.addAlumnos(c);
		programacion.addAlumnos(d);
		
		// Print the mean and the name of all of the Alumnos on Asignatura
		
		System.out.println("La media de las notas de los alumnos son:");
		System.out.println(programacion);
		System.out.println(a.media());
		System.out.println("La nota mínima es de: " + a.minNota());
		System.out.println(a.getNombre());
		System.out.println(b.media());
		System.out.println("La nota mínima es de: " + b.minNota());
		System.out.println(b.getNombre());
		System.out.println(c.media());
		System.out.println("La nota mínima es de: " + c.minNota());
		System.out.println(c.getNombre());
		System.out.println(d.media());
		System.out.println("La nota mínima es de: " + d.minNota());
		System.out.println(d.getNombre());
		
		// Call the method to know who is the Alumno with max mean in Asigntatura.
		
		programacion.getAlumnoMedia();

	}

}
