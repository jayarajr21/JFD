import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int atmNumber = 12345;
        int pin = 123;
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!");
        System.out.println("Enter the AtmNumber : ");
        int atmnumber = sc.nextInt();
        System.out.println("Enter the Pin : ");
        int Pin = sc.nextInt();
        if ((atmNumber == atmnumber) && (pin == Pin)) {
            System.out.println("Validation Done ");
            while (true) {
                System.out.println("1.Deposit\n 2.Withdraw\n 3.Balance\n 4.Exit");
                System.out.println("Enter the choice");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the depositAmount ");
                        int deposit = sc.nextInt();
                        deposit = balance + deposit;
                        System.out.println("your money has been deposited successfully..");
                        break;
                    case 2:
                        System.out.println("Enter the withdrawAmount ");
                        int withdraw = sc.nextInt();
                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money ");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                        break;
                    case 3:
                        System.out.println("Balance ");
                        break;
                    case 4:
                        System.out.println("Thankyou");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter the correct choice ");
                }
            }
        } else {
            System.out.println("Invalid Atmnumber or Pin !");

        }
    }

}
