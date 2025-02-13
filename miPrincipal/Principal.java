package miPrincipal;

public class Principal {
    /*public String getGreeting() {
        return "Hi, this is a salute from Codespaces!";
    }*/

    public static void main(String[] args) {
        /*Principal principal = new Principal();
        String saludo = principal.getGreeting();
        System.out.println(saludo);*/


        //Creación de instancias alumno
        Alumno alumno1 = new Alumno(null, 0, 0, null);
        Alumno alumno2 = new Alumno("Juan", 24170555, 95, "Sistemas");

        //Creación de instancias mochila
        Mochila mochila1 = new Mochila();
        Mochila mochila2 = new Mochila("Verde", "Mediana", 5);

        //Llamado de métodos de instancias alumno
        alumno1.cargarMateria();
        alumno2.cargarMateria();

        //Sysout que imprime el promedio en pantalla
        System.out.println("El promedio = " + alumno2.obtenerPromedio());

        //Llamado de métodos de instancias mochila
        mochila1.abrir();
        mochila2.lanzar();
    }
}