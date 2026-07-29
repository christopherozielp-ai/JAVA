package p.o.o;

public class Book {
    String title;
    String author;

    public Book (String title, String author){
        this.title=title;
        this.author=author;
    }

    public void showData(){
        System.out.println("El nombre del libro es " + title + " y el autor es " + author );
    }
    
}
