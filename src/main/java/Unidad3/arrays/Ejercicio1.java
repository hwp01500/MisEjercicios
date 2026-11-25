package Unidad3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int [] v = {0, 0, 0, 0, 0, 0};
        System.out.print("Ingresa el numero de lanzamientos: ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int resultado = r.nextInt(6) + 1;
            v [resultado - 1]++;
        }
        System.out.println("\nResultados:");

        for (int i = 0; i < 6; i++) {
            System.out.println("La cara " + (i + 1) +
                    " ha salido " + v[i] + " veces.");
        }
        scanner.close();
    }
    
}
