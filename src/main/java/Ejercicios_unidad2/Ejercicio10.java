package Ejercicios_unidad2;

public class Ejercicio10 {
    public static void main(String[] args) {
        String c = IO.readln("Introduce el primer caracter: ");
        String d = IO.readln("Introduce el segundo caracter: ");

        char letra = c.charAt(0);
        char letra2 = d.charAt(0);

        caracteres(letra, letra2);

    }

    static void caracteres(char a, char b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println((char) i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.println((char) i);
            }
        }

    }
}
