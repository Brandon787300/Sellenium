package BasicJava;

public class O3_StringsConcat {
    public static void main(String[] args) {

        //Mostrar datos en los sout----------------
        final var profesion = "Abogado";
        final var cantidadJuiciosGanados = 3;
        final var letraFavorita = 'C';
        final var peso = 80.52;
        final var esColegiado = false;

        System.out.println(profesion);
        System.out.println(cantidadJuiciosGanados);
        System.out.println(letraFavorita);
        System.out.println(peso);
        System.out.println(esColegiado);


        //Concatenar datos con Strings
        //NOTA: Solo se puede usar UNA variable por sout
        final var numeroGatos = 5;
        final var pesoo = 13.2;
        final var libroFavorito = "El principito";
        final var esbajo = 80.52;
        final var inicial = "V";

        System.out.println("Hola tengo " + numeroGatos + " gatos ");
        System.out.println(pesoo + " es mi peso");
        System.out.println("Mi libro favortio es " + libroFavorito + " y lo leo todas las noches");
        System.out.println("Mi inicial es " + inicial);
        System.out.println("Si me pregunas si soy bajo pues la respuesta es " + esbajo);

        //Imprimir con datos con printF
        //NOTA: Printf si te permite usar MAS DE UNA variable

        //Tipo de dato// Format
        /*
            int         %d
            String      %s
            char        %c
            double      %f  = %.2f para escoger la cantidad e decimales que se desea.
            boolean     %b
            salto de linea  %n
         */

        var profesionV = "Abogado";
        var cantidadJuiciosGanadosV = 3;
        var letraFavoritaV = 'C';
        var pesoV = 80.52;
        var esColegiadoV = false;

        //Print F
        System.out.printf("Yo soy %s y tengo %d juiciios ganados %n", profesionV, cantidadJuiciosGanadosV);
        System.out.printf("Mi letra favorita es %c%n", letraFavoritaV);
        System.out.printf("Actualmente, estoy pesando %.1f%n", pesoV);
        System.out.printf("Estoy colegiado? %b%n", esColegiadoV);
    }
}
