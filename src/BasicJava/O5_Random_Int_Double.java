package BasicJava;

import java.util.Random;

public class O5_Random_Int_Double {
    public static void main(String[] args) {
        //_________Numeros aleatorios INT___________

        final var min = 16;
        final var max = 25;
        final var random = new Random(); //Para poder generar aleatorios
        final var numeroAlteatorio = random.nextInt(max - min + 1) + min;

        System.out.printf("-Ejemplo INT");
        System.out.printf("%nEl numero aleatorio entre %d y %d es: %d%n", max, min, numeroAlteatorio);

        //Ejercicio #1 Generar random int
        final var min2 = 20;
        final var max2 = 200;
        final var pi = Math.PI;
        final var radio = random.nextInt(max2 - min2 + 1) + min2;

        //Formula de area
        final var area = pi * Math.pow(radio, 2);
        //Fromula de perimetro
        final var perimetro = 2 * pi * radio;

        System.out.printf("%n-Ejercicio 1 - INT Random");
        System.out.printf("%nArea: %f", area);
        System.out.printf("%nRadio: %f%n", perimetro);


        //_________Numeros aleatorios DOUBLE___________
        System.out.printf("%n-Ejemplo DOUBLE");
        final var min3 = 5;
        final var max3 = 15;
        //final var random = new Random(); //Hay uno arriba
        final var numeroAleatorio3 = (max3 - min3) * random.nextDouble() * min2;

        System.out.printf("%nEl numero aleatorio entre %d - %d es: %.2f %n", min, max, numeroAleatorio3);

        //Ejercicio #2 Generar random Double
        final var min4 = 5;
        final var max4 = 100;
        final var cateto1 = (max4 - min4) * random.nextDouble() * min4;
        final var cateto2 = (max4 - min4) * random.nextDouble() * min4;

        //Calcular el valor de la hipotenusa
        final var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("%n-Ejercicio 2 - Random DOUBLE");
        System.out.printf("%nPara los catetos %f y %f tenemos una hipotenusa de %f%n", cateto1, cateto2, hipotenusa);
    }
}
