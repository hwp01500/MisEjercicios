package Unidad3.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Ingresa el tamaño del vector(entre 10 y 20): ");
        int n = scanner.nextInt();
        if (n < 10 || n > 20) {
            System.out.println("Error");
            return;
        }
        int [] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            int m = r.nextInt();
            v[i] = m;
        }
        int diferencia = v[1] - v[0]; // resto los primeros valores del array
        for (int j = 2; j<v.length; j++) { // lo inicializo con el valor dos para empezar a restar en dicha posicion
            int dif = v[j] - v[j - 1]; // resto el valor del array
            if (dif < diferencia) { // hago las comparaciones
                diferencia = dif;
            }
        }
        System.out.println(Arrays.toString(v));
        System.out.println("Diferencia entre valores: " + diferencia);
        scanner.close();
    }
}// tendre que repasar este codigo despues
