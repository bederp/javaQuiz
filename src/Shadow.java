public class Shadow {
    Shadow() {
        this(2);
        System.out.print("s");
    }

    Shadow(int x) {
        System.out.print(x);
    }
}

class Me extends Shadow {
    Me() {
        this("t");
        System.out.print("y");
    }

    Me(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        Me me = new Me();
    }
}
