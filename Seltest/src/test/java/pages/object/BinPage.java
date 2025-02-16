package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BinPage {
    private WebDriver driver;
    private By quantity = By.cssSelector("span.quantity");
    private By redDuck = By.cssSelector("[class=\"link\"][title=\"Red Duck\"]");
    private By cardProduct = By.cssSelector("[name=\"add_cart_product\"]");

    public BinPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getIntQuantity() {
        return Integer.parseInt(driver.findElement(quantity).getText());
    }
    public By getQuantity() {
        return quantity;
    }
    public void getRedDuck() {
        driver.findElement(redDuck).click();
    }
    public void getcardProduct() {
        driver.findElement(cardProduct).click();
    }
}
