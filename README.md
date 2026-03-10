# Sistema de Biblioteca

Proyecto desarrollado en Java usando Maven.

## Diagrama UML

```mermaid
classDiagram
    class Libro {
        -titulo: String
        -autor: String
        -numeroEjemplares: int
        -numeroPrestados: int
        +Libro()
        +Libro(titulo: String, autor: String, numeroEjemplares: int, numeroPrestados: int)
        +getTitulo(): String
        +setTitulo(titulo: String): void
        +getAutor(): String
        +setAutor(autor: String): void
        +getNumeroEjemplares(): int
        +setNumeroEjemplares(numeroEjemplares: int): void
        +getNumeroPrestados(): int
        +setNumeroPrestados(numeroPrestados: int): void
        +prestamo(): boolean
        +devolucion(): boolean
        +toString(): String
    }

    class LibroTexto {
        -curso: String
        +LibroTexto(titulo: String, autor: String, numeroEjemplares: int, numeroPrestados: int, curso: String)
        +toString(): String
    }

    class LibroTextoUNIAC {
        -facultad: String
        +LibroTextoUNIAC(titulo: String, autor: String, numeroEjemplares: int, numeroPrestados: int, curso: String, facultad: String)
        +toString(): String
    }

    class Novela {
        -tipo: String
        +Novela(titulo: String, autor: String, numeroEjemplares: int, numeroPrestados: int, tipo: String)
        +toString(): String
    }

    LibroTexto --|> Libro
    LibroTextoUNIAC --|> LibroTexto
    Novela --|> Libro
    