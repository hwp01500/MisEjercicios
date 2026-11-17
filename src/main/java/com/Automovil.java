package com;

import java.awt.Color;
import java.awt.color.*;

public class Automovil {
   protected Color color;
   private int puertas;
   private String combustible;
   private int potencia;

   public static void main(String[] args) {
    Automovil a = new  Automovil();
    a.color = Color.RED;
   }

}

class Prueba {
    public static void main(String[] args) {
        Automovil a = new  Automovil();
        a.color = Color.RED;
    }
}
