package p.o.o;

public class Employee {

    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percent){
        if (percent < 0) {
            System.out.println("El aumento no puede ser menor o igual a 0");
        }
        else{
            this.salary = salary + (salary * percent / 100);
            System.out.println("El salario se ha aumentado en " + percent + " a " + this.salary);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

