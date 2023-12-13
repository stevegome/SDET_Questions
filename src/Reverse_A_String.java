public class Reverse_A_String {

    public static void main(String[] args) {
        System.out.println(reverseStringUsingCharAt());
        System.out.println(reverseStringUsingCharToArray());
        System.out.println(reverseStringUsingStringBufferClass());

    }

    public static String reverseStringUsingCharAt() {
        String properSequence = "TestAllianceRenew";
        String reverseString = "";

        for (int i = properSequence.length() - 1; i >= 0; i--) {
            reverseString = reverseString + properSequence.charAt(i);
        }

        return reverseString;
    }

    public static String reverseStringUsingCharToArray() {
        String properSequence = "TestAllianceRenew";
        String reverseString = "";
        char newString[] = properSequence.toCharArray();
        int length = newString.length;
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + properSequence.charAt(i);
        }
        return reverseString;
    }

    public static String reverseStringUsingStringBufferClass() {
        String properSequence = "TestAllianceRenew";
        String reverseString = "";
        StringBuffer buffer = new StringBuffer(properSequence);
        reverseString = String.valueOf(buffer.reverse());
        return reverseString;
    }

}
