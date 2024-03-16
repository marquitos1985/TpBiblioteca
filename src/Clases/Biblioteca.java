package Clases;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;

    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }
    public void agregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    public void getLibrosDisponibles(){
        System.out.println("LIBROS DISPONIBLES:");
        for(int i = 0; i < this.libros.size(); i++){
            if(this.libros.get(i).getDisponible() == true){
                System.out.println("Libro: " + this.libros.get(i).getTitulo() + "/ Autor: " + this.libros.get(i).getAutor());
            }
        }
    }
    public void prestarLibro(Libro libro){
        for(int i = 0; i < libros.size(); i++){
            if(this.libros.get(i) == libro){
                this.libros.get(i).setDisponible(false);
            }
        }
    }

}
