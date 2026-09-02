package p.o.o;

public class Herencia {
    public static void main(String[] args){

        // Instanciamos la clase padre 'Animal'
        var animal = new Animal("polar");
        //animal.name="manolo";
        animal.eat();

        // 'Dog' hereda de 'Animal', por lo que tiene el método eat(), pero sobreescrito (modificado)
        var dog = new Dog("rex", 3);
        //dog.name="polar";
        dog.eat();

        // 'Cat' también hereda de 'Animal', pero no sobreescribe eat(), así que usa el del padre
        var cat = new Cat("misif");
        //cat.name="gordo";
        cat.eat();

        // 'Brid' (Pájaro) hereda de 'Animal', y además tiene su propio método exclusivo: fly()
        var bird = new Brid("piolin");
        //bird.name="pajarito";
        bird.eat(); // Heredado de Animal
        bird.fly(); // Método propio de Brid
    }

    // Clase padre o superclase
    public static class Animal {

        String name;

        // Constructor de la clase padre
        public Animal(String name){
            this.name = name;
        }

        // Método genérico para todos los animales
        public void eat(){
            System.out.println(name + " esta comiendo");
        }
    }

    // La palabra clave 'extends' indica que 'Dog' hereda de 'Animal'
    public static class Dog extends Animal{

        int age;

        // Constructor de la clase hija
        public Dog(String name, int age){
            super(name); // Llama al constructor de la clase padre (Animal) para inicializar 'name'
            this.age = age;
        }

        // '@Override' indica que estamos sobreescribiendo (modificando) el comportamiento heredado
        @Override
         public void eat(){
            System.out.println("El perro " + name + " esta comiendo");
        }
    }

    // 'Cat' hereda de 'Animal' pero no añade atributos ni métodos nuevos, solo usa los del padre
    public static class Cat extends Animal{

        public Cat(String name){
            super(name); // Llama al constructor del padre
        }

    }

    // 'Brid' hereda de 'Animal' y añade comportamiento nuevo
    public static class Brid extends Animal{

         public Brid(String name){
            super(name);
        }

        // Método que solo existe en esta clase (un perro o gato no pueden volar)
        public void fly(){
            System.out.println(name + " esta volando");
        }
    }
}
