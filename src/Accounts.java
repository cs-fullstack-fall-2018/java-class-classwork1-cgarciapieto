public class Accounts {
    public static void main(String[] args) {
        Account myAccount = new Account("Carlos", 100);
        myAccount.deposit(50);
        System.out.print(myAccount.balance());

    }
}