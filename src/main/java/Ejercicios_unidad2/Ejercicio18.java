package Ejercicios_unidad2;

public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de repaso de las tablas de multiplicar.");
        int contador = 0;
        String a = "s";

        while (a.equalsIgnoreCase("s")) {
            contador = 0;
            int n = Integer.parseInt(IO.readln("Introduce un número del 1 al 9: "));
            while (!(n >= 1 && n <= 9)) {
                System.out.println("Solo se permite el ingreso entre 1 y 9");
                n = Integer.parseInt(IO.readln("Introduce un número del 1 al 9: "));
            }
            for (int i = 1; i <= 10; i++) {
                int multiplicación = n*i;
                int p = Integer.parseInt(IO.readln("¿Cuanto es " + n + " x " + i + " ? "));
                if (p != multiplicación) {
                    System.out.println("Has cometido un error.");
                    System.out.println("La respuesta correcta era: " + multiplicación);
                    contador++;
                } else {
                    System.out.println("Has acertado: " + n +" x " + i +" = " + multiplicación);
                }

            }
            if (contador < 2) {
                System.out.println("Has aprobado, felicidades.");
            } else {
                System.out.println("Has suspendido.");
            }
            a = IO.readln("¿Deseas repasar otra tabla?: (s/n) ");
        }
    }
}
