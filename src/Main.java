import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //------------------Ejercicio 1------------------
        final var scanner = new Scanner(System.in);
        final var num1 = ScannerManager.leerInt(scanner, "Numero 1");
        final var num2 = ScannerManager.leerInt(scanner, "Numero 2");

        char opcion;

        do {
            imPrimirMenu();
            opcion = ScannerManager.leerChar(scanner, "Que desea realizar?");
            if (opcion != 'F' && opcion != 'f') { //Condicion de continuacion
                ejecutarOpcion(num1, num2, opcion);
            }
        } while (opcion != 'F' && opcion != 'f'); //Condicion de continuacion

    }

    //Ejercicio calculadora
    static void ejecutarOpcion(int num1, int num2, char opcion) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(num1, num2);
            case 'B', 'b' -> calcularResta(num1, num2);
            case 'C', 'c' -> calcularMultiplicacion(num1, num2);
            case 'D', 'd' -> calcularDividir(num1, num2);
            case 'E', 'e' -> calcularResto(num1, num2);
            default -> 0;

        };
        System.out.printf("%nReultado: %d%n", resultado);
    }

    //Ejercicio 1
    static void imPrimirMenu() {
        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
        System.out.println("E/e: resto");
        System.out.printf("F/f: Salir del programa%n");

        //-------------------------------------------

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

}
