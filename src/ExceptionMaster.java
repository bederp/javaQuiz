public class ExceptionMaster {
    public static void main(String[] args) {
        try {
            int a[] = {1, 2, 3, 4, 5};
            for (int i = 0; i < 4; i++) {
                System.out.println("a[" + i + "]=" + a[i] + "n");
            }
        } catch (Exception e) {
            System.out.println("error = " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
