package Clases;

public class Usuario {
    static int contador = 0;
    private String nombre;
    private int id = 0;

    public Usuario(String nombre){
        this.nombre = nombre;
        this.id = contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
}
