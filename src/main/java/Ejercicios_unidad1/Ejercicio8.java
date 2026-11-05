package Ejercicios_unidad1;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        double r = Double.parseDouble(IO.readln("Introduce el radio: "));
        double pi = Math.PI;

        double p = (2*pi*r);

        double a = (pi * Math.pow(r, 2));

        System.out.println("Perimetro: " + p);
        System.out.println("Area: " + a);

    }
}
