package p.o.o;

import java.util.ArrayList;

public class Personas {

    ArrayList<Persona> lista = new ArrayList<>();
    public void agregarPersona(Persona persona){
        lista.add(persona);
    }
    public void mostrarPersonas(){
        for (Persona p : lista) {
            System.out.println(p.name);
        }
    }
}
