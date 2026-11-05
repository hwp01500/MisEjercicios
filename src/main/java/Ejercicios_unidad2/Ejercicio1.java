package Ejercicios_unidad2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(IO.readln("Introduce numero del numerador: "));
        int b = Integer.parseInt(IO.readln("Introduce numero del denominador: "));

        if (b != 0) {
            System.out.println(a/b);
        } else
            System.out.println("No se puede dividir entre cero");
    }
}
