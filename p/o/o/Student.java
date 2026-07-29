package p.o.o;

public class Student {
    int score;
    
    public Student(int score){
        this.score=score;
    }
    public void setScore(int score){
        if (this.score >= 60) {
            System.out.println("El alumno ha aprobado");
        }else{
            System.out.println("El alumno ha suspendido");
        }
    }
    
}
