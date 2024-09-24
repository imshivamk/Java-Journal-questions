import java.util.Scanner;

public class pyq1 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        // will show not set values
        a.showInfo();
        // set the values
        a.setName();
        a.setAccountNumber();
        a.setAccountType();
        a.balance();
        // show info
        a.showInfo();
        a.deposit();
        a.withdraw();
    }
}
        


class BankAccount{

    private double balance;
    private int AccountNumber;
    private  String name;
    private String AccountType;

    Scanner sc = new Scanner(System.in);

    

    public BankAccount(){
        this.balance = 0;
        this.AccountType = "Not set";
        this.name = "Not set";
        this.AccountNumber = 0;
    }

    public void deposit(){
        System.out.println("Enter deposit amount");
        double amount = Integer.valueOf(sc.nextLine());
        this.balance = this.balance + amount;
        System.out.println("Deposited " + amount + " Rs");
        System.out.println("Current balance: " + this.balance);
    }
    public void withdraw(){
        System.out.println("Enter withdrawl amount");
        double amount = Integer.valueOf(sc.nextLine());
        this.balance = this.balance - amount;
        System.out.println("Withdrew " + amount + " Rs");
        System.out.println("Current balance: " + this.balance);
    }

    public void setName(){
        System.out.println("Enter name");
        String name = sc.nextLine();
        this.name = name;
    }
    public void setBalance(){
        System.out.println("Enter balance");
        double balance = Integer.valueOf(sc.nextLine());
        this.balance = balance;
    }
    public void setAccountNumber(){
        System.out.println("Enter acc number");
        int accountNo = Integer.valueOf(sc.nextLine());
        this.AccountNumber = accountNo;
    }
    public void setAccountType(){
        System.out.println("Enter type");
        String type = sc.nextLine();
        this.AccountType = type;
    }

    public void balance(){
        System.out.println("Current balance: " + this.balance);
    }
    public void showInfo(){
        System.out.println("Depositer name: " + this.name);
        System.out.println("Account number: " + this.AccountNumber);
        System.out.println("Account type: " + this.AccountType);
        System.out.println("Current balance: " + this.balance);
    }


}
