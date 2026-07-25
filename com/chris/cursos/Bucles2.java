package com.chris.cursos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles2 {
    public static void main(String[] args) {
        
        System.out.println("--- 10 RETOS DE PROGRAMACIÓN ---");

        // ==========================================
        // RETO 1: El saltarín
        // ==========================================
        // Usa un bucle 'for' para imprimir los números del 1 al 20.
        // Pero, si el número es múltiplo de 3 (número % 3 == 0), usa 'continue' para saltarlo.
        System.out.println("\nReto 1:");
        // Tu código aquí...
        int i = 0;
        for (i = 0; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

        // ==========================================
        // RETO 2: Búsqueda implacable
        // ==========================================
        // Tienes el siguiente arreglo de nombres.
        String[] sospechosos = {"Carlos", "Ana", "Pedro", "Juan", "Maria"};
        // Usa un bucle 'for' o 'while' para buscar a "Juan".
        // Cuando lo encuentres, imprime "¡Te encontré Juan!" y usa 'break' para detener la búsqueda.
        System.out.println("\nReto 2:");
        // Tu código aquí...
        for (String sospechoso : sospechosos) {
            if (sospechoso.equals("Juan")) {
                System.out.println("Te encontre Juan");
                break; // Detiene el bucle por completo al instante
            }
            System.out.println(sospechoso);
        }
        // ==========================================
        // RETO 3: Mayoría de edad
        // ==========================================
        // Crea un ArrayList de enteros (Integer) con las siguientes edades: 15, 20, 18, 12, 35, 8.
        // Usa un 'for-each' para recorrer la lista e imprimir SOLO las edades que sean mayores o iguales a 18.
        System.out.println("\nReto 3:");
        // Tu código aquí...
        var numbers = new ArrayList<Integer>();
        numbers.add(15);
        numbers.add(20);
        numbers.add(18);
        numbers.add(12);
        numbers.add(35);
        numbers.add(8);
        for (Integer n : numbers){
            if (n >= 18){
                System.out.println(n);
            }
        }
        // ==========================================
        // RETO 4: El menú persistente
        // ==========================================
        // Usa un bucle 'do-while' para simular un menú.
        // Crea una variable 'opcion' inicializada en 0. 
        // Dentro del bucle, imprime "1. Jugar | 2. Pausa | 3. Salir" y luego cambia 'opcion' a 3.
        // El bucle debe repetirse mientras la opción sea diferente de 3 (!= 3).
        System.out.println("\nReto 4:");
        // Tu código aquí...
        int opcion = 0;
        do {
            System.out.println("1. Jugar | 2. Pausa | 3. Salir");
            opcion = 3;
        }while(opcion !=3);

        // ==========================================
        // RETO 5: El filtro mágico (HashSet)
        // ==========================================
        // Crea un arreglo de Strings con palabras repetidas: {"manzana", "pera", "manzana", "uva", "pera"}
        // Crea un HashSet vacío.
        // Usa un bucle para pasar todos los elementos del arreglo al HashSet.
        // Finalmente imprime el HashSet. ¡Observa cómo desaparecen los duplicados por arte de magia!
        System.out.println("\nReto 5:");
        // Tu código aquí...
        String[] palabras = {"manzana", "pera", "manzana", "uva", "pera"};
        var Pa_repetidas = new HashSet<String>();
        for (String palabra : palabras){
            Pa_repetidas.add(palabra);
        }
        System.out.println(Pa_repetidas);
        // ==========================================
        // RETO 6: Calificaciones (HashMap)
        // ==========================================
        // Crea un HashMap donde la Clave sea el nombre del alumno (String) y el Valor su calificación (Integer).
        // Agrega 3 alumnos (ej. Ana: 85, Beto: 60, Carla: 100).
        // Usa un 'for-each' con '.entrySet()' para recorrer el mapa.
        // Imprime solo los nombres de los alumnos que aprobaron (calificación >= 70).
        System.out.println("\nReto 6:");
        // Tu código aquí...
        var name = new HashMap<String, Integer>();
        name.put("Ana", 85);
        name.put("Beto", 60);
        name.put("Carla", 100);

        for (String nombre: name.keySet()) {
            if (name.get(nombre) >= 70){ 
                System.out.println(nombre);
            }
        }

        // ==========================================
        // RETO 7: Contador de Vocales
        // ==========================================
        // Tienes la palabra: String frase = "programacion";
        // Usa un bucle 'for' clásico para recorrer cada letra de la palabra (usando .length() y .charAt(i)).
        // Cuenta y muestra cuántas letras 'a' tiene la palabra.
        System.out.println("\nReto 7:");
        // Tu código aquí...
        String frase = "programacion";
        int contador = 0;
        for (int a = 0; a < frase.length(); a++) {
            if (frase.charAt(a) == 'a') {
                contador++;
            }
        }
        System.out.println(contador);

        // ==========================================
        // RETO 8: El número más grande
        // ==========================================
        // Crea un ArrayList de números: 45, 12, 89, 33, 99, 5.
        // Crea una variable 'maximo' inicializada en 0.
        // Usa un bucle para recorrer el ArrayList y, con un 'if', actualiza 'maximo' cada vez que encuentres un número mayor al que ya tienes.
        // Al final, imprime el número más grande.
        System.out.println("\nReto 8:");
        // Tu código aquí...
        int maximo = 0;
        var num = new ArrayList<Integer>();
        num.add(45);
        num.add(12);
        num.add(89);
        num.add(33);
        num.add(99);
        num.add(5);
        for (Integer n : num){
            if(n > maximo){
                maximo = n;
            }
        }
        System.out.println(maximo);


        // ==========================================
        // RETO 9: Texto al revés
        // ==========================================
        // Tienes el texto: String palabra = "JAVA";
        // Crea un bucle 'for' que empiece en la última posición (palabra.length() - 1) y vaya retrocediendo (i--).
        // Imprime cada letra (con System.out.print) para que la palabra se lea al revés ("AVAJ").
        System.out.println("\nReto 9:");
        // Tu código aquí...
        String palabra = "JAVA";
        for (int a = palabra.length() - 1; a >= 0; a--) {
            System.out.print(palabra.charAt(a));
        }
        System.out.println("");
        // ==========================================
        // RETO 10: Suma controlada
        // ==========================================
        // Crea un bucle 'while' que vaya sumando números consecutivos (1 + 2 + 3 + 4...).
        // Detén el bucle (usando la condición del while o un break) cuando la suma total supere el número 50.
        // Imprime el valor final de la suma y el último número que tuviste que sumar.
        System.out.println("\nReto 10:");
        // Tu código aquí...
        int num1 = 1;
        int sum =0;
        while (sum <= 50){
            sum = sum + num1;
            num1++;
        }
        System.out.println(sum);
        System.out.println(num1-1);
    }
}
