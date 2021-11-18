package modelos;
import data.*;

public class Biblioteca {
    private String _nombre;

    public Biblioteca(String nombre) {
        _nombre = nombre;
    }

    List<Libro> listaLibros;

    @Override
    public boolean equals(Object obj) {

        if (obj.getClass() == Biblioteca.class) {
            return ((Biblioteca) obj).getNombre().equals(_nombre);
        }
        return false;
    }

    public String getNombre() {
        return _nombre;
    }
}
