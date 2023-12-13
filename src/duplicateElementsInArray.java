import java.util.HashSet;
import java.util.Set;

public class duplicateElementsInArray {
    public static void main(String[] args) {
        int values[] = {2, 1, 4, 7, 2, 9, 4, 12, 3, 4};
        //String alphavalue[] = {"ab", "cd", "ab", "de", "cd"};
        System.out.println("Duplicates in an array using brute force are : " + findDuplicatesUsingBruteForce(values));
        //getDuplicates(alphavalue);

    }

    public static HashSet<Integer> findDuplicatesUsingBruteForce(int[] values) {
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            for (int j = 1; j < values.length; j++) {

                if (values[i] != values[j]) {
                    duplicates.add(values[i]);
                    break;
                }
            }
        }
        return duplicates;
    }

    public static <T extends Comparable<T>> void getDuplicates(T[] aplhavalue) {
        Set<T> dupes = new HashSet<T>();
        for (T i : aplhavalue) {
            if (!dupes.add(i)) {
                System.out.println("Duplicate element in array is : " + i);
            }
        }
    }

}

