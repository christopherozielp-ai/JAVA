package com.chris.cursos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Bucles {
    public static void main(String[] args) {
        
        //Loops

        //For
        for (int i = 0; i <= 5; i++) {
            System.out.println("HOLA JAVA");
            /*el bucle for es perfecto para tareas 
            de ejecucion de una accion de un numero exacto de veces
            , recorrer elementos de un array o lista,
            aplicar opreraciones secunciales como contar, imprimir, procesar datos */
        }
        String[] names = {"oziel", "perez", "martinez", "mario"};
        for (int index = 0; index < names.length; index++){
            System.out.println(names[index]);
            }
        
        // for-each
        for (String name: names){
            System.out.println(name);
            /* el for-each a diferencia del for se enfoca en que
            quiere recorrer no en como hacerlo lo que lo combierte en una opcion
            perfecta cuando no necesitas procuarte por indicese o posiciones*/
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers){
            System.out.println(numbers);
        }
        HashMap<String, String> emails = new HashMap<>();
        emails.put("oziel", "chrsitopherozielp@gmail.com");
        emails.put("perez", "perez@gmail.com");
        emails.put("mario", "mario@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()){
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        //while

        int index =0;
        while (index < 5) {
            System.out.println("HOLA OZIEL");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find && index < names.length) {
            System.out.println(names[index]);
            if (names[index].equals("juan")){
                find = true;
            }
            index++;
        }

        //do-while
        /* El do-while es único porque SIEMPRE ejecuta su bloque de código 
           por lo menos una vez, incluso si la condición es falsa desde el principio.
           (Analogía: Es como dar el primer bocado a una comida antes de 
           decidir si te gusta y quieres seguir comiendo). */
        do {
            System.out.println("HOLA JAVA");
            index++;
        } while (index < 0);

        //control de bucles
        
        //-break 
        //Al ejecutar el break el bucle se detiene completamente.
        /* (Analogía: Es como tirar del freno de emergencia en un tren. 
           No importa cuántas estaciones falten, el viaje se acaba ahí mismo). */
        for (String name: names){ 
            if (name.equals("oziel")){
                break;
            }
            System.out.println(name);
        }

        //-continue
        /* A diferencia del break, el continue no destruye el bucle, solo salta
           la iteración actual y pasa a la siguiente. 
           (Analogía: Es como escuchar una playlist y darle al botón de "siguiente" 
           cuando suena una canción que no te gusta. La música no se apaga, 
           simplemente pasas a la siguiente pista). */
        for (int i = 0; i < 20; i++) {
            if (i == 8){
                continue;
            }
            System.out.println(i);
        }

    }
}
