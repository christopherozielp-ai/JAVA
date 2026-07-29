package p.o.o;

public class BankAccount {
    double balance;
    double amount = 50;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(){
        this.balance+=amount;
        System.out.println("El saldo de la cuenta es: "+balance);       
    }
}
