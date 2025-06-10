package BasicJava;

import java.util.Random;

public class O18_Maps {
    public static void main(String[] args) {

        //--------------------------------------------Excepciones----------------------------------------------------------

        //ArithmeticException - Operacion aritemtica no soportada -
        // Dividir entre 0
        //-------------------------------
        //NullPointerException - Acceder a una variable no iniicalizada -
        // Tratar de imprimir un string Null
        //-------------------------------
        //IndexOutOfBoundsException -  Acceder a un indice de un arreglo o lista aun con un index inexistente -
        //Lista de 10 numeros y queresmos acceder al element 20
        //-------------------------------
        //InputMismatchException - Caundo se lee un tipo de dato que no es con el scanner respectivo -
        // Hacer scannernextDouble y pasarle un string por teclado
        //-------------------------------
        //FileNotFoundException - cuando se quiere leer un file que no existe -  Tratar de ller un archivo
        //-------------------------------
        //IOException - Cuando sucede un error al crear/modificar/borrar/leer/escribir un file -
        //Tratar de leer un archivo que no existe
        //-------------------------------
        //InterruptedException - Cuando un thread se interrumpe -
        // Mas que nada es para cuando se tiene multiples hilos(ejecuciones y uno interrumpe a otro)

        //Ejemplo
        final var random = new Random();
        final var a = RandomUtilities.generarRandomInt(10, 5, random);
        final var b = RandomUtilities.generarRandomInt(10, -1, random); //Podria ser 0

        try {
            final var division = dividirNumeros(a, b);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("No se puede dividir entre 0"); //Error para el usuario final
            System.err.printf("ArimeticalException: %s%n", arithmeticException.getLocalizedMessage()); //Error para el programador
        }
        final var c = RandomUtilities.generarRandomInt(10, 5, random);
        final var producto = a * c;
        System.out.printf("El producto es: %d%n", producto);
    }

    static int dividirNumeros(int a, int b) throws ArithmeticException {
        return a / b; //Posible exception - B PODRIA SER 0
    }
}
