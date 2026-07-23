package com.chris.cursos;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args){

        //Declaracion y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //tamaño
        System.out.println(names.size());

        //Añador elementos
        names.put("Oziel", "christopherozielp@gmail.com");
        names.put("perez", "christopherozielp@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //Acceder a los elementos
        System.out.println(names.get("Oziel"));

        //Verificar elemntos
        System.out.println(names.containsKey("Oziel"));
        System.out.println(names.containsKey("pe"));

        System.out.println(names.containsValue("christopherozielp@gmail.com"));

        //Eliminar elementos
        //System.out.println(names.remove("Oziel"));
        System.out.println(names.size());
        System.out.println(names);

        //limpiar el Mapa
        names.clear();
        System.out.println(names);

        //Modificar eleemntos
        names.put("perez", "christopherozielp@gmail.com");
        System.out.println(names);;

        names.put("perez", "oziel@gmail.com");
        System.out.println(names);

        names.replace("oziel", "perez@gmail.com");
        System.out.println(names);

        names.putIfAbsent("martinez", "perez@gmail.com");
        System.out.println(names);

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}
