public class Calc implements Calculator {


    @Override
    public int add() {
        int a = 3;
        int b = 5;
        return (a + b);

    }

    @Override
    public int sub(int a, int b) {
        return (a - b);
    }

    @Override
    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    @Override
    public void div() {
        int a = 5;
        int b = 5;
        System.out.println(a / b);
    }
}
