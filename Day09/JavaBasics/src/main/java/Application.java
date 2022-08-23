import java.io.ObjectInputStream;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calc();
        int Add = calculator.add();
        System.out.println(Add);
        int Sub = calculator.sub(3,1);


    }
}
