import java.util.Scanner;

public class Deposit {
    public int deposit() {
        int balance = 10000;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the depositAmount ");
        int deposit = sc.nextInt();
        deposit = balance + deposit;
        System.out.println("your money has been deposited successfully..");
        System.out.println(deposit);
        return deposit;
    }
}
