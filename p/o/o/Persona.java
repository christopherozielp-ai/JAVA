package p.o.o;

public class Persona {
    
    //atributos
    String name ;
    int age ;

    //constructor de clase
    public Persona(String name,int age){
        this.name=name;
        this.age=age;
    }
    //Metodos
    public void saludo(){
        System.out.println(" Hola soy " + name + " y tengo " + age + " años " );
    }

}
