package BasicJava;

import java.util.Scanner;

public class O11_IFyELSE {
    public static void main(String[] args) {


        //Ejemplo 1 - If normal
        final var scanner = new Scanner(System.in);
        final var nota = ScannerManager.leerInt(scanner, "Ingrese su nota");

//        final var mensaje = calcularMensajeAlumno(nota);
//        System.out.println(mensaje);

        //Ejemplo 2 - Operador Ternario
        final var mensaje = nota > 10 ? "APROBADO" : "DESAPROBADO";
        System.out.println(mensaje);

        //Cerrar Scanner
        scanner.close();
    }

    //Funciones con IF - Ejemplo 1
    static String calcularMensajeAlumno(int nota) {
        if (nota > 10) {
            return "APROBADO";
        } else {  //Sino
            return "DESAPROBADO";
        }
    }


    //Funcion con operador ternario - Ejemplo 2
    //#2 Resumido
}
