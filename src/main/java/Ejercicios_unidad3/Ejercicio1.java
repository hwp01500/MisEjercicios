package Ejercicios_unidad3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce alguna palabra cualquiera: ");
        String d = scanner.nextLine().toLowerCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < d.length(); j++) {
            char letra = d.charAt(j);
            switch (letra) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);
    }
}
