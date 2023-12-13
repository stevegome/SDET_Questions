public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("Reverse Order of String : " + ReverseWords.reversedString(
                "Wow this is simply amazing to see how this is done"));
        System.out.println("Reverse Order of String : " + ReverseWords.revWords(
                "Wow this is simply amazing to see how this is done"));
        if (ReverseWords.reversedString("Wow this is simply amazing to see how this is done")
                .equals(ReverseWords.revWords("Wow this is simply amazing to see how this is done"))) {
            System.out.println("The condition was successful");
        }
    }

    /***
     * This code is with using StringBuilder Class
     * @param str
     * @return
     */

    public static String revWords(String str) {
        StringBuilder reverseWords = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reverseWords.append(words[i]);
        }
        return reverseWords.toString().trim();

    }

    /***
     * 1. This code is without String builder class (Using concantenation operator)
     * @param str
     * @return
     */
    public static String reversedString(String str) {
        String[] newReverse = str.split(" ");
        String reverse = " ";

        for (int i = newReverse.length - 1; i >= 0; i--) {
            reverse = reverse + newReverse[i];
        }
        return reverse.trim();

    }


}
