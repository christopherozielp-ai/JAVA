package com.chris.cursos;

public class Cadena_Texto {
    public static void main(String[] args) {

        //cadena de texto
        String name = "oziel";
        var surname = new String("Perez");
        
        //opraciones basicas

        //concatenacion
        System.out.println(name +" "+ surname); //las comillas doble son para poner espacio entre dos textos y la concatenacion sirve para guntar do texto o cod variables

        //longitud (length)
        System.out.println(name.length()); // sirve para la longitud del texto

        //Obtener caracter (charAT)
        System.out.println(name.charAt(4));// sirve para acceder a un caracter en especifico de un cadena de texto

        //subcadena (subString)
        System.out.println(name.substring(2));/*sirve para extraer fragmentos de cadenas de texto esto sirva
        para cunado trabajemos con una parte especifica de una cedena de texto */
        System.out.println(name.substring(1 , 3));
        
        //Mayusculas y Minusculas (toUpperCase/toLowerCase)
        System.out.println(name.toUpperCase());//sirve para cnveir todo el texto en mayusculas
        System.out.println(name.toLowerCase());//sirve para cnveir todo el texto en minusuculas

        //comprobar si contiene
        System.out.println("Hola oziel".toLowerCase().toUpperCase().contains(name));
        //sirve para verficar que contenga una letra o fragmento especifico la cadena de texto
        
        //comparcaion
        System.out.println(name.equals("oziel"));// sirve para la comparcaion de dos textos iguales este comparan el contenido de la variable
        System.out.println(name.equals("Oziel"));
        System.out.println(name.equalsIgnoreCase("Oziel"));// este ignora si el texto esta en mayusculas o minusculas
        
        // == vs equals

        var a ="oziel";
        var b ="oziel";
        var c = new String("oziel");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        //trim
        System.out.println(" Hola me llamo oziel ".trim());

        //replace
        System.out.println("Hola me llamo oziel".replace("oziel", "perez"));

        //format 
        var age = 19;
        var estudi = "programacion web";
        System.out.println(String.format("hola soy %s y tengo %d años y estuido %s", name, age, estudi));
        /*sirve para insertar valores dentor un texto de forma ardenada
        y controlada algo muy util para mensajes personalizados
        */ 
    }
}
