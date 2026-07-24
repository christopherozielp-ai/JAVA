package com.chris.cursos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        var names = new ArrayList<String>();
        names.add("oziel");
        names.add("perez");
        names.add("martinez");
        names.add("chrsitopherozielp@gmaul.com");
        names.add("Curso de java");
        System.out.println(names.size());
        // 2. Modifica uno de los valores del Array e imprime el valor del Ã­ndice antes
        // y despuÃ©s de modificarlo.
        System.out.println(names);
        names.set(1, "chrsitopher");
        System.out.println(names);
        // 3. Crea un ArrayList vacÃ­o.
        var numbers = new ArrayList<String>();
        // 4. AÃ±ade 4 valores al ArrayList y elimina uno a continuaciÃ³n.
        numbers.add("hola");
        numbers.add("como");
        numbers.add("estas");
        numbers.add("tu");
        numbers.remove(0);
        System.out.println(numbers.size());
        System.out.println(numbers);
        // 5. Crea un HashSet con 2 valores diferentes.
        var frutas = new HashSet<String>();
        frutas.add("manzana");
        frutas.add("platano");
        // 6. AÃ±ade un nuevo valor repetido y otro sin repetir al HashSet.
        frutas.add("manzana");
        frutas.add("pera");
        // 7. Elimina uno de los elementos del HashSet.
        frutas.remove("manzana");
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el nÃºmero de
        // telÃ©fono. AÃ±ade tres contactos.
        var telefono = new HashMap<String, String>();
        telefono.put("8126955264", "oziel");
        telefono.put("8133812345", "perez");
        telefono.put("8122667788", "mario");
        System.out.println(telefono.size());
        System.out.println(telefono);
        // 9. Modifica uno de los contactos y elimina otro.
        telefono.replace("8133812345", "christopher");
        telefono.remove("8126955264");
        System.out.println(telefono.size());
        System.out.println(telefono);
        // 10. Dado un Array, transfÃ³rmalo en un ArrayList, a continuaciÃ³n en un HashSet
        // y finalmente en un HashMap con clave y valor iguales.
        String[] lenguajes = {"Java", "Python", "JavaScript"};
        var miLista = new ArrayList<>(List.of(lenguajes));
        System.out.println(miLista);
        var miSet = new HashSet<>(miLista);
        System.out.println(miSet);
        var miMapa = new HashMap<String, String>();
        for (String lenguaje : miSet) {
            miMapa.put(lenguaje, lenguaje);
        }
        System.out.println(miMapa);
    }
}
