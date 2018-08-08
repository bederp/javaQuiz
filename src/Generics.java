public class Generics {
    interface A {}
    interface B extends A {}
    interface C extends B {}

    static class D<T> {}
    static void foo(D<? super B> arg) {}

    public static void main(String[] args) {
        foo(new D<A>());
        foo(new D<B>());
        foo(new D<D>());
        foo(new D());
    }
}
