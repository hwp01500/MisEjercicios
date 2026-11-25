package Ejercicios_unidad3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce algun texto: ");
        String a = scanner.nextLine();

        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
        scanner.close();
    }
}
