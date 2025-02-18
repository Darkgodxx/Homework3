package pages.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {
    private WebDriver driver;
    private By price = By.cssSelector("[itemprop=\"offers\"]");
    private By stockStatus = By.cssSelector("[class=\"stock-available\"]");
    private By deliveryStatus = By.cssSelector("[class=\"stock-delivery\"]");
    private By purpleDuck = By.cssSelector("[class=\"link\"][title=\"Purple Duck\"]");
    private By blueDuck = By.cssSelector("[class=\"link\"][title=\"Blue Duck\"]");

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPrice() {
        return driver.findElement(price).getText();
    }

    public String getStockStatus() {
        return driver.findElement(stockStatus).getText();
    }

    public String getDeliveryStatus() {
        return driver.findElement(deliveryStatus).getText();
    }

    public void getPurpleDuck() {
        driver.findElement(purpleDuck).click();
    }

    public void getBlueDuck() {
        driver.findElement(blueDuck).click();
    }
}
