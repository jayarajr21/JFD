import java.util.Scanner;

public class Automatic {
    void operation() {
        int atmNumber = 12345;
        int pin = 123;
        int balance = 10000;
        Deposit dep = new Deposit();
        Withdraw with = new Withdraw();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AtmNumber : ");
        int atmnumber = sc.nextInt();
        System.out.println("Enter the Pin : ");
        int Pin = sc.nextInt();
        if ((atmNumber == atmnumber) && (pin == Pin)) {
            System.out.println("Validation Done ");
            while (true) {
                System.out.println(" 1.Deposit\n 2.Withdraw\n 3.Balance\n 4.Exit");
                System.out.println("Enter the choice");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        dep.deposit();
                        break;
                    case 2:
                        with.withdraw();
                        break;
                    case 3:
                        System.out.println("Balance = " +balance );
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
