package Ejercicios_unidad1;

public class Ejercicio5 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        System.out.println("\s\s\s\s\s\s\s\s\s\s\s\s |\t\t|\t|");
        System.out.println("\s\s\s\s\s\s\s\s\s\s\s\s |  AND\t|  OR\t|  XOR\t");
        System.out.println("----------------------------------------");
        System.out.println(a +"\s\s" + b + "\t|" + (a&&b) + "\t\s|" + (a||b) + "\t\s|" + (a^b));
        System.out.println(a +"\s\s" + !b + "\t|" + (a&&!b) + "\t\s|" + (a||!b) + "\t\s|" + (a^!b));
        System.out.println(!a +"\s\s" + b + "\t|" + (!a&&b) + "\t\s|" + (!a||b) + "\t\s|" + (!a^b));
        System.out.println(!a +"\s\s" + !b + "\t|" + (!a&&!b) + "\t\s|" + (!a||!b) + "\t\s|" + (!a^!b));
    }
}
