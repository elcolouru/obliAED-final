
package trabajoobligatorio;

/**
 *
 * @author RAFAEL
 */
public class Obligatorio implements IObligatorio{

    private Sistema _sistema;

    // PRE: Crea la estructura para representar sistema de reservas.
    // POS: Retorna ok.

    @Override
    public Retorno crearSistemaReservas() {
         _sistema = Sistema.getInstance();
         return new Retorno(Retorno.Resultado.OK);
    }

    @Override
    public Retorno destruirSistemaReservas() {
         Sistema.dropInstance();
         return new Retorno(Retorno.Resultado.OK);
    }

    /* ------------------------------------------------ */

    @Override
    public Retorno registrarBiblioteca(String Biblioteca) {

         _sistema.registrarBiblioteca(Biblioteca);

         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno eliminarBiblioteca(String Biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno registrarLibro(String titulo, String editorial, String biblioteca, int ejemplares) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno eliminarLibro(String titulo, String editorial, String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno RegistrarCalificacion(String titulo, String editorial, int calificacion, String biblioteca, String comentario) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno realizarReserva(int cliente, int numero, String biblioteca, String título, String editorial, String fecha) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno cancelarReserva(int cliente, int numero, String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno listarLibros(String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno listarLibrosBiblioteca(String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno listarBibliotecaRanking() {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno listarComentarios(String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno listarEspera(String titulo, String editorial, String biblioteca) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }

    @Override
    public Retorno mostrarReservasBiblioteca() {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);    
         return ret;
    }
    
}
