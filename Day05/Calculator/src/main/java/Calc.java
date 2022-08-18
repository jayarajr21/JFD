import java.util.Scanner;

public class Calc {

    void operation() {
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Mod mod = new Mod();
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();
        System.out.print("num1 : ");
        int num1 = sc.nextInt();
        System.out.println("1.Addition " + '\n' + "2.Subtract " + '\n' + "3.Multiplication " + '\n' + "4.Division " + '\n' + "5.Modulus ");
        System.out.print("Enter the choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Addition : ");
               add.newAdd(num ,num1);
                break;
            case 2:
                System.out.print("Subtraction : ");
                sub(num , num1);
                break;
            case 3:
                System.out.print("Multiplication : ");
                mul(num, num1);
                break;
            case 4:
                System.out.print("Division : ");
               div(num, num1);
                break;
            case 5:
                System.out.print("Modulus : ");
                mod(num, num1);
                break;
            default:
                System.out.println("Invalid");
                System.out.print("Your choice is not in list ");
        }
    }
    public void add(int num, int num1) {
        System.out.println(num + num1);
    }
    public void sub(int num, int num1) {
        System.out.println(num - num1);
    }
    public void mul(int num,int num1) {
        System.out.println(num * num1);
    }
    public void div(int num, int num1) {
        System.out.println(num / num1);
    }
    public void mod(int num, int num1) {
        System.out.println(num % num1);
    }
}
