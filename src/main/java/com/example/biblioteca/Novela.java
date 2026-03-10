package com.example.biblioteca;

public class Novela extends Libro {

    private String tipo;

    public Novela(String titulo, String autor, int numeroEjemplares,
                  int numeroPrestados, String tipo) {

        super(titulo, autor, numeroEjemplares, numeroPrestados);
        this.tipo = tipo;
    }

    public String toString() {
        return super.toString() + "Tipo:" + tipo;
    }
}