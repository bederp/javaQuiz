public class MySuper {
    int a = 4;

    public MySuper() {
        myMethod();
    }

    void myMethod() {
        a++;
        System.out.println("y" + a);
    }
}

class MySub extends MySuper {
    int b = 3;

    @Override
    void myMethod() {
        System.out.println("y" + b);
    }

    public static void main(String[] args) {
        MySuper sub = new MySub();
    }
}
