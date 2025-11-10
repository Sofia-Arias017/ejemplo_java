package com.example;
import java.util.Random;

import java.util.Scanner;

public class Main {

    // Variables fuera de métodos deben ser estáticas si se usan en main
    // static String saludo = "Hello World";
    // public static float ohNoRayos = 0.5f;
    // public static final int DIAS_SEMANALES = 7;

    // public static void main(String[] args) {

    //     // Declaramos variables
    //     int numero = 100;
    //     long otroNumero = 10L;
    //     boolean bandera = true;
    //     float decimal = 0.5f;
    //     double decimalPro = 0.5;
    //     char caracter = 'A';

    //     // Llamamos variables
    //     System.out.println(saludo);
    //     System.out.println(numero);
    //     System.out.println(otroNumero);
    //     System.out.println(bandera);
    //     System.out.println(decimal);
    //     System.out.println(decimalPro);
    //     System.out.println(caracter);

    //     // ARRAY
    //     System.out.println("Tipos referencias");

    //     int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    //     System.out.println(numeros[0]);
    //     System.out.println(numeros[1]);
    //     System.out.println(numeros[2]);
    //     System.out.println(numeros[3]);
    //     System.out.println(saludo);

    //     // Constante
    //     final int xdex = 0;
    //     System.out.println(xdex);

    //     main2(args); // Llamado al segundo método
    // }

    // // MATEMÁTICAS
    // public static void main2(String[] args) {
    //     System.out.println(1 + 2);
    //     System.out.println(1 - 2);
    //     System.out.println(1 * 2);
    //     System.out.println(1 / 2);
    //     System.out.println(10 % 2);

    //     // Math.pow necesita 2 argumentos
    //     System.out.println(Math.pow(2, 3)); // 2^3 = 8

    //     // Llamado a circunferencia
    //     System.out.println("Circunferencia: " + circunferencia(30));

    //     // Ejercicio actividades
    //     int dia = 5;
    //     actividades(dia);
    //     actividades(++dia);
    //     actividades(dia++);
    //     actividades(dia);
    // }

    // public static double circunferencia(int diametro) {
    //     return 2 * Math.PI * diametro;
    // }

    // public static void actividades(int dia) {
    //     String[] cosasPorHacer = {
    //         "Hacer modulos ingles", 
    //         "Venir a campus", 
    //         "Irme de campus", 
    //         "Dormir",
    //         "Ser feliz", 
    //         "Repasar Java :(", 
    //         "No volver a Campus"
    //     };

    //     System.out.println("¿Qué nos toca hacer HOY?");

    //     if (dia >= 7) {
    //         System.out.println("Bye!");
    //     } else {
    //         System.out.println(cosasPorHacer[dia]);
    //         System.out.println("Día: " + dia);
    //     }
    // }
    

    // public class Main {
    //     final static int maxRange = 10000;
    //     public static void main(String[] args) {
    //         Scanner scan = new Scanner(System.in);
    //         Random random = new Random();
    //         System.out.println("Ingrese el valor minimo: ");
    //         var min = scan.nextInt();
    //         System.out.println("Ingrese el valor minimo: ");
    //         var max = scan.nextInt();
    //         int [] numbers = new int [maxRange];
    //         for (int a=0; a< numbers.length; a++) {
    //             numbers[a] = random.nextInt(min, max+1);
    //         }
    //         system.out.println("Ingrese la cantidad de numeros a buscar: ");
    //         var counter = scan.nextInt();
    //         for( int a=0; a < counter; a++) {
    //             system.out.println("Ingrese el indice a buscar [ 1hasta + "+maxRange+"]: " );
    //             var index =scan.nextInt();
    //             system.out.println("Oye el indice es: " + (index) + " = " + numbers[index -1] );
                
    //         }
    //         scan.close();
    // }
    // }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro: " );
        var titulo = scan.nextLine();
        System.out.println("Ingrese el autor del libro: " );
        var autor = scan.nextLine();
        System.out.println("Ingrese el anio de la publicacion: " );
        var anio = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el genero del libro: " );
        var genero = scan.nextLine();
        System.out.println("Ingrese el numero de paginas: " );
        var paginas = scan.nextLine();

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Anio de publicacion: " + anio);
        System.out.println("Genero del libro: " + genero);
        System.out.println("Numero de paginas: " + paginas);
         scan.close();
    }
}