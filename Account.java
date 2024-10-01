import testPackage.A;

public class Account {
    private int accNumber;
    private String ownerName;
    private  int balance;

    public Account(int balance) {
        this.balance = 100;
    }

    public  char getOwnerNameFirstLetter() {
        return ownerName.charAt(0);
    }
}
