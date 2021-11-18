package trabajoobligatorio;



public class Retorno {
	enum Resultado {
		OK, ERROR, NO_IMPLEMENTADA
	};

	int valorEntero;
	String valorString;
         boolean valorbooleano;
	Resultado resultado;
	static Retorno ok = new Retorno(Resultado.OK);
	static Retorno error = new Retorno((Resultado.ERROR));


    public Retorno(Resultado resultado) {

        this.resultado = resultado;
    }
        

        
}
