package com.chris.cursos;

public class Ejercicios2 {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asÃ­gnale tu nombre.
        String name ="Oziel";
        System.out.println("Mi nombre es " + name);
        // 2. Crea una variable de tipo int y asÃ­gnale tu edad.
        int age = 20;
        System.out.println("Mi edad es " + age);
        // 3. Crea una variable double con tu altura en metros.
        double height = 1.75;
        System.out.println("Mido " + height + " metros");
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean programming = true;
        System.out.println("Me gusta programar? " + programming);
        // 5. Declara una constante con tu email.
        final String email = "christopherozielp@gamil.com";
        System.out.println("Mi correo electronico es " + email);
        // 6. Crea una variable de tipo char y guÃ¡rdale tu inicial.
        char inicila = 'O';
        System.out.println("Mi inicial es " + inicila);
        // 7. Declara una variable de tipo String con tu localidad, y a continuaciÃ³n
        // cambia su valor y vuelve a imprimirla.
        String locality = "Mexico";
        System.out.println("Mi localidad es " + locality);
        locality = "monterrey";
        System.out.println("Ahora mi localidad es " + locality);
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 20;
        int suma = a+b;
        System.out.println("la suma de a y b es "+ suma );
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(locality.getClass().getName());
        System.out.println(name.getClass().getName());
        // 10. Intenta declarar una variable sin inicializarla y luego asÃ­gnale un valor
        // antes de imprimirla
        String sindato =null;
        sindato= "alexander";
        System.out.println("Ahora tengo un valor " + sindato);
    }
}
