package com.chris.cursos;

import java.util.HashSet;

public class Sets {
    public static void main(String[] args){

        //declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //tamaño
        System.out.println(names.size());

        //adañir elementos es igula que la lista
        names.add("oziel");
        names.add("Perez");
        names.add("Martinez");
        System.out.println(names.size());

        //Acceder a los elementos
        System.out.println(names); //imprime los elementos de manera desordanada
        
        //buscar datos
        System.out.println(names.contains("oziel"));// busca los datos mas rapidos y optimas

        System.out.println(names);
        names.add("oziel");
        names.add("oziel");
        names.add("oziel");
        System.out.println(names);

        //eliminar elementos
        names.remove("oziel");
        System.out.println(names);

        //datos conjuntos
        var countries = new HashSet<String>();
        countries.add("Mexico");
        countries.add("Brazil");
        countries.add("Argentina");

        names.addAll(countries);

        System.out.println(names);

        names.removeAll(countries);

        System.out.println(names);

        names.retainAll(countries);

        System.out.println(countries);
    }
}
