public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Demo();
        int Add = calculator.add();
        System.out.println(Add);
        int Sub = calculator.sub(20, 10);
        System.out.println(Sub);
        calculator.mul(20, 10);
        calculator.div();
    }
}
