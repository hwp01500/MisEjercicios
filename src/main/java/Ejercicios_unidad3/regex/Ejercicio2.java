package Ejercicios_unidad3.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ("^(\\d{2}-([A-Za-z]{3}|\\d{2})-\\d{4}|\\d{2}/\\d{2}/\\d{4})$");
        Pattern fecha = Pattern.compile(regex);

        System.out.print("Introduce una fecha: ");
        String s = scanner.nextLine();
        if (fecha.matcher(s).matches()) {
            System.out.println("fecha valida");
        } else {
            System.out.println("fecha invalida");
        }
        scanner.close();
    }
}
