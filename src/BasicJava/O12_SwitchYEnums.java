package BasicJava;

import java.util.Locale;
import java.util.Scanner;

public class O12_SwitchYEnums {
    public static void main(String[] args) {

        //Switch normal
//        final var opcion = 'A';
//        switch (opcion) {
//            case 'A' -> System.out.println("Elegiste la opcion A");
//            case 'B' -> System.out.println("Elegiste la opcion B");
//            case 'C' -> System.out.println("Elegiste la opcion C");
//            case 'D' -> System.out.println("Elegiste la opcion D");
//            default -> System.out.println("Opcion incorrecta");
//        }

        //Asignar daton con switch
//        final var mensaje = switch (opcion) {
//            case 'A', 'a' -> "opcion A";
//            case 'B', 'b' -> "opcion B";
//            case 'C', 'c' -> "opcion C";
//            case 'D', 'd' -> "opcion D";
//            default -> "opcion incorrecta";
//        };

        //En caso de ocupar mas lineas en bloque de los casos

        //yield = asignar ese dato a la variable mensaje2
//        final var mensaje2 = switch (opcion) {
//            case 'A', 'a' -> {
//                System.out.println("primera opcion");
//                yield "opcion 1";
//            }
//            case 'B', 'b' -> {
//                System.out.println("Segunda opcion");
//                yield "opcion 2";
//            }
//            case 'C', 'c' -> {
//                System.out.println("Tercera opcion");
//                yield "opcion 3";
//            }
//            case 'D', 'd' -> {
//                System.out.println("Cuarta opcion");
//                yield "opcion D";
//            }
//            default -> "opcion incorrecta";
//        };

        //------------------Ejercicio 1----------------
//        final var num1 = Main.ScannerManager.leerInt(scanner, "Numero 1");
//        final var num2 = Main.ScannerManager.leerInt(scanner, "Numero 2");
//
//        imPrimirMenu();
//        final var opcion = Main.ScannerManager.leerChar(scanner, "Que desea realizar?");
//        final var resultado = switch (opcion) {
//            case 'A', 'a' -> calcularSuma(num1, num2);
//            case 'B', 'b' -> calcularResta(num1, num2);
//            case 'C', 'c' -> calcularMultiplicacion(num1, num2);
//            case 'D', 'd' -> calcularDividir(num1, num2);
//            case 'E', 'e' -> calcularResto(num1, num2);
//            default -> 0;
//        };
//        System.out.printf("Reultado: %d", resultado);

        //------------------Ejercicio 2----------------
        final var scanner = new Scanner(System.in);

        final var dia = ScannerManager.leerString(scanner, "Ingrese el día").toUpperCase(Locale.ROOT);
        imprimirResultado(dia, calcularKCal(DiaSemana.valueOf(dia)));


    }

    //Ejercicio 1
    static void imPrimirMenu() {
        System.out.println("Opcion A/a: sumar");
        System.out.println("Opcion B/b: restar");
        System.out.println("Opcion C/c: multiplicar");
        System.out.println("Opcion D/d: dividir");
        System.out.println("Opcion E/e: resto");
    }

    //Ejercicio 1
    static int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    //Ejercicio 1
    static int calcularResta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    //Ejercicio 1
    static int calcularMultiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    //Ejercicio 1
    static int calcularDividir(int numero1, int numero2) {
        return numero1 + numero2;
    }

    //Ejercicio 1
    static int calcularResto(int numero1, int numero2) {
        return numero1 % numero2;
    }

    //--------------------------------------------------------
    //Ejercicio 2
    static int calcularKCal(DiaSemana dia) {
        final var calorias = switch (dia) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
            default -> -1;
        };

        return calorias;
    }

    //Ejercicio 2
    static void imprimirResultado(String dia, int calorias) {
        System.out.printf("Para el día %s se tiene que quemar %d calorias", dia, calorias);
    }

    //----------ENUMS----------
    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

}
