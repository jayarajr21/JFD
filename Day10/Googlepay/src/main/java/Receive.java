import java.util.Scanner;

public class Receive {
    public void receive() {
        System.out.println("Receive the Money");
        Scanner sc = new Scanner(System.in);
        int receive = sc.nextInt();
        int balance = Util.balance;
        Util util = new Util();
        util.operation();
        int newbalance = balance + receive;
        System.out.println(newbalance);
    }
}
