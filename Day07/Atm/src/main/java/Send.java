import java.util.Scanner;

public class Send {
    public void send() {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        int send= sc.nextInt();
        if(send <= balance) {
            System.out.println("Enter the withdraw Amount : ");
            balance = balance - send;
            System.out.println("Please collect your money");
        }
        else {
            System.out.println("Insufficient money");
        }
    }
}
