public class Stringer {
    static Person p = new Person("Emma");

    public static void main(String[] args) {
        Person p = new Person("Vera");
        Stringer t = new Stringer();
        t.p = p;
        t.p.change(p);
        System.out.print(p.name + ", ");
        System.out.print(new Stringer().p.name);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void change(Person person) {
        person = new Person("David");
    }
}
