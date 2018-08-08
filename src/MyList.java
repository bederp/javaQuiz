import java.util.ArrayList;
import java.util.List;

public class MyList {
    List<String> list_1 = new ArrayList<>();
    List<String> list_2 = new ArrayList<>();

    public List<String> method(List<String> list) {
        list.add("a");
        list.add("b");
        return list;
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.list_2 = myList.method(myList.list_1);
        myList.list_1.add("c");
        myList.list_1.add("d");
        System.out.println(myList.list_2);
    }
}
