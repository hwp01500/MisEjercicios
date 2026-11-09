package com.example;

public class PruebaFor2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Introduce un numero: "));

        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }
    }
}
