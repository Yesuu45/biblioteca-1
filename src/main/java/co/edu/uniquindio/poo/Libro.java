package co.edu.uniquindio.poo;

public class Libro{
    private String codigo;
    private String isbn;
    private String titulo;
    private int unidadesDisponibles;

    public Libro(String codigo, String isbn, String titulo, int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", unidadesDisponibles="
                + unidadesDisponibles + "]";
    }


    

    
    
}