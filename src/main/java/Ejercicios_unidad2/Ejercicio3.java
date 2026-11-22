package Ejercicios_unidad2;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(Numero(1));
    }

    static boolean Numero(int a) {

        if (a % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}