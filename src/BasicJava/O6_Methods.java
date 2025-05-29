package BasicJava;

public class O6_Methods {
    public static void main(String[] args) {
        //__________METODOS_________
        //Llamar  los metodos

        //Llamar al aire
        imprimirHolaMundo();

        //Guardar retorno
        final var suma = sumarNumbers(5, 7, 8);
        System.out.printf("La suma es: %d%n", suma);

    }

    //___________________________PARAMETROS de un metodo___________________________
    //Metodo sin parametros
    static void imprimirHolaMundo() {
        System.out.println("Hola mundo");
    }

    //Metodo con parametros
    static int sumarNumeros(int a, int b, int c) {
        return a + b + c;
    }

    //Metodo con un paramerto que no se usa
    static int sumarNumeros2(int a, int b, int c, int d) {
        return a + b + c;
    }

    //___________________________CUERPO de un metodo___________________________
    //Metodo que su funcion es imprimir en consola
    static void imprimirHolaMundozz() {
        System.out.println("Hola Mundo");
    }

    //Metodo que su funcion es sumar numeros
    static int sumarNumeros3(int a, int b, int c) {
        return a + b + c;
    }

    static int sumarNumeros4(int a, int b, int c) {
        System.out.printf("Sumando %d, %d & %d%n", a, b, c);
        return a + b + c;
    }

    //___________________________RETURN de un metodo___________________________
    //Metodo que no retorna nada (void), por ello no se usa return
    static void getImprimirHolaMundo() {
        System.out.println("Hola Mundo");
    }

    //Metodo que retorna un valor fijo/hardcodeade
    static String retornarSaparador() {
        return "=====================";
    }

    //Metodo que retorna un int
    static int sumarNumbers(int a, int b, int c) {
        return a + b + c;
    }

    //Metodo que retorna el resultado de otro metodo
    static int sumarNumbers2(int a, int b, int c) {
        System.out.printf("Sumando %d, %d, %d%n", a, b, c);
        return sumarNumbers(a, b, c);
    }
}
