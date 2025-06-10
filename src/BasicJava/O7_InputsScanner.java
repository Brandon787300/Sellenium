package BasicJava;

import java.util.Scanner;

public class O7_InputsScanner {
    public static void main(String[] args) {
        //Inputs / Ingreso de datos

        //Tipo de datos - - - - -Metodo
        //  String              scanner.nextLine();
        //  Char                scanner.next().charAt(0);
        //  int                 scanner.nextInt();
        //  double              scanner.nextDouble();
        //  boolean             scanner.nextBoolean();

        //Instancia que abre los INPUTS
        final var scanner = new Scanner(System.in);

        //Ejemplo de SCANER

//        final var scanner = new Scanner(System.in);  //Abrir el escaner
//        System.out.println("Ingrese un numero: ");   //Mensaje de guia
//        final var numero = scanner.nextInt();        //Input
//
//        System.out.printf("El numero leido es: %d%n", numero);
//        scanner.close(); //Cerrar escaner
        //----------------------------------------------------------------

        //Ejercicio 1

        //Ingreso de datos
//        System.out.println("Ingrese su edad: ");
//        final var edad = scanner.nextInt();
//        System.out.println("Ingrese su estatura: ");
//        final var estatura = scanner.nextDouble();
//
//        scanner.nextLine(); //Limpiar el buffer para poder escribir el nombre
//        //Esto debido a que se lee primero un numero primero y luego un string
//
//        System.out.println("Ingresa tu nombre: ");
//        final var nombre = scanner.nextLine();
//
//        imprimirResultado(nombre, edad, estatura);
        //----------------------------------------------------------------

        //Ejercicio 2 - Agregar nombre al primer ejercicio

        //----------------------------------------------------------------

        //LLamando al ScannerMaganer para realizarlo mas facil
//        final var numero = Main.ScannerManager.leerInt(scanner, "Ingrese numero");
//        scanner.close();
//
//        System.out.printf("El numero es: %d%n", numero);

        //Ejercicio 3

//        final var nombre = Main.ScannerManager.leerString(scanner, "Ingrese su nombre");
//        final var edad = Main.ScannerManager.leerInt(scanner, "Ingrese su edad");
//        final var estatura = Main.ScannerManager.leerDouble(scanner, "Ingrese la estatura");
//        imprimirResultado3(nombre, edad, estatura);
//        scanner.close();

    }

    //Imprimir resultados - Ejercicio 1
    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Hola %s Tu edad es %d y tu estatura %.2f.", nombre, edad, estatura);
    }

    //Imprimir resultado - Ejercicio 3
    static void imprimirResultado3(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, tengo %d años y mido %.2fcm.", nombre, edad, estatura);
    }


}