package BasicJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class O17_LISTAS {
    public static void main(String[] args) {

        //------------------------------DECLARAR LISTAS------------------------------
        final var listaNumeros = Arrays.asList(2, 3, 5, 6, 7);
        final var listaNombres = Arrays.asList("Carlos", "Jorge", "Rodrigo", "Juana");

        //Sin datos iniciales
        final var listaNumeros2 = new ArrayList<Integer>();
        final var listaNombres2 = new ArrayList<String>();

        //------------------------------MANIPULAR VALORES EN UNA LISTA------------------------------
        listaNumeros2.add(5); //Index 0
        listaNumeros2.add(3); //Index 1
        listaNumeros2.add(15); //Index 2

        listaNumeros2.set(0, 15);

        //------------------------------OBTENER VALORES DE UNA LISTA-----------------------------
        System.out.printf("El elemento con index 1 es %d%n", listaNumeros.get(1));

        //------------------------------MOSTRAR UNA LISTA EN CONSOLA CON PRINT-------------------
        System.out.printf("La lista original es: %s%n", listaNumeros);
        listaNumeros.set(0, 20);
        System.out.printf("La lista actualizada es: %s%n", listaNumeros);

        //------------------------------TAMAÑO DE UNA LISTA---------------------------------------
        System.out.printf("El tamaño de la lista es: %d%n", listaNumeros.size());

        //------------------------------CONSEGUIR ULTIMO DATO-------------------------------------
        System.out.printf("El tamaño de la lista es: %d%n", listaNumeros.get(listaNumeros.size() - 1));

        //------------------------------ITERAR UNA LISTA CON FOR----------------------------------
        System.out.println("Iteracion con For: ");
        for (var i = 0; i < listaNombres.size(); i++) {
            System.out.printf("index: %d, value: %s%n", i, listaNombres.get(i));
        }
        //------------------------------ITERAR UNA LISTA CON FOR EACH-----------------------------
        System.out.println("Iteracion con For Each:");
        for (var elemento : listaNombres) {
            System.out.printf("nombre: %s%n", elemento);
        }

        //------------------------------BUSCAR ELEMENTOS DE UNA LISTA-----------------------------
        final var listaInvitados = Arrays.asList("Brandon", "Dorian", "Daniel", "Mariana", "Juan");

        if (listaInvitados.contains("Juliana")) {
            System.out.println("Juliana puede acceder a la fiesta");
        } else {
            System.out.println("Juliana no esta invitada");
        }

        //------------------------------Verificar sin una lista esta vacia-----------------------------
        if (listaNombres.isEmpty()) {
            System.out.println("No hay ningun nombre");

        } else {
            System.out.printf("La lista es: %s%n", listaNombres);
        }

        //------------------------------DECLARAR LISTAS CON DATA ALEATORIA-----------------------------
        final var random = new Random();
        final var listaIntAleatoria = RandomUtilities.generarListaIntAleatoria(20, 50, 100, random);
        final var listaDoubleAleatoria = RandomUtilities.generarListaDoubleAleatroria(5, 50, 100, random);

        System.out.printf("La lista de int aleatoria es: %s%n", listaIntAleatoria);
        System.out.printf("La lista de double aleatoria es : %s%n", listaDoubleAleatoria);
    }

    //-------------------------------------METODOS CON LISTAS-----------------------------------

    //-------Como parametro
    static void mostrarValores(List<String> lista) {
        for (var elemento : lista) {
            System.out.printf("nombre: %s%n", elemento);
        }
    }

    //-------Como tipo de retorno
    static List<String> crearNombres() {
        return Arrays.asList("Carlos", "Jorge", "Mariana", "Rodrigo", "Jimena");
    }
}
