import java.util.ArrayList;

public class TestSampleMap {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Stevan");
        list.add("Tester");
        list.add("Mobiquity");

        //System.out.println("List of elements in the current array are : "+list);
        //System.out.println("Access the third index "+list.get(1));


        for (String listName : list) {
            System.out.println(listName);
        }
    }
}
