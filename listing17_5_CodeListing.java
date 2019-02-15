package lesson17;

public class Lesson17 {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Ande", "Withers", 1234, 1000.40);
        BankAccount ba2 = new BankAccount("Ande", "Withers", 1234, 1000.40);
        BankAccount ba3 = new BankAccount("Ande", "Withers", 1234, 100.40);
        if (ba1.equals(ba2)) {
            System.out.println("ba1 is equal to ba2");
        }
        if (ba1.equals(ba3)) {
            System.out.println("ba1 is equal to ba3");
        }
    }
}

class BankAccount {

    private String fname, lname;
    private double balance;
    private int accountNumber;

    public BankAccount(String fname, String lname, int accountNumber,
            double balance) {
        this.fname = fname;
        this.lname = lname;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean equals(Object obj) {
        BankAccount ba = null;
        if (obj instanceof BankAccount) {
            ba = (BankAccount) obj;
        }
        if (ba != null) {
            if (this.fname == ba.fname && this.lname == ba.lname
                    && this.accountNumber == ba.accountNumber
                    && this.balance == ba.balance) {
                return true;
            }
        }
        return false;
    }
}
