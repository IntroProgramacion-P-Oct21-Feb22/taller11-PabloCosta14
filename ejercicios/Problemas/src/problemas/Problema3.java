/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensaje;
        double cal1;
        double cal2;
        double cal3;
        double cal4;

        System.out.println("Ingrese la primera calificacion");
        cal1 = entrada.nextDouble();
        System.out.println("Ingrese la segundo calificacion");
        cal2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera calificacion");
        cal3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta calificacion");
        cal4 = entrada.nextDouble();

        mensaje = PromedioCualitativo(cal1, cal2, cal3, cal4);

        System.out.println(mensaje);

    }

    public static String PromedioCualitativo(double a, double b,
            double c, double d) {

        double promedio;

        String resultado = "";
        String cadena;

        promedio = (a + b + c + d) / 4;

        if (promedio >= 0 && promedio <= 5) {
            resultado = "Regular";

        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                resultado = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    resultado = "Muy bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        resultado = "Sobresaliente";
                    }
                }
            }

        }
        cadena = String.format("El promedio de las notas %s,%s,%s,%s es %s ", a, b, c, d, resultado);

        return cadena;
    }
}
