import java.util.Scanner;

public class Send {
    public void send() {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  SendingAmount : ");
        int send= sc.nextInt();
        if(send <= balance) {
            balance = balance - send;
            System.out.println("your money has been Send successfully");
        }
        else {
            System.out.println("Insufficient money");
        }
    }
}
