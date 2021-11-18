package modelos;

public class Reserva {

    public Reserva(int cliente, int numero, String biblioteca, String titulo, String editorial, String fecha) {
        _cliente = cliente;
        _numero = numero;
        _biblioteca = biblioteca;
        _titulo = titulo;
        _editorial = editorial;
        _fecha = fecha;
    }

    private int _cliente;
    private int _numero;
    private String _biblioteca;
    private String _titulo;
    private String _editorial;
    private String _fecha;

    public int get_cliente() {
        return _cliente;
    }

    public void set_cliente(int _cliente) {
        this._cliente = _cliente;
    }

    public int get_numero() {
        return _numero;
    }

    public void set_numero(int _numero) {
        this._numero = _numero;
    }

    public String get_biblioteca() {
        return _biblioteca;
    }

    public void set_biblioteca(String _biblioteca) {
        this._biblioteca = _biblioteca;
    }

    public String get_titulo() {
        return _titulo;
    }

    public void set_titulo(String _titulo) {
        this._titulo = _titulo;
    }

    public String get_editorial() {
        return _editorial;
    }

    public void set_editorial(String _editorial) {
        this._editorial = _editorial;
    }

    public String get_fecha() {
        return _fecha;
    }

    public void set_fecha(String _fecha) {
        this._fecha = _fecha;
    }



}
