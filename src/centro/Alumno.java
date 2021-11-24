package centro;


public class Alumno {
	// Create class Alumno and declare its attributes.
	private int codigo;
	private String dni;
	private String nombre;
	private int[] calificaciones;
	
	
	public Alumno (int codigoAlumno, String dniAlumno, String nombreAlumno, int[] calificaciones) {
		// Class maker of Alumno
		this.codigo = codigoAlumno;
		this.dni = dniAlumno;
		this.nombre = nombreAlumno;
		this.calificaciones = calificaciones; 
		
	}
	
	// Generate setter and getter of our class, to can update it outside the class
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(int[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	public double media() {
		
		// This method calculate the mean of the marks from Alumno
		
		double totalNotas = 0; // create an aux variable to store the sum of the marks
		int i=0;
		while (i <= calificaciones.length-1) {
			
			// This loop iterate for the array and sum all it´s values
			
			totalNotas = totalNotas + calificaciones[i];
			i++;
		}
		
		return totalNotas / i; // return the mean of the marks
	}
	
	public double maxNota() {
		
		//This method calculate the max mark of Alumno
		
		double notaMax = 0;
		int i = 0;
		while (i <= calificaciones.length-1) {
			
			// In the loop compare the value of one mark to the next, and store the max value on notaMax
			if (calificaciones[i]>notaMax) {
				notaMax = calificaciones[i];
			}
			i++;
		}
		return notaMax; // return the max value mark
	}
	
	public double minNota() {
		
		//This method calculate the min mark of Alumno
		
		double notaMin = 0;
		int i = 0;
		while (i <= calificaciones.length-1) {
			
			// In the loop compare the value of one mark to the next, and store the min value on notaMin
			if (calificaciones[i]>notaMin) {
				notaMin = calificaciones[i];
			}
			i++;
		}
		return notaMin; // return the min mark of Alumno
	}
				
}
	
	
