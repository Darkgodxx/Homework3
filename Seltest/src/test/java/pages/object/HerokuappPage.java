package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HerokuappPage {
    private WebDriver driver;
    private By nineElement = By.tagName("a");

    public HerokuappPage(WebDriver driver) {
        this.driver = driver;
    }

    public void HerokuappElement() {
        WebElement ex = driver.findElements(nineElement).get(9);
        ex.click();
    }
}
