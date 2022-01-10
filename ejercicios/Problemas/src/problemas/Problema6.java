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
public class Problema6 {

    public static void main(String[] args) {

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double resultado;
        double resultado2;
        resultado = mediaAritmetica(informacion);
        resultado2 = valorDesviacion(informacion, resultado);
        System.out.printf("La media aritmetica del arreglo es %.2f\n",
                resultado);
        System.out.printf("EL valor de la desviación estándar es %.2f\n",
                resultado2);
    }

    public static double mediaAritmetica(int[] a) {
        double resultado;
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        resultado = (double) suma / a.length;
        return resultado;
    }

    public static double valorDesviacion(int[] a, double b) {
        double resultado;
        double suma = 0;
        double acumulador;
        double resultado2;
        for (int i = 0; i < a.length; i++) {
            acumulador = (a[i] - b);
            suma = suma + Math.pow(acumulador, 2);

        }
        resultado = suma / a.length;
        resultado2 = Math.sqrt(resultado);
        return resultado2;
    }

}
