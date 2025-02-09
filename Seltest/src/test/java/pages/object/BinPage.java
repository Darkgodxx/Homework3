package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BinPage {
    private WebDriver driver;
    private By quantity = By.cssSelector("span.quantity");

    public BinPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getQuantity() {
        return driver.findElement(quantity).getText();
    }
}
