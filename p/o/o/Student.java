package p.o.o;

public class Student {
    private int score;
    private int grade;
    
    public Student(int score, int grade){
        this.score=score;
        this.grade=grade;
    }
    public void setScore(int score){
        if (this.score >= 60) {
            System.out.println("El alumno ha aprobado");
        }else{
            System.out.println("El alumno ha suspendido");
        }
    }

    public int gatGrade(int grade){
        System.out.println("El alumno esta en " + this.grade + " grado");
        return grade;
    }
    
}
