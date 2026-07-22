package com.chris.cursos;

public class Ejercicio3 {
    public static void main(String[] args){
        // 1. Concatena dos cadenas de texto.
        var a = "Hola";
        var b = "Oziel";
        System.out.println(a + " " + b);
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(a.length());
        // 3. Muestra el primer y Ãºltimo carÃ¡cter de un string.
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(4));
        // 4. Convierte a mayÃºsculas y minÃºsculas un string.
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(a.contains(b));
        // 6. Formatea un string con un entero.
        System.out.println(String.format("%s soy %s",a,b));
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(" Hola soy Oziel ".trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guiÃ³n (-).
        System.out.println(" Hola soy Oziel " .trim().replace(" ", "-"));
        // 9. Comprueba si dos strings son iguales.
        System.out.println(b.equals(b));
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(a.length() == a.length());
    }
}
