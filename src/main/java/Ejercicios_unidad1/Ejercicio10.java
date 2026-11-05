package Ejercicios_unidad1;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        double t1 = System.currentTimeMillis();

        String nombre = IO.readln("Ingresa tú nombre: ");

        double t2 = System.currentTimeMillis();

        double tiempo = t2 - t1;

        System.out.println("Hola " + nombre + " has tardado " + tiempo +" segundos");


    }
}
