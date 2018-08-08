interface A {
    int x = 3;

    int myMethod();
}

interface B extends A {
    int x = 7;
}

public class Test implements B{
    int x = 5;

    @Override
    public int myMethod() {
        return x;
    }

    public static void main(String[] args) {
        A a = new Test();
        B b = new Test();
        Test tst = new Test();
        System.out.print(tst.x);
        System.out.print(B.x);
        System.out.print(A.x);
        System.out.print(tst.myMethod());
        System.out.print(b.myMethod());
        System.out.print(a.myMethod());
    }
}
