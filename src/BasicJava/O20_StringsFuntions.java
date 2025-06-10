package BasicJava;

import java.util.Scanner;

public class O20_StringsFuntions {
    public static void main(String[] args) {

        //----------String como array Char-----------
//        System.out.println("---String como Array---");
//        final var cadena = "Aloha";
//        final var arrayChar = cadena.toCharArray();
//        for (var i = 0; i < arrayChar.length; i++) {
//            System.out.printf("index: %d, value: %c%n", i, arrayChar[i]);
//        }

        //----------String como clase----------
//        System.out.println("---String como Clase---");
//        System.out.printf("Longitud de la cadena: %d%n", cadena.length());
//
//        for (var i = 0; i < cadena.length(); i++) {
//            System.out.printf("index: %d, char: %c%n", i, cadena.charAt(i));
//        }

//        System.out.printf("El char 'o' tiene el indice: %d%n", cadena.indexOf('o')); //Indice donde comienza el char o String
//        System.out.printf("El string \"ha\" tiene el indice: %d%n", cadena.indexOf("ha"));
//
//        System.out.println("---String multilinea---");
//        final var multiliena = """
//                nombre : Carlos
//                altura: 1.86
//                edad: 35
//                """;
//        System.out.println(multiliena);
//
//        //Funcion
//        imprimir("Brandon", 35, 1.52);

        //----------Comparar Strings----------
//        final var scanner = new Scanner(System.in);
//        final var cadena1 = Main.ScannerManager.leerString(scanner, "Ingrese primera cadena");
//        final var cadena2 = Main.ScannerManager.leerString(scanner, "Ingrese primera cadena");

        //canner.close();

//        if (cadena1.equals(cadena2)) {
//            System.out.println("Ambas cadenas son exactamente iguales");
//        }
//
//        if (cadena1.equalsIgnoreCase(cadena2)) {
//            System.out.println("Ambas son iguales sin importar las mayusculas/minusculas");
//        }

        //Pregunto si la cadena2 esta dentro de la cadena1
        //Indica si la cadena1 tiene como substring/ subcadena la cadena2

//        if (cadena1.contains(cadena2)) {
//            System.out.println("La 1era cadena contiene a la 2nda");
//            System.out.println("Tambien se puede decir que la 2nda cadena esta contenida en la 1era");
//        }

        //-----------Convertir mayusculas y minuculas----------
        //final var scanner1 = new Scanner(System.in);
//        final var cadena3 = Main.ScannerManager.leerString(scanner, "Ingrese cadena");
//
//
//        System.out.printf("Conviertiendo a mayuscula: %s%n", cadena3.toUpperCase());
//        System.out.printf("Conviertiendo a minuscula: %s%n", cadena3.toLowerCase());
//        scanner.close();

        //------------Comparar Strings alfabeticamente------------ #1
//        final var scanner = new Scanner(System.in);
//
//        final var cadena1 = Main.ScannerManager.leerString(scanner, "Ingrese primera cadena");
//        final var cadena2 = Main.ScannerManager.leerString(scanner, "Ingrese segunda  cadena");
//
//        scanner.close();
//
//        System.out.println("Ordenando alfabeticamente importando mayusculas o minusculas A->Z");
//
//        if (cadena1.compareTo(cadena2) == 0) {
//            System.out.println("Son iguales!!");
//        } else if (cadena1.compareTo(cadena2) > 0) { //cadena1 es mayor que cadena2
//            System.out.printf("Ordenados alfabeticamente: %s%s", cadena1, cadena2);
//        } else if (cadena1.compareTo(cadena2) < 0) {
//            System.out.printf("Ordenadas alfabeticamente: %s%s", cadena1, cadena2);
//        }

        //------------Comparar Strings alfabeticamente------------ #2
//        final var scanner = new Scanner(System.in);
//
//        final var cadena1 = Main.ScannerManager.leerString(scanner, "Ingrese primera cadena");
//        final var cadena2 = Main.ScannerManager.leerString(scanner, "Ingrese segunda  cadena");
//        scanner.close();
//
//        System.out.println("Ordenandi alfabeticamente sin importar mayusculas o minusculas A-Z");
//
//        if (cadena1.compareToIgnoreCase(cadena2) == 0) {
//            System.out.println("Son iguales!!");
//        } else if (cadena1.compareToIgnoreCase(cadena2) > 0) { //cadena1 es mayor que cadena2
//            System.out.printf("Ordenados alfabeticamente: %s%s", cadena1, cadena2);
//        } else if (cadena1.compareToIgnoreCase(cadena2) < 0) {
//            System.out.printf("Ordenadas alfabeticamente: %s%s", cadena1, cadena2);
//        }


        //------------Desdoblar un strig con un separador------------
//        final var scanner = new Scanner(System.in);
//
//        final var cadena = Main.ScannerManager.leerString(scanner, "Ingrese cadena separada por comas");
//        scanner.close();
//        final var arrayString = cadena.split(",");
//
//        for (var i = 0; i < arrayString.length; i++) {
//            System.out.printf("index: %d value: %s%n", i, arrayString[i]);
//        }
        //------------Replace------------
//        final var data1 = "$125.35";
//        final var data2 = "$125.35PEN";
//        final var nuevaData1 = data1.replace("$", "");
//        final var nuevaData2 = data2.replace("$", "");
//        System.out.printf("La nueva data 1 es: %s%n", nuevaData1);
//        System.out.printf("La nueva data 2 es: %s%n", nuevaData2);

        //------------StartsWith & EndsWith------------
//        final var scanner = new Scanner(System.in);
//        final var nombre = Main.ScannerManager.leerString(scanner, "Igrese un nombre");
//
//        scanner.close();
//
//        if (nombre.startsWith("A")) {
//            System.out.println("El nombre empieza por A");
//        } else {
//            System.out.println("El nombre NO empieza por A");
//        }
//
//        if (nombre.endsWith("O")) {
//            System.out.println("El nombre termina por O");
//        } else {
//            System.out.println("El nombre NO termina por O");
//        }

        //------------isEmpty------------
        final var scanner = new Scanner(System.in);
        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre");
        scanner.close();

        if (nombre.isEmpty()) {
            System.out.println("Favor escribir su nombre");
        } else {
            System.out.printf("Su nombre es: %s%n", nombre);
        }


    }

    //-----------String Format-----------
    //Si bien ahora parece trivial lo usaremos para escribir en archivos en los siguientes capitulos
    static String obtenerStringFormateado(String nombre, int edad, double peso) {
        return String.format("Mi nombre es %s tengo %d de edad y peso %.2f%n", nombre, edad, peso);
    }

    //Funcion con string multilinea
    static void imprimir(String nombre, int edad, double altura) {
        final var multilinea = """
                nombre : %s
                altura: %.2f
                edad: %d
                """;
        System.out.printf(multilinea, nombre, altura, edad);
    }
}
