package p.o.o;

public class Temperature {

    private  int celsius;

    public Temperature(int celsius){
        this.celsius = celsius;
    }

    public int setCelsuis(int celsius){
        if (celsius > -100 && celsius < 100){
            this.celsius = celsius;
        }
        System.out.println("La temperatura es: " + celsius + "°C");
        return celsius;
    }
}
