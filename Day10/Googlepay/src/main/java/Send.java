import java.util.Scanner;

public class Send {
   public void send() {
       System.out.println("Sent the Money");
       Scanner sc = new Scanner(System.in);
       int send = sc.nextInt();
       int balance = Util.balance;
       Util util = new Util();
       util.operation();
       int newbalance = balance - send;
       if(send <= balance) {
           System.out.println(newbalance);
       }
       else {
           System.out.println("Insufficient balance");
       }
   }
}
