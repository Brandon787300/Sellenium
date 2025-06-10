package Practices;

public class O3_While_DoWhile {
    public static void main(String[] args) {
        //--------Ejericico 1-------- Fibonacci
//        final var scanner = new Scanner(System.in);
//        final var n = Main.ScannerManager.leerInt(scanner, "Ingrese cantidad numeros serie de fibonacci");
//        scanner.close();
//        mostrarSerieFibonacci(n);

        //--------Ejericico 2-------- Capicua - igual en espejo  121, 555
//        final var scanner = new Scanner(System.in);
//        final var n = Main.ScannerManager.leerInt(scanner, "Igrese numero a verificar su ess capicua");
//        scanner.close();
//        final var nInvertido = invertirNumero(n);
//        final var esCapicua = esCapicua(n, nInvertido);
//
//        System.out.printf("El numero %d es capicua? %b%n", n, esCapicua);

        //--------Ejericico 3--------
//        final var scanner = new Scanner(System.in);
//
//        final var n = Main.ScannerManager.leerInt(scanner, "Ingrese un numeros para verificar si es primo");
//        scanner.close();
//
//        final var esPrimo = esPrimo(n);
//        System.out.printf("El numero %d es primo? %b%n", n, esPrimo);


    }

    //----------Ejercicio 1--------FibonacciEjemplo
    static void mostrarSerieFibonacci(int n) {
        var anterior = 0;
        var actual = 1;

        // Se imprimen los dos primeros numeros
        System.out.printf("%d %d ", anterior, actual);

        //Por eson el -2
        for (var i = 0; i < n - 2; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }

    //--------Ejericico 2-------- Capicua
    static int invertirNumero(int n) {
        var aux = n;
        var inverso = 0;

        while (aux != 0) {
            //Residuo es constante ya que no se reedeclara dentro del bucle
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux /= 10;
        }
        return inverso;
    }

    static boolean esCapicua(int n, int nInvertido) {
        return n == nInvertido;
    }

    //--------Ejericico 3--------
    static boolean esPrimo(int n) {
        var i = 2; //i es la cantidad de divisores

        while (i < n) {
            if (n % i != 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
