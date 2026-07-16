package com.chris.cursos;

public class Operadores {
    public static void main(String[] args){
        
        //operaciones aritmeticas
        var a = 10.75;
        var b = 10.5;
        var c = a+ b;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.err.println(a / b);
        System.err.println(a % b);
        System.err.println(c);
       
        //operadores de asignacion
        a += 3;
        System.out.println(a);

        c += a;
        System.out.println(c);
        
        a -= c;
        System.out.println(a);

        //operadores de comparacion
        System.out.println(a == b);
        System.err.println(a == -21.25);
        //desigualdad
        System.out.println(a != b);

        System.err.println(a > b);
        System.err.println(a >= b);
        System.err.println(a < b);
        System.err.println(a <= b);

        //operadores logicos
        System.err.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(a <= b && b == a);

        // O (or)

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(a <= b || b == a);

        //no (not)
        System.out.println(!true);
        System.out.println(!false);
        
        System.out.println(!(a <= b) || b == a);

        //unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
