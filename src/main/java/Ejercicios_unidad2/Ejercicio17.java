package Ejercicios_unidad2;

import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100000 - 1000 + 1) + 1000;
        int a;
        int p = r.nextInt(1, n + 1);
        int contador = 0;
        String s = "s";
        while (s.equalsIgnoreCase("s")) {
            contador = 0;
            n = r.nextInt(100000 - 1000 + 1) + 1000;
            p = r.nextInt(1, n + 1);

            do {
                a = Integer.parseInt(IO.readln("He pensado un número entre 1 y " + n + ", adivina cuál es: "));
                if (a < p) {
                    System.out.println("El numero es menor al correcto.");
                } else if (a > p) {
                    System.out.println("El numero es mayor al correcto");
                }
                contador++;
            } while (a != p);
            System.out.println("Felicidades, has ganado. te ha tomado " + contador + " intentos");
            s = IO.readln("¿Deseas volver a jugar? (s/n) ");
        }
    }

}
