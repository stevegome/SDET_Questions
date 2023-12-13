

public class Test {

    public static void main(String[] args) {
        /*String total = "$6.10";
        float newTotal = Float.parseFloat(total.replace("$", ""));
        System.out.println(newTotal);

        String text = "Available from 12:01 AM - 11:49 PM";
        String[] newText = text.split("from");
        System.out.println(newText[0]);
        String newTextOne = text.substring(text.indexOf("from"));
        System.out.println(newTextOne);*/
        TestGame game = new TestGame();
        game.start();
        game.stop();
        game.haveFun();

    }
}
