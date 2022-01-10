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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int var;
        System.out.println("Ingrese 1 para calcular el valor de la luz\nIngrese "
                + "2 para calcular el predio");
        var = entrada.nextInt();
        if (var == 1) {
            calcularValorLuz();

        } else {
            if (var == 2) {
                calcularPredio();
            }
        }

    }

    public static void calcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double valorK;
        double valorKM;
        double resultado;

        System.out.println("Ingrese su nombre completo");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el valor del kilowatio");
        valorK = entrada.nextDouble();
        System.out.println("Ingrese el valor de kilowatios del mes");
        valorKM = entrada.nextDouble();

        resultado = valorK * valorKM;

        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de "
                + " %s\n", nombre, cedula, resultado);

    }

    public static void calcularPredio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double valorinmueble;

        double resultado;

        System.out.println("Ingrese su nombre completo");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el valor del inmueble");
        valorinmueble = entrada.nextDouble();

        resultado = (valorinmueble * 2) / 100;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en %s y tiene que pagar un predio de "
                + " %s\n", nombre, cedula, valorinmueble, resultado);
    }

}
