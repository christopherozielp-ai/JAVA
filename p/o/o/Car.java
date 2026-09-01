package p.o.o;

public class Car {
    String model;
    String brand;
    private int speed;

    public Car(String model, String brand, int speed){
        this.brand=brand;
        this.model=model;
        this.speed = speed;
    }

    public void showDataCar(){
        System.out.println("La marca de carro es " + model + " y el modelos " + brand);
    }

    public void accelerate(int amount){
        speed += amount;
        if(speed>120){
            speed = 120;
        }
    }
    public void brake(int amount){
        speed -= amount;
        if(speed<0){
            speed = 0;
        }
    }
    public int getSpeed(){
        return speed;
    }
    
}
