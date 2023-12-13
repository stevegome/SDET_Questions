import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public static void main  (String [] args) throws IOException {
        String rightDirectory = System.getProperty("user.dir");
        FileInputStream stream = new FileInputStream(rightDirectory+"/StevanTest.properties");
        Properties prop = new Properties();
        prop.load(stream);
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");
        String ccId = prop.getProperty("creditCardId");
        System.out.println("Below Values are printed---------------------------->");
        System.out.println(username +" " +password + " " +ccId);

    }
}
