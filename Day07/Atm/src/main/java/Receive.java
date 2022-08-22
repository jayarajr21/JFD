import java.util.Scanner;

public class Receive {
    public void receive() {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ReceivingAmount ");
        int receive = sc.nextInt();
        receive = balance + receive;
        System.out.println("your money has been Received successfully..");
        System.out.println(receive);
    }
}
