public class MyException {
    int[] arrayInt = new int[8];
    int nr = 3;

    public void myMethod(int i, int i2) {
        try {
            arrayInt[i] = i2;
            nr = i / i2;
            System.out.print("s");
        } catch (ArithmeticException e) {
            System.out.print("t");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("x");
        }
    }

    public static void main(String[] args) {
        MyException e = new MyException();
        e.myMethod(8,0);
        e.myMethod(7,0);
    }
}
