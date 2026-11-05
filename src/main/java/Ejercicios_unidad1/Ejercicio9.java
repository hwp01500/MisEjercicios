package Ejercicios_unidad1;

public class Ejercicio9 {
    public static void main(String[] args) {
        double e = Double.parseDouble(IO.readln("Ingresa la cantidad de euros a convertir: "));

        double d = 1.19;

        System.out.print("Monto en dolares: ");

        System.out.printf("%.2f",(e*d));
    }
}
