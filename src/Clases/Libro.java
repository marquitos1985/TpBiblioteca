package Clases;

public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    public Libro(String titulo){
        this.titulo = titulo;
        this.autor = "DESCONOCIDO";
        this.disponible = true;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public boolean getDisponible(){
        return this.disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
