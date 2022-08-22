import java.util.Scanner;

public class Receive {
    public void receive() {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sendAmount ");
        int receive = sc.nextInt();
        receive = balance + receive;
        System.out.println("your money has been deposited successfully..");
        System.out.println(receive);
    }
}
