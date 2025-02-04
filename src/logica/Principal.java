package logica;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(null, 0, 0, null);
        Alumno alumno2 = new Alumno("Juan", 24170555, 95, "Sistemas");

        alumno1.cargarMateria();
        alumno2.cargarMateria();

        System.out.println("El promedio = " + alumno2.obtenerPromedio());
    }
}
