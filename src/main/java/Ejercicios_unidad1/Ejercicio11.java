package Ejercicios_unidad1;

public class Ejercicio11 {
    public static void main(String[] args) {
        double sueldo_base = 1400;
        double venta1 = Double.parseDouble(IO.readln("Ingresa el valor de la venta 1: "));
        double venta2 = Double.parseDouble(IO.readln("Ingresa el valor de la venta 2: "));
        double venta3 = Double.parseDouble(IO.readln("Ingresa el valor de la venta 3: "));
        double ventas = venta1 + venta2 + venta3;
        double comision = ventas*0.10;
        double comisionVenta1 = venta1*0.10;
        double comisionVenta2 = venta2*0.10;
        double comisionVenta3 = venta3*0.10;
        double sueldo_total = sueldo_base + comision;

        System.out.println("Sueldo bruto: " + sueldo_total);
        System.out.println("Comision venta 1: " + comisionVenta1);
        System.out.println("Comision venta 2: " + comisionVenta2);
        System.out.println("Comision venta 3: " + comisionVenta3);
        System.out.println("Comision total: " + comision);
    }
}
