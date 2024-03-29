package ordenamiento;

import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {

        Insercion in = new Insercion();
        Mezcla me = new Mezcla();

        System.out.println("             ==================================================");
        System.out.println("                                                               ");
        System.out.println("                         Analisis de ORdenamiento              ");
        System.out.println("                                                               ");
        System.out.println("                        Por:                                   ");
        System.out.println("                        -> Almeida Palacios Anibal Moises      ");
        System.out.println("                        -> Barcia Molina Jose Fransico         ");
        System.out.println("                        -> Intriego Zambrano Leo Sebastián     ");
        System.out.println("                        -> Zambrano Alava Tito Daniel          ");
        System.out.println("                                                               ");
        System.out.println("             ==================================================");

        System.out.println("\033[32m========================================================================");
        System.out.println("INGRESE TAMAÑO DEL ARREGLO");
        Scanner sc = new Scanner(System.in);

        int nu = sc.nextInt();

        int[] numeros = new int[nu];

        in.InsertoArreglo(numeros);
        me.InsertoArreglo(numeros);

        // int aleatorio = (int) (Math.random() * 100) + 1;
        for (int x = 0; x < numeros.length; x++)
            numeros[x] = (int) (Math.random() * 100) + 1;

        System.out.println("El tamaño de el arreglo es de " + numeros.length);
        System.out.println("\033[32m========================================================================");

        System.out.println("EL Arreglo es ingreso aleatorio :");
        for (int i : numeros) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println("\033[32m========================================================================");

        System.out.println("INICIO DE ORDENAMIENTO A TRAVES DE HILO");

        in.start();
        me.start();

        sc.close();
    }
}
