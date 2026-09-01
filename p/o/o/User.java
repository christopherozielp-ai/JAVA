package p.o.o;
import java.util.Scanner;

public class User {

    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username){
        Scanner vaiper = new Scanner(System.in);
        System.out.println("Ingresa tu username");
        this.username = vaiper.nextLine();
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        Scanner vaiper = new Scanner(System.in);
        System.out.println("Ingresa tu password");
        this.password = vaiper.nextLine();
    }

    public String getPassword(){
        return this.password;
    }

    public String checkPassword(String inputPassword){
        if (this.password == inputPassword){
            return "Correcto";
        }else{
            return "Incorrecto";
        }
    }
}
