package p.o.o;
import java.util.Scanner;

public class Person {

    private String name ;
    private int age;

    //constructo de la clase
    public Person(String name, int age){
        this.name = name;
        this.age = age; 
    }

    //metodo para acceder a name
    public String getName(){
        System.out.println("Tu nombre es : " + name);
        return name;
    }

    //metod para modificar name 
    public void setName(String name){
        Scanner vaiper  = new Scanner(System.in);
        System.out.println("¿Quieres cambiar tu nombre? si o no");
        String respuesta = vaiper.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿Cual es tu nuevo nombre?");
            this.name = vaiper.nextLine();
        }
        System.out.println("Tu nombre es : " + this.name);
    }

    //metodo para acceder a age
    public int getAge(){
        System.out.println("Tu edad es : " + age + " años");
        return age;
    }

    //metodo para modificar age
    public void setAge(int age){
        Scanner vaiper = new Scanner(System.in);
        System.out.println("¿Quieres cambiar tu edad? si o no");
        String respuesta = vaiper.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿Cual es tu nueva edad?");
            this.age = vaiper.nextInt();
        }
        System.out.println("Tu edad es : " + this.age);
    }
}
