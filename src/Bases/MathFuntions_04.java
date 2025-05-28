package Bases;//---Operaciones matematicas---

public class MathFuntions_04 {
    public static void main(String[] args) {
        //Ejercicio 1
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;
        final var velocidadFinal = velocidadInicial + aceleracion * tiempo; //MRUV

        System.out.printf("%n 01-Ejercicio");
        System.out.printf("%n Para una velocidad inicial %.3f, una aceleracion %.3f " +
                        "y un timepo %d se tiene una velocidad final de %.3f",
                velocidadInicial,
                aceleracion,
                tiempo,
                velocidadFinal);

        //Ejercicio 2
        final var aceleracion2 = 100.5032;
        final var masa = 76.1265;
        final var fuerza = masa * aceleracion2;
        System.out.printf("%n 02-Ejercicio");
        System.out.printf("%n Para una masa %.4f y una aceleracion %.4f se tiene una fuerza de %.4f%n",
                masa, aceleracion2, fuerza);

        //MATH OPERATIONS
        final var x = 9;

        //Raíz cuadrada
        final var raizCuadrada = Math.sqrt(x); //Raiz cuadrada de x
        //Potencia
        final var potencia = Math.pow(x, 3); //x elevado al cubo
        //PI
        final var pi = Math.PI;

        System.out.printf("%nMath Operations");
        System.out.printf("%n-Raiz de cuadrada de 9: %.3f", raizCuadrada);
        System.out.printf("%n-%d elevado al cubo: %.3f", x, potencia);
        System.out.printf("%n-Valor de PI: %f%n", pi);

        //Ejercicio 3
        System.out.printf("%n03-Ejercicio");
        final var cateto1 = 55.12;
        final var cateto2 = 23.12;

        final var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("%nPara los catetos %.2f y %.2f tenemos una hipotenusa de %.3f %n ", cateto1, cateto2, hipotenusa);

        //Ejercicio 4
        System.out.printf("%nEjercicio 4");
        final var radio = 25;

        //Formula de area
        final var area = pi * Math.pow(radio, 2);
        //Fromula de perimetro
        final var perimetro = 2 * pi * radio;

        System.out.printf("%nArea: %f", area);
        System.out.printf("%nRadio: %f", perimetro);
    }

}