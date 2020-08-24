
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
       Account test=new Account("Matthews account", 1000);
       Account test2=new Account("My account", 0);
       test.withdrawal(100.0);
       test2.deposit(100.0);
        System.out.println(test);
        System.out.println(test2);
    }
}
