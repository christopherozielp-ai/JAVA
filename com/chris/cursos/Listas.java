package com.chris.cursos;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args){
        
        //declaracion y creacion
        ArrayList<String> names = new ArrayList<String>();

        var number = new ArrayList<Integer>();

        //tamaño
        System.out.println(names.size()); 

        //añadir elemntos
        names.add("oziel");
        names.add("perez");
        names.add("martinez");
        System.out.println(names.size());

        //acceder a los elemntos
        System.out.println(names.get(0));// para accedr a un dato en concreto
        System.out.println(names.get(1));
        System.out.println(names.getFirst());// teda el primer datos de la lista
        System.out.println(names.getLast());// teda el ultimo dato de la lista

        //modificar elementos
        names.set(2,"christopher");
        System.out.println(names.getLast());

        //eliminar 
        names.remove(2);
        /*System.out.println(names.get(2));*/

        //buscar elementos
        System.out.println(names.contains("oziel"));
        System.out.println(names.contains("christopher"));

        //limpiar arraylits
        names.clear();
        System.out.println(names.size());
    }
}
