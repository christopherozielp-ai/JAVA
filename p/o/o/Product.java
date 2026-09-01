package p.o.o;
import java.util.Scanner;

public class Product {
    /*double producto;
    double descuento;
    

    public Product(double producto, double descuento){
        this.producto = producto;
        this.descuento = descuento;
    }
    public double mostrarDescuento(){
        double precioFinal;
        precioFinal = producto - (producto * descuento /100);
        System.out.println("El precio final es del: " + precioFinal);
        return precioFinal;
    }*/

    double price;

    //constructor
    public Product(double price){
        this.price = price;
    }

    //metodo de set
    public void setPrice(double price){
        Scanner precio = new Scanner(System.in);
        System.out.println("¿Ingresa el precio del producto?");
        double newPrice = precio.nextDouble();
        if (newPrice>0){
            System.out.println("El precio del producto es: " + newPrice);
        } 
        else {
            System.out.println("El precio no puede ser menor o igual a 0");
        }
    }
}
