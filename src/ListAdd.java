import java.util.ArrayList;
import java.util.Collections;

public class ListAdd {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Stevan");
        list.add("Test");
        list.add("NewTest");
        list.add("Sometest");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println("Sorted List is --> " + list);

    }
}
