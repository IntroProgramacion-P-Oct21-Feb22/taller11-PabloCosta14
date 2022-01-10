/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author PabloCosta14
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int resultado;
        resultado = SumaArreglo(informacion);
        System.out.println(resultado);
    }

    public static int SumaArreglo(int[][] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            for (int c = 0; c < a[i].length; c++) {
                suma = suma + a[i][c];
            }

        }

        return suma;
    }
}
