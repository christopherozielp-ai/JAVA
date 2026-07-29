package p.o.o;

public class Rectangle {
    //area
    double area;
    double base;
    //perimetro
    double perimetro;
    double altura;

    public Rectangle (double  base, double  altura){
        this.base=base;
        this.altura=altura;
    }
    public double calcularArea(){
        area = base *altura;
        return area;
    }
    public double calcularPerimetro(){
        perimetro = 2 *(base + altura);
        return  perimetro;
    }
    public void mostrarResultados(){
        System.out.println("el area del rectangulo es: "+calcularArea());
        System.out.println("el perimetro del rectangulo es: "+calcularPerimetro());
    }
}

