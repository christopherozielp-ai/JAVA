package com.chris.cursos;

public class Ejerciocio4 {
    public static void main(String[] args){
         // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).
        var age = 18;
        if (age >= 18){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }
        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.
        var num1 = 10;
        var num2 = 12;
        if (num1 == num2){
            System.out.println("Los dos numeros son iguales");
        }else if (num1 > num2){
            System.out.println(String.format("El numero mayor es %s", num1));
        }else if (num2 > num1){
            System.out.println(String.format("El numero mayor es %s", num2));
        }
        else{
            System.out.println("Los numero no son iguales");
        }
        // 3. Dado un nÃºmero, verifica si es positivo, negativo o cero.
        var num3 =15;
        if (num3 > 0){
            System.out.println("El numero es positivo");
        }else if ( num3 < 0){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es igual a cero");
        }
        // 4. Crea un programa que diga si un nÃºmero es par o impar.
        var num4 = 9;
        if (num4 % 2 == 0){
            System.out.println("Este numero es par");
        }else{
            System.out.println("Este numero es impar");
        }
        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.
        var num5 =2;
        if (num5 >= 1 && num5 <= 100){
            System.out.println("El numero esta entre los rangos aisgnados");
        }else{
            System.out.println("El numero no est en lo rangos asignados");
        }
        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.
        var day = 5;
        switch (day){
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
            case 6:
                System.out.println("Sabado");
            break;
            case 7:
                System.out.println("Domingo");
            break;
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).
        var nota =85;
        if (nota >= 100){
            System.out.println("Sobresaliente");
        }else if (nota <= 70){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspendido");
        }
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.
        var age1 = 14;
        boolean  compañia = true;
        if ( age1 >= 15 || compañia){
            System.out.println("Puedes ingresar al cine");
        }else{
            System.out.println("No puedes ingresar al cine");
        }
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letra = "a";
        switch (letra) {
            case "a":
                System.out.println("Es una vocal");
            break;
            case "e":
                System.out.println("Es una vocal");
            break;
            case "i":
                System.out.println("Es una vocal");
            break;
            case "o":
                System.out.println("Es una vocal");
            break;
            case "u":
                System.out.println("Es una vocal");
            break;
            default:
                System.out.println("Es una consonante");
        }
        // 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.
        var a = 5;
        var b = 9;
        var c = 4;
        if (a > b && a > c){
            System.out.println(String.format("El numero mayor es %d",a));
        }else if (b > a && b >c) {
            System.out.println(String.format("El numero mayor es %d",b));
        }else{
            System.out.println(String.format("El numero mayor es %d",c));
        }
    }
}
