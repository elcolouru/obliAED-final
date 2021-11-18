package trabajoobligatorio;

import data.List;
import modelos.Biblioteca;
import modelos.Reserva;

public class Sistema {

    private List<Biblioteca> listaBiblioteca;
    private List<Reserva> listaReserva;
    private static Sistema instance;

    private Sistema() {
        listaBiblioteca = new List<Biblioteca>();
        listaReserva = new List<Reserva>();
    }

    public static Sistema getInstance() {
        if(instance == null) {
            instance = new Sistema();
        }
        return instance;
    }

    public static void dropInstance() {
        instance = null;
    }

    public Retorno registrarBiblioteca(String biblioteca) {
        Biblioteca nuevaBiblioteca = new Biblioteca(biblioteca);

        if (!listaBiblioteca.contains(nuevaBiblioteca)) {
            listaBiblioteca.add(nuevaBiblioteca);
            return Retorno.ok;
        }
        return Retorno.error;
    }
}
