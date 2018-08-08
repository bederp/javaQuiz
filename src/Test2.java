public class Test2 {
    class A {
        int x = 5;
    }

    class B extends A {
        int x = 10;
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        A a = t.new B();
        B b = t.new B();

        System.out.println(a.x);
        System.out.println(b.x);
    }
}


