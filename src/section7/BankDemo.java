package section7;

public class BankDemo {
    public static void main(String[] args) {
        Bank acccount1=new Bank("Amith",10000);
        Bank account2=new Bank("Nagesh");
        acccount1.withdraw(5000);
        account2.deposit(1000);
        acccount1.deposit(-100);
        acccount1.getDetails();
        account2.getDetails();
    }
}
