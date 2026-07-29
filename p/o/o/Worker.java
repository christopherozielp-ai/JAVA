package p.o.o;

public class Worker {
    String name;
    int salary;

    public Worker(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public void mostrarSalario(){
        System.out.println("El salario de " + name + " es de " + salary + " pesos" );
    }

}
