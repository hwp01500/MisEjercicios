package Unidad3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random r = new Random(); //pongo el ramdon para generar un numero aleatorio del 1 al 6 en cada tiro
        Scanner scanner = new Scanner(System.in);
        int [] v = {0, 0, 0, 0, 0, 0}; //abro un array de 6 espacios para guardar los digitos del 1 al 6
        System.out.print("Ingresa el numero de lanzamientos: ");
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) { // abro un for inicializado en 0, i < N por el numero de tiradas y de ahi sumo i
            int resultado = r.nextInt(6) + 1; // establecer el limite numerico
            v [resultado - 1]++; // ir añadiendo los numeros
        }
        System.out.println("\nResultados:");

        for (int i = 0; i < 6; i++) { //Indicar las caras que han salido
            System.out.println("La cara " + (i + 1) +
                    " ha salido " + v[i] + " veces.");
        }
        scanner.close();
    }
    
}
