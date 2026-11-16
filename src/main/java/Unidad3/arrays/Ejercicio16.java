package Unidad3.arrays;

import java.util.Arrays;

public class Ejercicio16 {
    
    static void rellenar(char [][] m, int filaInicial, int columnaInicial, char relleno) {
        char aux = m[filaInicial][columnaInicial];
        m[filaInicial][columnaInicial] = relleno;
        for (int i = filaInicial - 1; i <= filaInicial + 1; i++) {
            for (int j = columnaInicial - 1; j<= columnaInicial + 1; j++) {
                if ((i >= 0 && i < m.length && j >= 0 && j<m.length && m[i][j] == aux)) 
                    rellenar(m,i,j,relleno);
            }
        }
    }

    static long factorial(int n) {
        if (n == 1) 
            return 1;
        else
            return n * factorial(n - 1);
        
    }

    static void imprimirMatriz(char [][] m) {
        for (int i = 0; i<= m.length; i++)
            IO.println(Arrays.deepToString(m));

    }

    public static void main(String[] args) {
        char [][] m= {
            {'#', '*', '*', '*', '*'},
            {'*', '*', '#', '*', '*'},
            {'*', '#', '#', '#', '#'},
            {'*', '*', '*', '*', '*'}
        };
        imprimirMatriz(m);
        rellenar(m, 2, 3, '$');
        IO.println();
        imprimirMatriz(m);
    }
}
