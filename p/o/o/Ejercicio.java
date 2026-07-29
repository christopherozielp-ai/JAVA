package p.o.o;

public class Ejercicio {
    public static void main(String[] args) {
        
    
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra
        // sus datos.
        // 3. AÃ±ade un constructor a la clase Book que reciba title y author.
        var bookstore = new Book("Neuromante", "William Gibson");
        bookstore.showData();
        // 2. Crea una clase Dog con un mÃ©todo bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();
        // 4. Crea una clase Car con atributos brand y model y un mÃ©todo showData().
        var car = new Car("Toyota","supra");
        car.showDataCar();
        // 5. Crea una clase Student con atributo score y un mÃ©todo que diga si aprobÃ³
        // (mayor o igual a 60).
        var student = new Student(80);
        student.setScore(80);
        // 6. Crea una clase BankAccount con atributo balance y un mÃ©todo deposit() que
        // sume el saldo.
        var bankAccount = new BankAccount(80);
        bankAccount.deposit();
        // 7. Crea una clase Rectangle con mÃ©todos para calcular el Ã¡rea y el perÃ­metro.
        var rectangulos = new Rectangle(12,20);
        rectangulos.mostrarResultados();
        // 8. Crea una clase Worker que reciba nombre y salario, y un mÃ©todo para
        // mostrar su salario.
        var worker = new Worker("oziel", 1500);
        worker.mostrarSalario();
        // 9. Crea varios objetos Person y guÃ¡rdalos en un ArrayList.
        var personas = new Personas();
        personas.agregarPersona(new Persona("oziel",15));
        personas.agregarPersona(new Persona("diego",25));
        personas.agregarPersona(new Persona("carlos",35));
        personas.mostrarPersonas();
        // 10. Crea una clase Product y un mÃ©todo que aplique un descuento sobre su
        // precio.
        var product = new Product(142, 20);
        product.mostrarDescuento();
    }
}
