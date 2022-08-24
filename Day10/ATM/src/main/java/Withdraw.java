import java.util.Scanner;

public class Withdraw {
    public void withdraw() {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        int withdraw = sc.nextInt();
        if(withdraw <= balance) {
            System.out.println("Enter the withdraw Amount : ");
            balance = balance - withdraw;
            System.out.println("Please collect your money");
        }
        else {
            System.out.println("Insufficient money");
        }
    }
}
