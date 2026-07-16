package com.chris.cursos;

public class Variables {
    public static void main(String[] args){
        //tipos de variables
        String name = "Jevon";
        System.out.println(name);

        name = "Perez";
        System.out.println(name);

        int age = 19;
        System.out.println(age);
        
        /*la variable var permite la inferencia de tipos de datos de variblea locales
        el compilador deduce automaticamente el tipo de datos
        */

        var email = "christopherozielp@gmai.com";
        System.out.println(email); 

        var year = 2026;
        System.out.println(year);
        //constante
        final String  email2 = "Christopheroziel@gmail.com";
        /*email = "[EMAIL_ADDRESS]";
        no se puede cambiar el valor de email ya que es una constante
        esta no se puede cambiar mientras que la variable se puede cambiar muchas veces 
        */
        System.out.println(email);



    }
}
