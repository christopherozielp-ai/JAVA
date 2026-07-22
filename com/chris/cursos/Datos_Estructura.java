package com.chris.cursos;

public class Datos_Estructura {
    public static void main(String[] args){

        //Declaracion y creacion
        int[] number = new int[20];
        System.out.println(number);

        String[] name = {"oziel","perez","valente"};
        System.out.println(name);

        //Acceso
        System.out.println(name[0]);

        System.out.println(number[3]);

        //Modificar datos
        number[0] = 12;
        number[1] = 13;
        number[19] = 19;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[19]);

        System.out.println(name[2]);
        name[2] = "weekend";
        System.out.println(name[2]);

        System.out.println(name.length);
        name[2] = null;
        System.out.println(name[2]);
        System.out.println(name.length);

        boolean[]  booleans = new boolean[5];
        System.out.println(booleans[2]);

    }
    
}
