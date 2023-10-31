import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
        Pelicula endgame = new  Pelicula();

        endgame.establecerNombre("Avengers: Endgame");
        endgame.establecerDuracion(-125);
        endgame.establecerCalidad(":4K");
        endgame.establecerClasificacion("PC-13");
        endgame.modificarGenero("Ciencia ficcion");

        System.out.println("Nombre: " + endgame.mostrarNombre());
        System.out.println("Duracion: " + endgame.mostrarDuracion() + " minutos");
        System.out.println("Calidad: " + endgame.mostrarCalidad());
        System.out.println("Clasificacion: " + endgame.mostrarClasificacion());
        System.out.println("Genero: " + endgame.mostrarGenero());
        System.out.println("***********************************************");

        Pelicula justiceLeague = new Pelicula("JusticeLeague", 240, "Cienca ficcion", "8K", "R");
        System.out.println("Nombre: " + justiceLeague.mostrarNombre());
        System.out.println("Duracion: " + justiceLeague.mostrarDuracion());
        System.out.println("Calidad: " + justiceLeague.mostrarCalidad());
        System.out.println("Clasificacion: " + justiceLeague.mostrarClasificacion());
        System.out.println("Genero: " + justiceLeague.mostrarGenero());

        System.out.println("************************************************");
        Pelicula superman = new Pelicula();
        System.out.println("Como se llama la pelicula: ");
        String nombre = lector.nextLine();
        superman.establecerNombre(nombre);
        System.out.println("Cual es la duracion de la pelicula: ");
        int duracion = lector.nextInt();
        superman.establecerDuracion(duracion);
        System.out.println("Cual es la caidad de la pelicula: ");
        String calidad = lector.nextLine();
        superman.establecerCalidad(calidad);
        System.out.println("Cual es la clasificacion");
        String clasificacion = lector.nextLine();
        superman.establecerClasificacion(clasificacion);
        System.out.println("Cual es el genero de la pelicula: ");
        String genero = lector.nextLine();
        superman.modificarGenero(genero);
        
        System.out.println("Nombre: " + superman.mostrarNombre());
        System.out.println("Duracion: " + superman.mostrarDuracion());
        System.out.println("Calidad: " + superman.mostrarCalidad());
        System.out.println("Clasificacion: " + superman.mostrarClasificacion());
        System.out.println("Genero: " + superman.mostrarGenero());

        

    }
}