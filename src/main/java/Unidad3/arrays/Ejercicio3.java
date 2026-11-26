package Unidad3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector(entre 10 y 100000): ");
        int n = scanner.nextInt();
        if (n < 10 || n > 1000000) {
            System.out.println("Error");
            return;
        }
        int [] v = new int[n];
        double t1 = System.nanoTime();
        for (int i = 0; i < v.length; i++) {
            int lim;
            boolean s;
            do {
               lim = r.nextInt(-(n*2000),(n*2000 + 1));
                s = false;
                for (int j = 0; j <i; j++){
                    if (lim == v[j]) {
                       s = true;
                       break; 
                    }
                }
            } while (s);
            v[i] = lim;
        }
        double t2 = System.nanoTime();
        int mayor = v[0];
        int menor = v[0];
         double t3 = System.nanoTime();
        for (int k = 1; k<v.length; k++) {
            if (v[k] > mayor) {
                mayor = v[k];
            }
            if (v[k] < menor) {
                menor = v[k];
            }
        }
       long max = (long) mayor;
        long resta = max - menor;
        double t4 = System.nanoTime();
        double tiempo = t2 - t1;
        double tiempo2 = (t4 - t3);
        System.out.println("Tamaño: " + n);
        System.out.println("Tiempo en llenarse: " + tiempo);
        System.out.println("Diferencia entre el mayor y el menor: " + resta);
        System.out.println("Tiempo de la diferencia: " + tiempo2);
        scanner.close();
    }
}
