package modelos;

public class Libro {
    public Libro(int id, String titulo, String editorial, int cantEjemplares) {
        _id = id;
        _titulo = titulo;
        _editorial = editorial;
        _cantEjemplares = cantEjemplares;
    }

    private int _id;
    private String _titulo;
    private String _editorial;
    private int _cantEjemplares;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String titulo) {
        this._titulo = titulo;
    }

    public String getEditorial() {
        return _editorial;
    }

    public void setEditorial(String editorial) {
        this._editorial = editorial;
    }

    public int getCantEjemplares() {
        return _cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this._cantEjemplares = cantEjemplares;
    }
}
