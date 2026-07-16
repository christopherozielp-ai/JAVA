package com.chris.cursos;

public class Ejercicios3 {
    public static void main(String[] args) {
       // 1. Crea una variable con el resultado de cada operaciÃ³n aritmÃ©tica.
        var a = 10;
        var b = 5;
        var sum = (b * a)+ b - a;
        System.out.println(sum);
        // 2. Crea una variable para cada tipo de operaciÃ³n de asignaciÃ³n.
        var c = 10; 
        var d = 5;
        c += a;
        System.out.println(a);
        a -=b;
        System.out.println(b);
        b += d;
        System.out.println(d);
        d += 50;
        System.out.println(d);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de
        // comparaciÃ³n.
        System.out.println(c == a);
        System.out.println(b >= d);
        System.out.println(d != b);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparaciÃ³n.
        System.out.println(a == b);
        System.out.println(d != a);
        System.out.println(c == d);
        // 5. Utiliza el operador lÃ³gico and.
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && true);
        // 6. Utiliza el operador lÃ³gico or.
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        // 7. Combina ambos operadores lÃ³gicos.
        System.out.println(true == false);
        System.out.println((false ||  true) && true);
        System.out.println(false || false);
        // 8. AÃ±ade alguna negaciÃ³n.
        System.out.println(!true && false);
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(b++);
        System.out.println(--b);
        System.out.println(+a);
        // 10. Combina operadores aritmÃ©ticos, de comparaciÃ³n y lÃ³gicos.
        var num1 = 20;
        var num2 = 25;
        var sum2 = (num1 + num2) / a * b + d / c;
        System.out.println(sum2 == num2 && num1 < num2); 
    }
    
}
