package Ejercicios_unidad1;

public class Ejercicio13 {
    public static void main(String[] args) {
        double g = 6.67384e-11;

        double m1 = Double.parseDouble(IO.readln("Ingresa masa 1: "));
        double m2 = Double.parseDouble(IO.readln("Ingresa masa 2: "));

        double d = Double.parseDouble(IO.readln("Ingresa la distancia: "));

        double f = g * (m1*m2)/(Math.pow(d, 2));

        System.out.println(f);
    }
}