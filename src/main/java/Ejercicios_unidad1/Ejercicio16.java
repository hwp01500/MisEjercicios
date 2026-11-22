package Ejercicios_unidad1;

public class Ejercicio16 {
    public static void main(String[] args) {
        double x = Double.parseDouble(IO.readln("Ingresa la coordenada de x: "));
        double y = Double.parseDouble(IO.readln("ingresa la coordenada de y: "));

        double r = Math.sqrt(x*x + y*y);
        double angulo = Math.atan2(y, x);

        System.out.println("(" + r + "," + angulo + ")");
    }    
}
