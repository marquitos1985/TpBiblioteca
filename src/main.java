import Clases.*;
import java.util.ArrayList;

public class main {
    public static void main(String [] args){
        Biblioteca biblio = new Biblioteca();
        Libro seniorAnillos = new Libro("El señor de los anillos", "Juan Carlos");
        Libro harry1 = new Libro("Harri Potter 1");
        Libro ironMan1 = new Libro("Iron man", "Marcelo Torres");
        Usuario marcosCarrizo = new Usuario("Marcos Carrizo");
        Usuario adrianCuevas = new Usuario("Adrian Cuevas");
        Usuario marianoTobares = new Usuario("Mariano Tobares");


        biblio.agregarLibro(seniorAnillos);
        biblio.agregarLibro(harry1);
        biblio.agregarLibro(ironMan1);

        biblio.agregarUsuario(marcosCarrizo);
        biblio.agregarUsuario(adrianCuevas);
        biblio.agregarUsuario(marianoTobares);

        biblio.getLibrosDisponibles();

        //prestamo
        biblio.prestarLibro(seniorAnillos);

        biblio.getLibrosDisponibles();





    }
}
