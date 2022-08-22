import java.util.Scanner;

public class Main {
    public void main() {
        int Balance = 10000;
        while (true) {
            System.out.println(" 1.Send\n 2.Receive\n 3.Balance");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the Send Amount");
                int Send = sc.nextInt();
                Balance = Balance - Send;
                System.out.println("successfully Amount Send - " + Send);
            } else if (choice == 2) {
                System.out.println("Enter the Receive Amount");
                int Receive = sc.nextInt();
                Balance = Balance + Receive;
                System.out.println("successfully Amount Received - " + Receive);
            } else if (choice == 3) {
                System.out.println(Balance);
            } else if (choice == 4) {
                System.exit(0);
                System.out.println("Thank you !");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
