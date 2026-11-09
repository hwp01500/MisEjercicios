package Ejercicios_unidad2;

public class Ejercicio2 {
    public static void main(String[] args) {
        int r1 = Integer.parseInt(IO.readln("Introduce el radio 1: "));
        int r2 = Integer.parseInt(IO.readln("Introduce el radio 2: "));
        int suma = r1+r2;
        int resta = Math.abs(r1-r2);

        int d = Integer.parseInt(IO.readln("Introduce la distancia entre los centros: "));
        
        if (d == 0) {
            System.out.println("Son concentricas");
        } else if (d > suma) {
            System.out.println("Son exteriores");
        } else if (d == suma) {
            System.out.println("Son tangentes exteriores");
        } else if (d < suma && d > resta) {
            System.out.println("Son secantes");
        } else if (d == resta) {
            System.out.println("Son tangentes interiores");
        } else if (d < resta) {
            System.out.println("Son interiores");
        }
    }
}
