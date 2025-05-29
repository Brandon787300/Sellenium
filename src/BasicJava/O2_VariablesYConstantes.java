package BasicJava;

public class O2_VariablesYConstantes {
    public static void main(String[] args) {
        //Tipos de datos en java
        /*
                                            Valor por defecto
        int: Número entero                  0
        double: numero con punto decimal    0.0
        char: caracter                      null
        string: cadena de caracteres        null
        booleen: true/false                 false
        */
        String profesion = "Abogado";
        int cantidadJuiciosGanados = 3;
        char letraFavorita = 'C';
        double peso = 80.52;
        boolean esColegiado = false;

        //Variables definidas con var

        var profesionV = "Abogado";
        var cantidadJuiciosGanadosV = 3;
        var letraFavoritaV = 'C';
        var pesoV = 80.52;
        var esColegiadoV = false;

        //Declaracion de constantes

        //Los datos no se pueden actualizar
        final var profesionC = "Abogado";
        final var cantidadJuiciosGanadosC = 3;
        final var letraFavoritaC = 'C';
        final var pesoC = 80.52;
        final var esColegiadoC = false;


    }
}
