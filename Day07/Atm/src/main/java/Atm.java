import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        while (true) {
            Atm atm =new Atm();
            Receive receive = new Receive();
            Send  send = new Send();
            Balance balance =new Balance();
            System.out.println("Welcome to Atm");
            System.out.println("1.Login\n 2.Send\n 3.Receive\n 4.Balance\n 5.History\n 6.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    receive.receive();
                    break;
                case 4:
                    balance.balance();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thank you for using Atm ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the correct choice ");
                    break;
            }
        }
    }
}
