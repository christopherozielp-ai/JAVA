package p.o.o;

public class Ejercicio2 {
    public static void main(String[] args){
        // 1. Crea una clase Person con atributos privados name y age. Usa los mÃ©todos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores
        // desde otra clase.
        var persona = new Person ("oziel", 15);
        persona.getName();
        persona.setName("");
        persona.getAge();
        persona.setAge(0);
        // 2. Crea una clase Product con el atributo privado price. AÃ±ade el mÃ©todo
        // setPrice(double price) que solo permita precios mayores a 0.
        var producto = new Product(0.0);
        producto.setPrice(0.0);
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los
        // mÃ©todos deposit(double amount) y withdraw(double amount) que validen las
        // cantidades correctamente.
        var cuenta = new BankAccount(12.56);
        cuenta.deposit(0.0);
        cuenta.withdraw(0.0);
        
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el
        // mÃ©todo getTitle() pero no modificarlo (sin setTitle()). El tÃ­tulo debe
        // asignarse solo por el constructor.
        var libro = new Book("Conde Cero", "William Gibson");
        System.out.println(libro.geyTitle());
        
        // 5. Crea una clase Temperature con el atributo privado celsius. El mÃ©todo
        // setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperatura = new Temperature(10);
        temperatura.setCelsuis(20);

        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los mÃ©todos setUsername(String username), setPassword(String
        // password) y checkPassword(String inputPassword) que compare contraseÃ±as.
        var usuario = new User("oziel", "ozi");
        usuario.setUsername("");
        usuario.setPassword("");
        System.out.println(usuario.checkPassword("ozi"));
        System.out.println(usuario.getUsername());
        System.out.println(usuario.getPassword());

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el mÃ©todo
        // raiseSalary(double percent) que solo permita aumentos positivos.
        var empleado = new Employee(1000.0);
        empleado.raiseSalary(10.0);
        System.out.println(empleado.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega
        // setters y el mÃ©todo calculateArea() que devuelva el resultado de width *
        // height.
        var rectangulo = new Rectangle(1.5, 1.5);
        rectangulo.calcularArea();
        rectangulo.mostrarResultados();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los mÃ©todos
        // setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual
        // a 60.
        var estudiante = new Student(40,5);
        estudiante.setScore(80);
        estudiante.gatGrade(5);
        
        // 10. Crea una clase Car con el atributo privado speed. Agrega los mÃ©todos
        // accelerate(int amount) que aumente la velocidad (mÃ¡ximo 120) y brake(int
        // amount) que reduzca la velocidad (mÃ­nimo 0).
        var carro = new Car("Seat", "Leon", 120);
        carro.accelerate(10);
        carro.brake(10);
        System.out.println("la velocidad del carro es: " + carro.getSpeed());
        carro.showDataCar();
    }
}
