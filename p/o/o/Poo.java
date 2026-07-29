package p.o.o;

public class Poo {
    public static void main(String[] args) {

        //esto ya es un objeto
        var Personal = new Persona("oziel", 19);

        //le demas datos al objeto que hemos creado
        //tambien se comporta como una variable que puedo estableser un valor y llamarla
        //Personal.name = "oziel";
        //Personal.age = 19;

        //mandamos a llamar el metodo que tiene la clase persona
        Personal.saludo();

        //System.out.println(Personal.name);
        //System.out.println(Personal.age);
    }
}