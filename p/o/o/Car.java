package p.o.o;

public class Car {
    String model;
    String brand;

    public Car(String model, String brand){
        this.brand=brand;
        this.model=model;
    }

    public void showDataCar(){
        System.out.println("La marca de carro es " + model + " y el modelos " + brand);
    }
    
}
