package com.example;

public class PruebaFor3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Introduce un número: "));

        for (int i = 1; i != n%1 && i != n%n; i++) {}
    }
}
