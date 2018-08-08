public class Looped {
    static int x = 8;

    public static void main(String[] args) {
        if (x == x--) {
            x -= 4;
        } else {
            x -=3;
        }
        System.out.println(x++ + ++x + x++);
    }
}
