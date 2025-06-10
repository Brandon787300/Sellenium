package BasicJava;

import java.util.HashMap;
import java.util.Map;

public class O19_ExecepcionesTryCatch_Stderr {
    public static void main(String[] args) {
        //--------Declarar Maps------
        final var mapPersonas = Map.of(
                1, "Carlos",
                2, "Rodrigo",
                3, "Jorge",
                4, "Alfonso"
        );

        //Declarar sin datos
        final var mapPersonas2 = new HashMap<Integer, String>();
        final var mapNumeros = new HashMap<Integer, Double>();

        //Agregar Pares a los maps
        mapPersonas2.put(1, "Ana"); //key=1 value="Ana"
        mapPersonas2.put(2, "Rodrigo"); //key=2 value="Rodrigo"

        //Obtener el valor a traves del key
        System.out.printf("La persona con id=2 tiene nombre: %s%n", mapPersonas2.get(2));

        //Mostrar un map en consola
        System.out.printf("El map es: %s%n", mapPersonas2);

        //EJEMPLO 1
        final var mapStock = Map.of(
                "lentes", 100
        );

        System.out.printf("El stock de lentes es: %d%n", mapStock.get("lentes"));

        //Validar elementos de un map
        if (mapStock.containsKey(1)) {
            System.out.printf("%nEl elemento con key 2 esta en el map ");
        } else {
            System.out.printf("%nEl elemento con key 2 NO esta en el map");
        }

        if (mapStock.containsValue("Lentes")) {
            System.out.printf("%nEl elemento con value Jose esta en el map ");
        } else {
            System.out.printf("%nEl elemento con value Jose NO esta en el map");
        }

        //BUCLE FOR EACH PARA MAPS
        for (var nombre : mapPersonas.entrySet()) {
            System.out.printf("Key: %s value: %s%n", nombre.getKey(), nombre.getValue());
        }
    }

    //Metodos con maps
    static void imprimirValores(Map<String, Integer> map) {
        for (var par : map.entrySet()) {
            System.out.printf("Key: %s, value:%d%n", par.getKey(), par.getValue());
        }
    }

    static Map<String, Integer> crearMapStock() {
        return Map.of(
                "chompa", 2,
                "zapatilla", 7,
                "media", 4,
                "lentes", 5,
                "zapato", 10,
                "sombrero", 1
        );
    }
}
