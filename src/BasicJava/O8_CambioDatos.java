package BasicJava;

public class O8_CambioDatos {
    public static void main(String[] args) {
        //Tipos de datos primitivos & Wrapper Class

        //---Tranformar datos---

        //STRING -> INT-----------------------------------
//        final var xString = "12";
//        final var xInterger = Integer.parseInt(xString);

        //STRING -> DOUBLE--------------------------------
//        final var yString = "25.12";
//        final var xInteger = Double.parseDouble(yString);

        //STRING -> BOOLEAN-------------------------------
//        final var yString = "TRUE";
//        final var xDouble = Boolean.parseBoolean(yString);

        //INT -> STRING-----------------------------------
        //DOUBLE -> STRING
//        final var xInteger = 12;
//        final var yInteger = 25.12;
//        final var xString = String.valueOf(x);
//        final var yString = String.valueOf(y);


        //Ejemplo 1-----------------------------------------------
//        final var precio1 = "45.50";
//        final var precio2 = "32.20";
//        final var precio3 = "75.12";
//
//        final var suma = calcularSuma(precio1, precio2, precio3);
//        imprimirSuma(suma);

        //Ejercicio 1---------------------------------------------
        final var cantidad1 = "23";
        final var cantidad2 = "5";
        final var cantidad3 = "111";

        final var suma2 = calcularSuma2(cantidad1, cantidad2, cantidad3);
        imprimirSuma(suma2);

    }

    //Tranformar precios - Ejemplo 1
    static double calcularSuma(String precio1, String precio2, String precio3) {
        final var precio1Double = Double.parseDouble(precio1);
        final var precio2Double = Double.parseDouble(precio2);
        final var precio3Double = Double.parseDouble(precio3);

        return precio1Double + precio2Double + precio3Double; //Suma aritemetica que ya son Double
    }

    // Imprimir resultado - Ejemplo 1
    static void imprimirSuma(double precioTotal) {
        System.out.printf("El precio total es %.2f%n", precioTotal);
    }

    //----------------------------------------------------------------------------

    //Transformar datos - Ejercicio 1
    static int calcularSuma2(String cantidad1, String cantidad2, String cantidad3) {
        final var precio1 = Integer.parseInt(cantidad1);
        final var precio2 = Integer.parseInt(cantidad2);
        final var precio3 = Integer.parseInt(cantidad3);

        return precio1 + precio2 + precio3;

    }

    //Mostrar resultado - Ejercicio 1
    static void imprimirSuma(int cantidadTotal) {
        System.out.printf("La cantidad total es %d%n", cantidadTotal);
    }

}
