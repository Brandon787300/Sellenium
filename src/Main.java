import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final var file = new File("src/archivo.txt");

        try {
            final var scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error al abrir el file");
            System.err.printf("FileNotFoundException : %s%n", fileNotFoundException.getLocalizedMessage());
        }

        final var file2 = new File("src/output.txt");

        try {
            final var fileWriter = new FileWriter(file2);
            fileWriter.write(String.format("hola%n"));
            fileWriter.write(String.format("mundo%n"));
            fileWriter.write(String.format("como%n"));
            fileWriter.write(String.format("estas%n"));
            fileWriter.write(String.format("calvario31%n"));

            fileWriter.close();

        } catch (IOException ioException) {
            System.out.println("Error al abrir el file");
            System.err.printf("OIExceptio. %s%n", ioException.getLocalizedMessage());
        }


    }

}