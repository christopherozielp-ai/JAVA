package com.chris.cursos;

public class condicionales {
    public static void main(String[] args){
        //condicionales
        var age = 15;

        //esto se ejuca de manera secuencial
        if (age > 18){
            System.out.println("Eres mayor de adad");
        }
        else if (age == 18){
            System.out.println("Felicidades por cumplir tus 18 años");
        }  // el else-if simepre entre el if y el else
        else{
            System.out.println("Eres menor de edad");
        }
        //switch
        var day = 0;
        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("No es lunes, martes, miercoles,jueve o viernes");
        }
    }
}
