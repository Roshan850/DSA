import java.util.Scanner;

class Bank {
    private String Name;
    private int AccNo;
    private String TypeOfAcc;
    private float Balance, deposit;

    Scanner sc = new Scanner(System.in);

    public void readdata() {
        System.out.print("Enter the name of the dipositor:");
        Name = sc.nextLine();

        System.out.print("Enter the name of the account number:");
        AccNo = sc.nextInt();

        System.out.print("Type of account:");
        TypeOfAcc = sc.nextLine();
        System.out.print("Enter Balance:");
        Balance = sc.nextFloat();
        Balance = deposit(Balance);
        withdraw();

    }

    public void display() {
        System.out.println("Name:" + Name);
        System.out.println("Account number:" + Name);
        System.out.println("Type of account:" + Name);
        System.out.println("Current Balance:" + Name);
    }

    public float deposit(float Balance) {
        System.out.println("Enter the deposit money :");
        deposit = sc.nextFloat();
        Balance += deposit;
        return Balance;

    }

    public void withdraw() {
        float w;
        System.out.print("Enter the Withdraw money amount:");
        w = sc.nextFloat();
        if (Balance - w > 1000) {
            System.out.print("Minimum Balance");

        } else {
            Balance = Balance - w;
        }

    }

}

public class Main{
    public static void main(String args[]) {
        Bank b=new Bank();
        b.readdata();
        b.display();

    }

}