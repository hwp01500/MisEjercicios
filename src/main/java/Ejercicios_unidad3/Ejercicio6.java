package Ejercicios_unidad3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un nombre (decir fin para salir): ");
        String nombre = scanner.nextLine();

        while ((nombre.equalsIgnoreCase("fin")) != true) {
            for (int i = 0; i <= nombre.length() - 1; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(nombre.charAt(j));
                }
                System.out.println("");
            }
            System.out.print("Introduce un nombre (decir fin para salir): ");
            nombre = scanner.nextLine();
        }
        scanner.close();
    }
}
