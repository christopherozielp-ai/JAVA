package com.chris.cursos;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args){
        bienvenida("Oziel");
        System.out.println("El resultado de la resta es " + resta(10, 3)); 
        System.out.println("El resultado del cuadrado es " + calcular(5)); 
        System.out.println("El número 5 " + par_inpar(5)); 
        System.out.println(age(18));
        System.out.println(longi("oziel"));
        medida(new int[]{10, 20, 30});
        System.out.println(medida(new int[]{10, 20, 30}));
        System.out.println(factorial(18));
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Oziel");
        System.out.println(reco(nombres));
    }
    // 1. Crea una funciÃ³n que imprima "Â¡Te doy la bienvenida al curso de Java desde
        // cero!".
    // 2. Escribe una funciÃ³n que reciba un nombre como parÃ¡metro y salude a esa
        // persona.
        public static void bienvenida (String name){
            System.out.println("Hola "+ name  + " Bienvenido al Curso de Java desde Cero");
        }
        
        // 3. Haz un mÃ©todo que reciba dos nÃºmeros enteros y devuelva su resta.
        public static int resta(int num1, int num2){
            return num1 - num2;
        }
        // 4. Crea un mÃ©todo que calcule el cuadrado de un nÃºmero (n * n).
        public static int calcular(int num1){
            return num1 * num1;
        }
        // 5. Escribe una funciÃ³n que reciba un nÃºmero y diga si es par o impar.
        public static String par_inpar(int num1){
            if (num1 % 2 == 0){
                return "Es Par";
            }else {
                return "Es impar";
            }
        }
        // 6. Crea un mÃ©todo que reciba una edad y retorne true si es mayor de edad (y
        // false en caso contrario).
        public static boolean age(int edad){
            if (edad >= 18) {
                return true;
            } else {
                return false;
            }
        }
        // 7. Implementa una funciÃ³n que reciba una cadena y retorne su longitud.
        public static int longi(String texto){
            return texto.length();
        }
        // 8. Crea un mÃ©todo que reciba un array de enteros, calcula su media y lo
        // retorna.
        public static int medida(int[] numeros){
            int suma = 0;
            for (int n : numeros){
                suma = suma +n;
            }
            return suma / numeros.length;
        }
        // 9. Escribe un mÃ©todo que reciba un nÃºmero y retorna su factorial.
        public static int factorial(int num){
            int total = 1;
            for (int f = 1; f <= num; f++){
                total = total * f;
            }
            return total;
        }
        // 10. Crea una funciÃ³n que reciba un ArrayList<String> y lo recorra mostrando
        // cada elemento.
        public static ArrayList<String> reco(ArrayList<String> miLista){
            ArrayList<String> saludosTerminados = new ArrayList<>();
            for (String miLitas : miLista){
                saludosTerminados.add("Hola " + miLitas + " ¿cómo estás?");
        } 
        return saludosTerminados;
    }
}
