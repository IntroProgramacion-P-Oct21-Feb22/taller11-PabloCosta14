/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author pabloCosta14
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        for (int fila = 0; fila < datos.length; fila++) {
            for (int columna = 0; columna < datos[fila].length; columna++) {
                if (datos[fila][columna] % 2 == 0) {
                    System.out.println(datos[fila][columna]);
                }
            }
        }

    }

}
