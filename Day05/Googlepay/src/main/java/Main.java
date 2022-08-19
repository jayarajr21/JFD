import java.util.Scanner;

public class Main {
    public void main() {
        System.out.println("1.Receive\n 2.Send\n 3.Balance\n 4.Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Receive receive = new Receive();
                    receive.receive();
                    break;
                case 2:
                    Send send = new Send();
                    send.send();
                    break;
                case 3:
                    Balance balance = new Balance();
                    balance.balance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice is Invalid !!");
            }
        }

    }
}
