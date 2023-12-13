public class RemoveJunkFromString {
    public static void main(String[] args) {
        String s = "Tester@#@$ @#$$ Stevan (^&$&^$$ Gomes @#@#@#@$ SDET ENGINEER";
        String removed = s.replaceAll("[^ a-zA-Z0-9]", "");
        System.out.println("Corrected String is : " + removed);
    }
}
