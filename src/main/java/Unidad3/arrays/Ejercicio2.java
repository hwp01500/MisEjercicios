package Unidad3.arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random r = new Random(); //para generar el limite y los numeros aleatorios
        int lim = r.nextInt(50-10+1) + 10; //establezco el limite entre 10 y 50
        int [] n = new int[lim]; //creo un vector con la longitud random

        for (int i = 0; i < n.length; i++) { //hago el for para recorre cada posicion
            int valor =  r.nextInt(-100, 101); // limite de numeros a insertar
            boolean s;
            do { // hago un do while para verificar si hay numeros repetidos
                valor =  r.nextInt(-100, 101);
                s = false;
                for (int k = 0; k<i; k++) { // buble para recorre el vector
                    if (valor == n[k]) { //determino que si el valor es igual al que esta en k posicion, se rompa el bucle do while
                        s = true;
                        break;
                    }
                }
            } while (s);
            n[i] = valor; // vector con los valores
        }
        int [] b = new int[n.length]; // creo el segundo vector con la longitud del primero
        for (int j = b.length - 1; j >= 0; j--) { // buvle para recorrer el vector al reves
            int a = n.length -1 -j; // para establecer los valores al reves, osea que sus posiciones cambien
            b[j] = n[a]; // el valor guardado en la posicion a sera invertido en la posicion j
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(b));
    }
}
