package Ejercicios_unidad2;

public class ejercicio8 {
    public static void main(String[] args) {
        int menu = 1;
        while (menu != 0) {
            menu = Integer.parseInt(IO.readln(
                    "Bienvenido al programa de calculo de triangulos. Eliga su opción: \n1.Lados  \n2.Angulos \n0.Salir \n"));
            if (menu == 1) {
                System.out.println(longitud(0, 0, 0));
            } else if (menu == 2) {
                System.out.println(angulo(0, 0, 0));
            }
        }
    }

    static String longitud(double a, double b, double c) {
        String s = "";
        a = Double.parseDouble(IO.readln("Ingresa la longitud del lado a: "));
        b = Double.parseDouble(IO.readln("Ingresa la longitud del lado b: "));
        c = Double.parseDouble(IO.readln("Ingresa la longitud del lado c: "));

        while (a <= 0 || b <= 0 || c <= 0) {
            if (a <= 0) {
            a = Double.parseDouble(IO.readln("Vuelve a ingresar la longitud del lado a:"));
        } else if (b <= 0) {
            b = Double.parseDouble(IO.readln("Vuelve a ingresar la longitud del lado b:"));
        } else if (c <= 0) {
            c = Double.parseDouble(IO.readln("Vuelve a ingresar la longitud del lado c:"));
        }
        }

        if (!((a + b) > c && (b + c) > a && (c + a) > b)) {
            return s = "Es un triangulo imposible";
        } else if (a == b && a == c && b == c) {
            return s = "Es un triangulo equilatero";
        } else if (a != b && a != c && b != c) {
            return s = "Es un triangulo escaleno";
        } else if (a == b && a != c && b != c || a == c && a!=b && c != b || b == c && b != a && a!=c) {
            return s = "Es un triangulo isosceles";
        }
        return s;

    }

    static String angulo(double A, double B, double C) {
        String v = "";
        A = Double.parseDouble(IO.readln("Ingresa el angulo de A: "));
        B = Double.parseDouble(IO.readln("Ingresa el angulo de B: "));
        C = Double.parseDouble(IO.readln("Ingresa el angulo de C: "));

        while (A <= 0 || B <= 0 || C <= 0) {
            if (A <= 0) {
            A = Double.parseDouble(IO.readln("Vuelve a ingresar el angulo A:"));
        } else if (B <= 0) {
            B = Double.parseDouble(IO.readln("Vuelve a ingresar el angulo B:"));
        } else if (C <= 0) {
            C = Double.parseDouble(IO.readln("Vuelve a ingresar el angulo C:"));
        }
        }
        double suma = A + B + C;
        if (suma == 180) {
            if (A < 90 && B < 90 && C < 90) {
                return v = "Es un triangulo acutángulo";
            } else if (A == 90 || B == 90 || C == 90) {
                return v = "Es un triangulo rectangulo";
            } else if (A > 90 || B > 90 || C > 90) {
                return v = "Es un triangulo obtusangulo";
            } 
        }
        return v = "Es un triangulo imposible";
    }
}
