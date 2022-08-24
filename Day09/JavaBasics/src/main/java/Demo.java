public class Demo implements Calculator {

    @Override
    public int add() {
        int a = 10;
        int b = 20;
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
        int a = 20;
        int b = 10;
        System.out.println(a / b);
    }
}
