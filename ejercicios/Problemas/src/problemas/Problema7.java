/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {

        String[] resultado = arregloCadenas();
        arregloCaracteres(resultado);

    }

    public static String[] arregloCadenas() {
        Scanner entrada = new Scanner(System.in);
        int valor;
        String p;
        String d;
        System.out.println("Ingrese el numero de elementos del arreglo");
        valor = entrada.nextInt();
        String[] arregloResultante = new String[valor];

        for (int i = 0; i < valor; i++) {
            System.out.println("Ingrese una ciudad del Ecuador");

            d = entrada.nextLine();

            arregloResultante[i] = d;
            entrada.nextLine();

        }
        return arregloResultante;
    }

    public static void arregloCaracteres(String[] a) {

        for (int i = 0; i < a.length; i++) {

            if (a[i].length() == 4 || a[i].length() == 5) {
                System.out.printf("valores del arreglo que tengan 4 0 5 "
                        + "caracteres es %s\n", a[i]);
            }
        }
    }
}
