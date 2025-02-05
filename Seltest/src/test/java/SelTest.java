import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelTest {
    @Test
    public void set () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List <WebElement> elements = driver.findElements(By.tagName("a"));
        WebElement ex = elements.get(9);
        ex.click();
    }
}
