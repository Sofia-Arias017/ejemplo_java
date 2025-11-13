package com.example;

import java.util.Random;
import java.util.Scanner;

import main.java.com.example.ejercicios.Camper;
import main.java.com.example.ejercicios.Factorial;
import main.java.com.example.ejercicios.Trainer;
import main.java.com.example.game.ahorcado.Ahorcado;
import main.java.com.example.bank.BankAccount;
import main.java.com.example.bank.User;

public class Main {

    final static int maxRange = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        var ahoracado = new Ahorcado();
        var factorial = new Factorial();
        var account = new BankAccount();

        while (flag) {
            System.out.println("""
                    ======= MENU PRINCIPAL =======
                    1. Jugar Ahorcado
                    2. Ver palabras adivinadas
                    3. Probar Camper
                    4. Probar Trainer
                    5. Banco
                    6. Registrar Libro
                    0. Salir
                    """);

            int opcion = scan.nextInt();

            switch (opcion) {

                // Opcion 1 - Jugar Ahorcado
                case 1:
                    ahoracado.iniciar("X");
                    ahoracado.ejecutar(scan);
                    break;

                // Opcion 2 - Ver palabras adivinadas
                case 2:
                    System.out.println(ahoracado.palabrasAdivinadas);
                    break;

                // Opcion 3 - Probar Camper
                case 3:
                    Camper camper = new Camper(
                            "Andrues", "Perrea", 16,
                            "TI", "10051234512",
                            "?", "adrian@gmail.com", "12345600"
                    );

                    System.out.println("Telefono inicial: " + camper.telefono);
                    camper.telefono = "018000918080";
                    System.out.println("Telefono actualizado: " + camper.telefono);

                    camper.dormir();
                    camper.divertirse();
                    camper.cambiarNombre("Poncio Zuleta");
                    camper.reportar();
                    camper.calificar();
                    break;

                // Opcion 4 - Probar Trainer
                case 4:
                    Trainer trainer = new Trainer();
                    trainer.nombre = "Adriaaaaann";
                    trainer.apellido = "Nunez";

                    trainer.dormir();
                    trainer.divertirse();
                    trainer.eseniar();
                    trainer.tomacafe();
                    break;

                // Opcion 5 - Banco
                case 5:
                    boolean menuBanco = true;
                    while (menuBanco) {
                        System.out.println("""
                                ======= MENU BANCO =======
                                1. Consignar
                                2. Retirar
                                3. Ver Saldo
                                4. Probar Usuario
                                0. Volver
                                """);

                        int opcionBanco = scan.nextInt();

                        switch (opcionBanco) {
                            case 1:
                                System.out.println("Monto a depositar: ");
                                account.deposit(scan.nextInt());
                                break;
                            case 2:
                                System.out.println("Monto a retirar: ");
                                account.withdraw(scan.nextInt());
                                break;
                            case 3:
                                System.out.println("Saldo: $" + account.showBalance());
                                break;
                            case 4:
                                User user1 = new User();
                                user1.setUsername("sofia");
                                user1.setPassword("1234");

                                boolean resultado = user1.checkPassword("1234");

                                if (resultado) {
                                    System.out.println("Contrasena correcta");
                                } else {
                                    System.out.println("Contrasena incorrecta");
                                }
                                break;
                            case 0:
                                menuBanco = false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;

                // Opcion 6 - Registrar Libro
                case 6:
                    scan.nextLine();
                    System.out.println("Titulo del libro: ");
                    var titulo = scan.nextLine();
                    System.out.println("Autor del libro: ");
                    var autor = scan.nextLine();
                    System.out.println("Anio de publicacion: ");
                    var anio = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Genero: ");
                    var genero = scan.nextLine();
                    System.out.println("Numero de paginas: ");
                    var paginas = scan.nextLine();

                    System.out.println("\n=== INFO DEL LIBRO ===");
                    System.out.println("Titulo: " + titulo);
                    System.out.println("Autor: " + autor);
                    System.out.println("Anio: " + anio);
                    System.out.println("Genero: " + genero);
                    System.out.println("Paginas: " + paginas);
                    System.out.println("=======================");
                    break;

                // Opcion 0 - Salir
                case 0:
                    flag = false;
                    System.out.println("Chao, programa cerrado");
                    break;

                // Opcion invalida
                default:
                    System.out.println("Opcion invalida");
                    scan.nextLine();
                    break;
            }
        }

        scan.close();
    }
}
