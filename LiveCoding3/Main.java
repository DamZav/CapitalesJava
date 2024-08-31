package live3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los números de mangos y naranjas por consola
        System.out.print("Introduce el número de mangos: ");
        int mangos = scanner.nextInt();

        System.out.print("Introduce el número de naranjas: ");
        int naranjas = scanner.nextInt();

        // Crear un objeto de la clase MangosNaranjas
        MangosNaranjas mn = new MangosNaranjas(mangos, naranjas);

        // Imprimir el resultado
        mn.imprimir();

        // Cerrar el scanner
        scanner.close();
    }
}