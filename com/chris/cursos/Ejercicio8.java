package com.chris.cursos;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("--- INTRODUCCIÓN A POO (OBJETOS) ---");

        // ==========================================
        // RETO: Creando tu primer Objeto
        // ==========================================
        // Aquí adentro de main, vamos a darle vida a nuestra plantilla 'Coche'.
        
        // 1. Crea un nuevo Coche llamado 'miAuto' (usa 'new Coche(...)').
        
        // 2. Haz que tu coche arranque llamando al método '.arrancar()'.
        
        // 3. Imprime de qué color es tu coche accediendo a su atributo '.color'.

    }
}

// =========================================================================
// PLANTILLA: Coche (Esto va afuera de la clase Ejercicio8, o en su propio archivo)
// =========================================================================
class Coche {
    // 1. Atributos (Características que tiene el coche)
    String marca;
    String modelo;
    String color;
    int año;

    // 2. Constructor (El "fábrica" que construye el coche cuando usas la palabra 'new')
    public Coche(String marca, String modelo, String color, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    // 3. Métodos (Las acciones que puede hacer el coche)
    public void arrancar() {
        System.out.println("Brrrrm... El " + this.marca + " ha arrancado.");
    }
    
    public void frenar() {
        System.out.println("¡Screeeech! El " + this.marca + " ha frenado.");
    }
}
