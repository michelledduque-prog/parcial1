package com.example.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("El Gato con Botas", "Antonio Banderas", 5, 1);

        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo:");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese autor:");
        libro2.setAutor(sc.nextLine());

        System.out.println("Numero de ejemplares:");
        libro2.setNumeroEjemplares(sc.nextInt());

        libro2.setNumeroPrestados(0);

        LibroTextoUNIAC libroUNIAC = new LibroTextoUNIAC(
                "El Libro de la Selva",
                "Mowgli",
                10,
                2,
                "Literatura",
                "Facultad de Letras"
        );

        Novela novela = new Novela(
                "Alicia en el País de las Maravillas",
                "El Sobrerero Loco",
                6,
                1,
                "nonsense"
        );

        System.out.println("Prestamo libro1: " + libro1.prestamo());
        System.out.println("Devolucion libro1: " + libro1.devolucion());

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroUNIAC);
        System.out.println(novela);

    }
}