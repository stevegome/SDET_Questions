import java.util.HashSet;

class duplicateItemsSet {
    public static void main(String[] args) {

        // create HashSet 
        HashSet<String> animals = new HashSet<>();

        // add elements
        animals.add("tiger");
        animals.add("dog");
        animals.add("elephant");
        animals.add("elephant");

        // print HashSet
        System.out.println(animals);
    }
}