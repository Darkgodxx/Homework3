package pages.object.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.object.HerokuappPage;


public class SelTest {
    @Test
    public void FindNineElementTest() {
        WebDriver driver = new ChromeDriver();
        HerokuappPage herokuappPage = new HerokuappPage(driver);
        driver.get("https://the-internet.herokuapp.com/");
        herokuappPage.HerokuappElement();
    }
}
