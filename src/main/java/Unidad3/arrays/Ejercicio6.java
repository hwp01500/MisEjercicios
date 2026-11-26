package Unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random r = new Random();
        int contador = 0;
        int lim = r.nextInt(500 -10 + 1) + 10;
        int n = r.nextInt(-100, 101);
        boolean repetido = false;
        int [] v = new int[lim];
        for (int i = 0; i<v.length; i++) {
            n = r.nextInt(-100, 101);
            v[i] = n;
        }
        for (int j = 0; j < v.length - 1; j++) {
            if (v[j] == v[j + 1] && !repetido) {
                contador++;
                repetido = true;
            } else {
                repetido = false;
            }
        }
        if (v.length <= 50) {
            System.out.println(Arrays.toString(v));
        }
        System.out.println("Valores repetidos: " + contador);
    }
}
