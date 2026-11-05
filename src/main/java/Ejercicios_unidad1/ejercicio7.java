package Ejercicios_unidad1;

public class ejercicio7 {
    public static void main(String[] args) {
        double vi = 5;
        double a = 2;

        double t = Double.parseDouble(IO.readln("Ingresa el tiempo(en segundos): "));

        double x = (vi*t) + ((a*t*t)/2);

        System.out.println("Distancia x = " + x + " m/s");
    }
}
