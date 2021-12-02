package section7;

public class Bank {
   private String owner;
   private int balance;

    public Bank(String owner) {
        this.owner = owner;
        balance=0;
    }

    public Bank(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt){
        if(amt<0) System.out.println("Invalid Please Check Your Balance ....");
        else balance+=amt;
    }

    public void withdraw(int amt){
        if(amt<0 && amt>balance) System.out.println("Invalid Please Check Your Balance .....");
        else balance-=amt;
    }

    public void getDetails(){
        System.out.println(owner+" A/C has "+balance+"$ ");
    }

}
