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
 * @author PabloCosta14
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese 1 para calcular el area de un cuadrado\n"
                + "Ingrese 2 "
                + "para calcular el area de un triangulo\nIngrese 3 para "
                + "calcular el "
                + "area de un rectangulo");

        int tipo = entrada.nextInt();
        if (tipo == 1) {
            ObtenerCuadrado();
        } else {
            if (tipo == 2) {
                ObtenerTriangulo();
            } else {
                if (tipo == 3) {
                    ObtenerRectangulo();
                } else {
                    System.out.println("Numero incorrecto");
                }
            }
        }

    }

    public static void ObtenerCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double area_del_cuadrado;
        double lado;

        System.out.println("Ingrese el valor de un lado de un cuadrado para "
                + "calcular su area");
        lado = entrada.nextDouble();

        area_del_cuadrado = lado * lado * lado * lado;
        System.out.printf("El Area del cuadrado es %s\n", area_del_cuadrado);

    }

    public static void ObtenerTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double area_del_triangulo;
        double base;
        double altura;

        System.out.println("Ingrese el valor de la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura = entrada.nextDouble();

        area_del_triangulo = (base * altura) / 2;

        System.out.printf("El Area del triangulo es %s\n", area_del_triangulo);

    }

    public static void ObtenerRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double area_del_rectangulo;
        double base;
        double altura;

        System.out.println("Ingrese el valor de la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura = entrada.nextDouble();

        area_del_rectangulo = base * altura;

        System.out.printf("El Area del rectangulo es %s\n", area_del_rectangulo);
    }
}
