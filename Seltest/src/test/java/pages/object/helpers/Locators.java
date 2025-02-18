package pages.object.helpers;
import java.io.InputStream;
import java.util.Properties;

public class Locators {
    private static Properties props = new Properties();

    static {
        InputStream is = Locators.class.getResourceAsStream("/environmentData.properties");

        try {
            props.load(is);
        } catch (Exception e) {
            System.out.println("Couldn't load property file: " + e.getMessage());
        }}
        public static String getLocator(String element){
            String locator = props.getProperty(element);
    return locator;
    }

}
