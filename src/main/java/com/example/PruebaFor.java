package com.example;

public class PruebaFor {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Introduce un numero: "));

        for (int i = 2; i <= n; i= i + 2) {
            System.out.println(i);
        } 
    }
}
