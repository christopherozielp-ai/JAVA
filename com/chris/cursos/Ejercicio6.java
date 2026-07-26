package com.chris.cursos;
import java.util.ArrayList;
import java.util.HashMap;
public class Ejercicio6 {
    public static void main(String[] args){
        // 1. Imprime los nÃºmeros del 1 al 10 usando while.
        int num = 1;
        while (num <= 10){
            System.out.println(num);
            num++;
        }
        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var name = new ArrayList<String>();
        name.add("oziel");
        name.add("perez");
        name.add("martinez");
        int i = 0;
        do{
            System.out.println(name.get(i));
            i++;
        }while(i < name.size());
        // 3. Imprime los mÃºltiplos de 5 del 1 al 50 usando for.
        int a =1;
        for(a = 1; a <= 50; a++){
            if(a % 5 == 0){
                System.out.println(a);
            }
        }
        // 4. Recorre un Array de 5 nÃºmeros e imprime la suma total.
        var numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        int suma =0;
        for(Integer n : numbers){
            suma = suma + n;
        }
        System.out.println(numbers);
        System.out.println(suma);
        // 5. Usa un for para re correr un Array y mostrar sus valores.
        int[] arreglo = {10,20,30};
        for (int b = 0; b < arreglo.length; b++){
            System.out.println(arreglo[b]);
        }
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var fruta = new HashMap<String, String>();
        fruta.put("manzana","rojo");
        fruta.put("pera","verde");
        fruta.put("naranja","naranja");
        for(String key: fruta.keySet()){
            System.out.println(key);
            System.out.println(fruta.get(key));
        }
        // 7. Imprime los nÃºmeros del 10 al 1 (descendiente) con un bucle for.
        for(int c = 10; c >=1; c--){
            System.out.println(c);
        }
        // 8. Usa continue para saltar los mÃºltiplos de 3 del 1 al 20.
        for(int d = 1; d <=20; d++){
            if(d % 3 == 0){
                continue;
            }
            System.out.println(d);
        }

        // 9. Usa break para detener un bucle cuando encuentres un nÃºmero negativo en un
        // array.
        var numbersNegativos = new ArrayList<Integer>();
        numbersNegativos.add(5);
        numbersNegativos.add(10);
        numbersNegativos.add(15);
        numbersNegativos.add(20);
        numbersNegativos.add(-25);
        int e = 0;
        while(e < numbersNegativos.size()){
            if(numbersNegativos.get(e) < 0){
                break;
            }
            System.out.println(numbersNegativos.get(e));
            e++;
        }
        // 10. Crea un programa que calcule el factorial de un nÃºmero dado.
        int numero = 5;
        int factorial =1;
        for (int f = 1; f <= numero; f++){
            factorial = factorial * f;
        }
        System.out.println(factorial);
    }
    
}
