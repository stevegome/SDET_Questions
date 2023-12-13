public class TestSample {
    public static void main(String args[]) {
        String s1 = "some string";
        //s1.toLowerCase();
        String s2 = "some OtHer stringy";
        //s2.toLowerCase();

        for (char c : s1.toCharArray()) {
            for (char d : s2.toCharArray()) {
                if (c == d) {
                    s2 = s2.replace(d, ';');

                }
            }
        }
        s2 = s2.replaceAll(";", "");
        System.out.println("Common characters are " + s2);
    }
}
