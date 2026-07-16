package com.chris.cursos;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        System.out.println("Hola mi nombre es Oziel"); //esta lina de codigo imprime mi nombre

        System.out.println("Hola" + "Mundo"); // es linea de codigo imprime un Hala Mundo por separado  
        /*Este es un comentario de varias lineas */
        System.out.println("Mi edad es "+ 25 + "años y mi color favorito es el negro y vivo en la cuidad de Apodaca");
        /*esta linea de codigo imprime mi edad,
        color favorito y cuidad donde vivo */
        
        System.err.println("Error: No se puede dividir por cero."); //es igual que el anterior pero para errores

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");
        scanner.close();
        System.out.println("Aquí hay un gatito dibujado con texto:");
        System.out.println(" /\\_/\\ ");
        System.out.println("( o.o )");
        System.out.println(" > ^ < ");
    }
}
