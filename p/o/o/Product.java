package p.o.o;

public class Product {
    double producto;
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
    }
    
}
