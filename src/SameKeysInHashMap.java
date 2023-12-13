import java.util.HashMap;

public class SameKeysInHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");


        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "C");
        map2.put(1, "A");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1, "J");
        map3.put(2, "i");
        map3.put(3, "k");
        map3.put(4, "l");


        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");


        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));
        System.out.println(map1.keySet().equals(map4.keySet()));

    }

}
