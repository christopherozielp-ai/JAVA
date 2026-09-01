package p.o.o;

public class BankAccount {
    /*double balance;
    double amount = 50;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(){
        this.balance+=amount;
        System.out.println("El saldo de la cuenta es: "+balance);       
    }*/
    
    double balance;

    //constructor de la clase
    public BankAccount(double balance){
        this.balance = balance;
    }

    //creacion de metodo set
    public void deposit(double deposit){
        if (deposit > 0) {
            this.balance+=deposit;
            System.out.println("El saldo de la cuenta es: " + balance); 
        } else {
            System.out.println("El deposito no puede ser menor o igual a 0");
        }
    }

    //creacion de metodo withdraw
    public void withdraw(double withdraw){
        if (withdraw > 0 && withdraw <= balance) {
            this.balance-=withdraw;
            System.out.println("El saldo de la cuenta es: " + balance); 
        } else {
            System.out.println("El retiro no puede ser menor o igual a 0");
        }
    }
}
